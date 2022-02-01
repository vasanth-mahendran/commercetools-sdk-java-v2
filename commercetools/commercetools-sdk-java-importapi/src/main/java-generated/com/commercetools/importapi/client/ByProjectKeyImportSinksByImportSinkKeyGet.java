
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Retrieves the import sink given by the key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSinksByImportSinkKeyGet extends
        ApiMethod<ByProjectKeyImportSinksByImportSinkKeyGet, com.commercetools.importapi.models.importsinks.ImportSink>
        implements
        com.commercetools.importapi.client.Secured_by_view_import_sinksTrait<ByProjectKeyImportSinksByImportSinkKeyGet> {

    private String projectKey;
    private String importSinkKey;

    public ByProjectKeyImportSinksByImportSinkKeyGet(final ApiHttpClient apiHttpClient, String projectKey,
            String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyImportSinksByImportSinkKeyGet(ByProjectKeyImportSinksByImportSinkKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-sinks/%s", this.projectKey, this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importsinks.ImportSink.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importsinks.ImportSink.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportSinksByImportSinkKeyGet that = (ByProjectKeyImportSinksByImportSinkKeyGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImportSinksByImportSinkKeyGet copy() {
        return new ByProjectKeyImportSinksByImportSinkKeyGet(this);
    }
}
