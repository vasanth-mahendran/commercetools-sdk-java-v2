
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreReference storeReference = StoreReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreReferenceImpl.class)
public interface StoreReference extends Reference, com.commercetools.api.models.Identifiable<Store> {

    String STORE = "store";

    /**
     *  <p>Contains the representation of the expanded Store. Only present in responses to requests with Reference Expansion for Stores.</p>
     */
    @Valid
    @JsonProperty("obj")
    public Store getObj();

    /**
     *  <p>Unique ID of the referenced Store.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Store obj);

    public void setId(final String id);

    public static StoreReference of() {
        return new StoreReferenceImpl();
    }

    public static StoreReference of(final StoreReference template) {
        StoreReferenceImpl instance = new StoreReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static StoreReferenceBuilder builder() {
        return StoreReferenceBuilder.of();
    }

    public static StoreReferenceBuilder builder(final StoreReference template) {
        return StoreReferenceBuilder.of(template);
    }

    default <T> T withStoreReference(Function<StoreReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreReference>() {
            @Override
            public String toString() {
                return "TypeReference<StoreReference>";
            }
        };
    }
}
