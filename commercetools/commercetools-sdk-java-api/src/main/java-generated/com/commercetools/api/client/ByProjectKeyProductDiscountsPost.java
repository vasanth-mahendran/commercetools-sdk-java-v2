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

/**
*  <p>Create ProductDiscount</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductDiscountsPost extends ApiMethod<ByProjectKeyProductDiscountsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft;

    public ByProjectKeyProductDiscountsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productDiscountDraft = productDiscountDraft;
    }

    public ByProjectKeyProductDiscountsPost(ByProjectKeyProductDiscountsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productDiscountDraft = t.productDiscountDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productDiscountDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product_discount.ProductDiscount.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyProductDiscountsPost withExpand(final String expand){
        return new ByProjectKeyProductDiscountsPost(this).addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyProductDiscountsPost copy()
    {
        return new ByProjectKeyProductDiscountsPost(this);
    }
}
