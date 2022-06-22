
package com.commercetools.api.models.product_selection;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The following type of Product Variant Selections is supported:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductVariantSelectionTypeEnum {

    /**
    	<p>Only Product Variants with explicitely stated SKUs are part of the Product Selection.</p>

    */
    ProductVariantSelectionTypeEnum INCLUSION = ProductVariantSelectionTypeEnumEnum.INCLUSION;
    /**
    	<p>All Product Variants but ones explicitely stated are part of the Product Selection.</p>

    */
    ProductVariantSelectionTypeEnum EXCLUSION = ProductVariantSelectionTypeEnumEnum.EXCLUSION;

    enum ProductVariantSelectionTypeEnumEnum implements ProductVariantSelectionTypeEnum {
        INCLUSION("inclusion"),

        EXCLUSION("exclusion");
        private final String jsonName;

        private ProductVariantSelectionTypeEnumEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static ProductVariantSelectionTypeEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductVariantSelectionTypeEnum() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<ProductVariantSelectionTypeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ProductVariantSelectionTypeEnum[] values() {
        return ProductVariantSelectionTypeEnumEnum.values();
    }
}
