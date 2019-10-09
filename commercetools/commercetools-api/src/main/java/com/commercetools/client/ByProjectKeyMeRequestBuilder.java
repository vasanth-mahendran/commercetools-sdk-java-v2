package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMeRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeGet get() {
      return new ByProjectKeyMeGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMePost post(com.commercetools.models.common.Update update) {
      return new ByProjectKeyMePost(apiHttpClient, projectKey, update);
   }
   
   public ByProjectKeyMeDelete delete() {
      return new ByProjectKeyMeDelete(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMeEmailRequestBuilder email() {
      return new ByProjectKeyMeEmailRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMePasswordRequestBuilder password() {
      return new ByProjectKeyMePasswordRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMeSignupRequestBuilder signup() {
      return new ByProjectKeyMeSignupRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMeLoginRequestBuilder login() {
      return new ByProjectKeyMeLoginRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMeActiveCartRequestBuilder activeCart() {
      return new ByProjectKeyMeActiveCartRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMeCartsRequestBuilder carts() {
      return new ByProjectKeyMeCartsRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMeOrdersRequestBuilder orders() {
      return new ByProjectKeyMeOrdersRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMePaymentsRequestBuilder payments() {
      return new ByProjectKeyMePaymentsRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMeShoppingListsRequestBuilder shoppingLists() {
      return new ByProjectKeyMeShoppingListsRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyMePaymentRequestBuilder payment() {
      return new ByProjectKeyMePaymentRequestBuilder(apiHttpClient, projectKey);
   }
}
