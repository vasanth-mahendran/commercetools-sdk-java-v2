
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.importoperations.ImportOperationStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A list of the ID's and validation statuses of newly created ImportOperations. Used as a response at each resource-specific import endpoint, for example, at Import Categories and Import ProductTypes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportResponse importResponse = ImportResponse.builder()
 *             .plusOperationStatus(operationStatusBuilder -> operationStatusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportResponseImpl.class)
public interface ImportResponse {

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("operationStatus")
    public List<ImportOperationStatus> getOperationStatus();

    @JsonIgnore
    public void setOperationStatus(final ImportOperationStatus... operationStatus);

    public void setOperationStatus(final List<ImportOperationStatus> operationStatus);

    public static ImportResponse of() {
        return new ImportResponseImpl();
    }

    public static ImportResponse of(final ImportResponse template) {
        ImportResponseImpl instance = new ImportResponseImpl();
        instance.setOperationStatus(template.getOperationStatus());
        return instance;
    }

    public static ImportResponseBuilder builder() {
        return ImportResponseBuilder.of();
    }

    public static ImportResponseBuilder builder(final ImportResponse template) {
        return ImportResponseBuilder.of(template);
    }

    default <T> T withImportResponse(Function<ImportResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImportResponse>";
            }
        };
    }
}
