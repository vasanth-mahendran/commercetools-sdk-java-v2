
package test;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientBuilder;

public class ApiHttpClientLocator {
    public ApiHttpClient createClient() {
        return ClientBuilder.of().build();
    }
}
