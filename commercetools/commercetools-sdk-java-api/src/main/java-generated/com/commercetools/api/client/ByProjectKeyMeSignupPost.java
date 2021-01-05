package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeSignupPost extends ApiMethod<ByProjectKeyMeSignupPost, com.commercetools.api.models.customer.CustomerSignInResult> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeSignupPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeSignupPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft;

    public ByProjectKeyMeSignupPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerDraft = myCustomerDraft;
    }

    public ByProjectKeyMeSignupPost(ByProjectKeyMeSignupPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerDraft = t.myCustomerDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/signup", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myCustomerDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    
    @Override
    protected ByProjectKeyMeSignupPost copy()
    {
        return new ByProjectKeyMeSignupPost(this);
    }
}
