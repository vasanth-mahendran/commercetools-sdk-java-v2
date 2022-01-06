
package com.commercetools.importapi.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.importapi.client.ApiRoot;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @TestTemplate
    @UseDataProvider("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    @DataProvider
    public static Object[][] requestWithMethodParameters() {
        return new Object[][] { new Object[] {
                apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get()
                        .withLimit(0.26748633)
                        .createHttpRequest(),
                "get",
                "/test_projectKey/product-variant-patches/importSinkKey=test_importSinkKey/import-operations?limit=0.26748633", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .productVariantPatches()
                                .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                                .importOperations()
                                .get()
                                .withOffset(0.7475848)
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-variant-patches/importSinkKey=test_importSinkKey/import-operations?offset=0.7475848", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .productVariantPatches()
                                .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                                .importOperations()
                                .get()
                                .withSort("sort")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-variant-patches/importSinkKey=test_importSinkKey/import-operations?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .productVariantPatches()
                                .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                                .importOperations()
                                .get()
                                .withResourceKey("resourceKey")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-variant-patches/importSinkKey=test_importSinkKey/import-operations?resourceKey=resourceKey", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .productVariantPatches()
                                .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                                .importOperations()
                                .get()
                                .withState(com.commercetools.importapi.models.common.ProcessingState.findEnum("state"))
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-variant-patches/importSinkKey=test_importSinkKey/import-operations?state=state", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .productVariantPatches()
                                .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                                .importOperations()
                                .get()
                                .withDebug(true)
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-variant-patches/importSinkKey=test_importSinkKey/import-operations?debug=true", },
                new Object[] {
                        apiRoot.withProjectKeyValue("test_projectKey")
                                .productVariantPatches()
                                .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                                .importOperations()
                                .get()
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-variant-patches/importSinkKey=test_importSinkKey/import-operations", } };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get()
                        .withLimit(0.26748633), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get()
                        .withOffset(0.7475848), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get()
                        .withSort("sort"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get()
                        .withResourceKey("resourceKey"), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get()
                        .withState(com.commercetools.importapi.models.common.ProcessingState.findEnum("state")), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get()
                        .withDebug(true), },
                new Object[] { apiRoot.withProjectKeyValue("test_projectKey")
                        .productVariantPatches()
                        .importSinkKeyWithImportSinkKeyValue("test_importSinkKey")
                        .importOperations()
                        .get(), } };
    }
}
