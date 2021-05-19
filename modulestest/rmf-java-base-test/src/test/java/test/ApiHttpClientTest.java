
package test;

import io.vrap.rmf.base.client.ApiHttpClient;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ApiHttpClientTest {
    @Test
    public void create() {
        ApiHttpClient client = new ApiHttpClientLocator().createClient();
        Assertions.assertThat(client).isInstanceOf(ApiHttpClient.class);
    }
}
