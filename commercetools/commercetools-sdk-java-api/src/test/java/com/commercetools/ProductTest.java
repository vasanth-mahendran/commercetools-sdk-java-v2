
package com.commercetools;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.LocalizedStringBuilder;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    private ProductDraftBuilder productDraftOfVariants(List<ProductVariantDraft> variants) {
        return ProductDraftBuilder.of()
                .masterVariant(variants.stream().findFirst().orElse(null))
                .variants(variants.stream().skip(1).collect(Collectors.toList()));
    }

    @Test
    public void draft() {
        List<ProductVariantDraft> variantDrafts = Arrays.asList(ProductVariantDraftBuilder.of().sku("abc").build(),
            ProductVariantDraftBuilder.of().sku("def").build());
        ProductDraft draft = productDraftOfVariants(variantDrafts)
                .productType(ProductTypeResourceIdentifierBuilder.of().build())
                .name(LocalizedStringBuilder.of().addValue("en", "foo").build())
                .slug(LocalizedStringBuilder.of().addValue("en", "foo").build())
                .build();

        Assertions.assertThat(draft.getMasterVariant().getSku()).isEqualTo("abc");
        Assertions.assertThat(draft.getVariants()).hasSize(1);
        Assertions.assertThat(draft.getVariants().get(0).getSku()).isEqualTo("def");
    }

    @Test
    public void serializeProduct() throws JsonProcessingException {
        final ProductProjection productProjection = ProductProjection.builder()
                .masterVariant(b -> b.sku("foo").id(1L))
                .plusVariants(b -> b.sku("bar").id(2L))
                .buildUnchecked();

        Assertions.assertThat(JsonUtils.toJsonString(productProjection))
                .isEqualTo("{\"masterVariant\":{\"id\":1,\"sku\":\"foo\"},\"variants\":[{\"id\":2,\"sku\":\"bar\"}]}");
    }
}
