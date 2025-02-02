
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.prices.PriceImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The request body to import Prices. Contains data for EmbeddedPrices to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceImportRequest priceImportRequest = PriceImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceImportRequestImpl.class)
public interface PriceImportRequest extends ImportRequest {

    String PRICE = "price";

    /**
     *  <p>The price import resources of this request.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<PriceImport> getResources();

    @JsonIgnore
    public void setResources(final PriceImport... resources);

    public void setResources(final List<PriceImport> resources);

    public static PriceImportRequest of() {
        return new PriceImportRequestImpl();
    }

    public static PriceImportRequest of(final PriceImportRequest template) {
        PriceImportRequestImpl instance = new PriceImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static PriceImportRequestBuilder builder() {
        return PriceImportRequestBuilder.of();
    }

    public static PriceImportRequestBuilder builder(final PriceImportRequest template) {
        return PriceImportRequestBuilder.of(template);
    }

    default <T> T withPriceImportRequest(Function<PriceImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PriceImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<PriceImportRequest>";
            }
        };
    }
}
