
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMissingDataAttributesStatusByTaskIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String taskId;

    public ByProjectKeyMissingDataAttributesStatusByTaskIdRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String taskId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.taskId = taskId;
    }

    public ByProjectKeyMissingDataAttributesStatusByTaskIdGet get() {
        return new ByProjectKeyMissingDataAttributesStatusByTaskIdGet(apiHttpClient, projectKey, taskId);
    }

}
