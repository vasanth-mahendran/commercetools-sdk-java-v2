
package com.commercetools.migration;

import java.io.IOException;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public interface MigrateV2Example {
    void v2() throws IOException;

    default ByProjectKeyRequestBuilder projectClient() {
        return ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .buildForProject("projectKey");
    }
}
