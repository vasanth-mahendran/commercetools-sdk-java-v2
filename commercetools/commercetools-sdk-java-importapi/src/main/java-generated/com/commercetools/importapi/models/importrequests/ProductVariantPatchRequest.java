package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>An import request for multiple product variant patch resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantPatchRequestImpl.class)
public interface ProductVariantPatchRequest extends ImportRequest {

    /**
    *  <p>The product variant patches of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("patches")
    public List<ProductVariantPatch> getPatches();

    public void setPatches(final List<ProductVariantPatch> patches);

    public static ProductVariantPatchRequestImpl of(){
        return new ProductVariantPatchRequestImpl();
    }
    

    public static ProductVariantPatchRequestImpl of(final ProductVariantPatchRequest template) {
        ProductVariantPatchRequestImpl instance = new ProductVariantPatchRequestImpl();
        instance.setPatches(template.getPatches());
        return instance;
    }

    default <T> T withProductVariantPatchRequest(Function<ProductVariantPatchRequest, T> helper) {
        return helper.apply(this);
    }
}
