import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientBuilder;

module io.vrap.rmf.base.client.test {
    requires commercetools.sdk.base;

    uses ApiHttpClient;
    uses ClientBuilder;
}
