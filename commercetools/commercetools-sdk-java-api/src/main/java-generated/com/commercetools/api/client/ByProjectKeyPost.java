
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
*  <p>Update project</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyPost extends ApiMethod<ByProjectKeyPost, com.commercetools.api.models.project.Project>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyPost> {

    private String projectKey;

    private com.commercetools.api.models.project.ProjectUpdate projectUpdate;

    public ByProjectKeyPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.project.ProjectUpdate projectUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.projectUpdate = projectUpdate;
    }

    public ByProjectKeyPost(ByProjectKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.projectUpdate = t.projectUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(projectUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.project.Project> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.project.Project.class).toCompletableFuture(), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.project.Project>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.project.Project.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPost that = (ByProjectKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(projectUpdate, that.projectUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(projectUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyPost copy() {
        return new ByProjectKeyPost(this);
    }
}
