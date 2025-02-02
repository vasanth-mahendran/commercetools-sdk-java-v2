
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportResponseBuilder
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
public class ImportResponseBuilder implements Builder<ImportResponse> {

    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus;

    /**
     *
     */

    public ImportResponseBuilder operationStatus(
            final com.commercetools.importapi.models.importoperations.ImportOperationStatus... operationStatus) {
        this.operationStatus = new ArrayList<>(Arrays.asList(operationStatus));
        return this;
    }

    /**
     *
     */

    public ImportResponseBuilder operationStatus(
            final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     *
     */

    public ImportResponseBuilder plusOperationStatus(
            final com.commercetools.importapi.models.importoperations.ImportOperationStatus... operationStatus) {
        if (this.operationStatus == null) {
            this.operationStatus = new ArrayList<>();
        }
        this.operationStatus.addAll(Arrays.asList(operationStatus));
        return this;
    }

    /**
     *
     */

    public ImportResponseBuilder plusOperationStatus(
            Function<com.commercetools.importapi.models.importoperations.ImportOperationStatusBuilder, com.commercetools.importapi.models.importoperations.ImportOperationStatusBuilder> builder) {
        if (this.operationStatus == null) {
            this.operationStatus = new ArrayList<>();
        }
        this.operationStatus.add(
            builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationStatusBuilder.of())
                    .build());
        return this;
    }

    /**
     *
     */

    public ImportResponseBuilder withOperationStatus(
            Function<com.commercetools.importapi.models.importoperations.ImportOperationStatusBuilder, com.commercetools.importapi.models.importoperations.ImportOperationStatusBuilder> builder) {
        this.operationStatus = new ArrayList<>();
        this.operationStatus.add(
            builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationStatusBuilder.of())
                    .build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> getOperationStatus() {
        return this.operationStatus;
    }

    public ImportResponse build() {
        Objects.requireNonNull(operationStatus, ImportResponse.class + ": operationStatus is missing");
        return new ImportResponseImpl(operationStatus);
    }

    /**
     * builds ImportResponse without checking for non null required values
     */
    public ImportResponse buildUnchecked() {
        return new ImportResponseImpl(operationStatus);
    }

    public static ImportResponseBuilder of() {
        return new ImportResponseBuilder();
    }

    public static ImportResponseBuilder of(final ImportResponse template) {
        ImportResponseBuilder builder = new ImportResponseBuilder();
        builder.operationStatus = template.getOperationStatus();
        return builder;
    }

}
