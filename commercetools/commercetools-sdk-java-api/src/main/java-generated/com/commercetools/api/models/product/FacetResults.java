
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetResults
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetResults facetResults = FacetResults.builder()
 *             ./^[a-z].*$/(/^[a-z].*$/Builder -> /^[a-z].*$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FacetResultsImpl.class)
public interface FacetResults {

    /**
     *
     */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, FacetResult> values();

    @JsonAnySetter
    public void setValue(String key, FacetResult value);

    public static FacetResults of() {
        return new FacetResultsImpl();
    }

    public static FacetResults of(final FacetResults template) {
        FacetResultsImpl instance = new FacetResultsImpl();
        return instance;
    }

    public static FacetResultsBuilder builder() {
        return FacetResultsBuilder.of();
    }

    public static FacetResultsBuilder builder(final FacetResults template) {
        return FacetResultsBuilder.of(template);
    }

    default <T> T withFacetResults(Function<FacetResults, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FacetResults> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetResults>() {
            @Override
            public String toString() {
                return "TypeReference<FacetResults>";
            }
        };
    }
}
