package cleanup;

import com.commercetools.api.generated.models.api_client.ApiClientPagedQueryResponse;
import com.commercetools.api.generated.models.cart_discount.CartDiscountPagedQueryResponse;
import com.commercetools.api.generated.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.generated.models.channel.ChannelPagedQueryResponse;
import com.commercetools.api.generated.models.custom_object.CustomObjectPagedQueryResponse;
import com.commercetools.api.generated.models.customer.CustomerPagedQueryResponse;
import com.commercetools.api.generated.models.customer_group.CustomerGroupPagedQueryResponse;
import com.commercetools.api.generated.models.discount_code.DiscountCodePagedQueryResponse;
import com.commercetools.api.generated.models.extension.ExtensionPagedQueryResponse;
import com.commercetools.api.generated.models.inventory.InventoryPagedQueryResponse;
import com.commercetools.api.generated.models.product.ProductPagedQueryResponse;
import com.commercetools.api.generated.models.product_discount.ProductDiscountPagedQueryResponse;
import com.commercetools.api.generated.models.product_type.ProductTypePagedQueryResponse;
import com.commercetools.api.generated.models.review.ReviewPagedQueryResponse;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodPagedQueryResponse;
import com.commercetools.api.generated.models.shopping_list.ShoppingListPagedQueryResponse;
import com.commercetools.api.generated.models.state.StatePagedQueryResponse;
import com.commercetools.api.generated.models.store.StorePagedQueryResponse;
import com.commercetools.api.generated.models.tax_category.TaxCategoryPagedQueryResponse;
import com.commercetools.api.generated.models.type.TypePagedQueryResponse;
import com.commercetools.api.generated.models.zone.ZonePagedQueryResponse;
import commercetools.api_client.ApiClientFixtures;
import commercetools.cart_discount.CartDiscountFixtures;
import commercetools.category.CategoryFixtures;
import commercetools.channel.ChannelFixtures;
import commercetools.custom_object.CustomObjectFixtures;
import commercetools.customer.CustomerFixtures;
import commercetools.customer_group.CustomerGroupFixtures;
import commercetools.discount_code.DiscountCodeFixtures;
import commercetools.extension.ExtensionFixtures;
import commercetools.inventory.InventoryEntryFixtures;
import commercetools.product.ProductFixtures;
import commercetools.product_discount.ProductDiscountFixtures;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.review.ReviewFixtures;
import commercetools.shipping_method.ShippingMethodFixtures;
import commercetools.shopping_list.ShoppingListFixtures;
import commercetools.state.StateFixtures;
import commercetools.store.StoreFixtures;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.type.TypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.zone.ZoneFixtures;
import org.junit.Test;

/**
 * Please be careful when running these tests, as they are meant to be used as cleanup and will delete all resources in your project
 */
public class DeleteEverythingIntegrationTest {
    
    @Test
    public void execute() { 
        for(int i = 0; i < 10; i++){
            try{
                deleteAllCategories();
            }catch (Exception e){}
            try{
                deleteAllCartDiscounts();
            }catch (Exception e){}
            try{
                deleteAllInventories();
            }catch (Exception e){}
            try{
                deleteAllProducts();
            }catch (Exception e){}
            try{
                deleteAllProductDiscounts();
            }catch (Exception e){}
            try{
                deleteAllProductTypes();
            }catch (Exception e){}
            try{
                deleteAllReviews();
            }catch (Exception e){}
            try{
                deleteAllTaxCategories();
            }catch (Exception e){}
            try{
                deleteAllDiscountCodes();
            }catch (Exception e){}
            try{
                deleteAllApiClients();
            }catch (Exception e){}
            try{
                deleteAllChannels();
            }catch (Exception e){}
            try{
                deleteAllCustomObjects();
            }catch (Exception e){}
            try{
                deleteAllCustomers();
            }catch (Exception e){}
            try{
                deleteAllCustomerGroups();
            }catch (Exception e){}
            try{
                deleteAllExtensions();
            }catch (Exception e){}
            try{
                deleteAllShippingMethods();
            }catch (Exception e){}
            try{
                deleteAllShoppingLists();
            }catch (Exception e){}
            try{
                deleteAllStates();
            }catch (Exception e){}
            try{
                deleteAllStores();
            }catch (Exception e){}
            try{
                deleteAllTypes();
            }catch (Exception e){}
            try{
                deleteAllZones();
            }catch (Exception e){}
        }
    }
    
    private void deleteAllZones() {
        ZonePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .zones()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(zone -> {
                ZoneFixtures.deleteZone(zone.getId(), zone.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllTypes() {
       TypePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .types()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(type -> {
                TypeFixtures.deleteType(type.getId(), type.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllStores() {
        StorePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .stores()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(store -> {
                StoreFixtures.deleteStore(store.getId(), store.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllStates() {
        StatePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .states()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(state -> {
                StateFixtures.deleteState(state.getId(), state.getVersion());
            });
        } while (response.getResults().size() != 0);
    }

    private void deleteAllShoppingLists() {
        ShoppingListPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .shoppingLists()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(shoppingList -> {
                ShoppingListFixtures.deleteShoppingList(shoppingList.getId(), shoppingList.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllShippingMethods() {
        ShippingMethodPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .shippingMethods()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(shippingMethod -> {
                ShippingMethodFixtures.deleteShippingMethod(shippingMethod.getId(), shippingMethod.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllExtensions() {
        ExtensionPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .extensions()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(extension -> {
                ExtensionFixtures.deleteExtension(extension.getId(), extension.getVersion());
            });
        } while (response.getResults().size() != 0);
    }

    private void deleteAllCustomerGroups() {
        CustomerGroupPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customerGroups()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(customerGroup -> {
                CustomerGroupFixtures.deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllCustomers() {
        CustomerPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customers()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(customer -> {
                CustomerFixtures.deleteCustomer(customer.getId(), customer.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllCustomObjects() {
        CustomObjectPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .customObjects()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(customObject -> {
                CustomObjectFixtures.deleteCustomObject(customObject.getId(), customObject.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllChannels() {
        ChannelPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .channels()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(channel -> {
                ChannelFixtures.deleteChannel(channel.getId(), channel.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllApiClients() {
        ApiClientPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .apiClients()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(apiClient -> {
                //do not delete "main" ApiClient, otherwise we don't have a client to send integration test requests with
                if(!apiClient.getName().equals("main")){
                    ApiClientFixtures.deleteApiClient(apiClient.getId());
                }
            });
        } while (response.getResults().size() > 1);
    }
    
    private void deleteAllCategories() {
        CategoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .categories()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(category -> {
                CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllCartDiscounts() {
        CartDiscountPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .cartDiscounts()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(cartDiscount -> {
                CartDiscountFixtures.deleteCartDiscount(cartDiscount.getId(), cartDiscount.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllInventories() {
        InventoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .inventory()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(inventory -> {
                InventoryEntryFixtures.delete(inventory.getId());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllProducts() {
        ProductPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .products()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(product -> {
                ProductFixtures.deleteProductById(product.getId(), product.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllProductDiscounts() {
        ProductDiscountPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(productDiscount -> {
                ProductDiscountFixtures.deleteProductDiscount(productDiscount.getId(), productDiscount.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllProductTypes() {
        ProductTypePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productTypes()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(productType -> {
                ProductTypeFixtures.deleteProductType(productType.getId(), productType.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllReviews() {
        ReviewPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .reviews()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(review -> {
                ReviewFixtures.delete(review.getId(), review.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllTaxCategories() {
        TaxCategoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .taxCategories()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(taxCategory -> {
                TaxCategoryFixtures.deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
    
    private void deleteAllDiscountCodes() {
        DiscountCodePagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .discountCodes()
                    .get()
                    .executeBlocking().getBody();
            response.getResults().forEach(discountCode -> {
                DiscountCodeFixtures.deleteDiscountCode(discountCode.getId(), discountCode.getVersion());
            });
        } while (response.getResults().size() != 0);
    }
}
