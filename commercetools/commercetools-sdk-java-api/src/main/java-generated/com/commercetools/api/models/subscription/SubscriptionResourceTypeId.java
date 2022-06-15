
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Supported resource type identifiers:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SubscriptionResourceTypeId {

    /**
    	<p>Changes to <a href="ctp:api:type:Cart">Carts</a>.</p>

    */
    SubscriptionResourceTypeId CART = SubscriptionResourceTypeIdEnum.CART;
    /**
    	<p>Changes to <a href="ctp:api:type:CartDiscount">CartDiscounts</a>.</p>

    */
    SubscriptionResourceTypeId CART_DISCOUNT = SubscriptionResourceTypeIdEnum.CART_DISCOUNT;
    /**
    	<p>Changes to <a href="ctp:api:type:Category">Categories</a>.</p>

    */
    SubscriptionResourceTypeId CATEGORY = SubscriptionResourceTypeIdEnum.CATEGORY;
    /**
    	<p>Changes to <a href="ctp:api:type:Channel">Channels</a>.</p>

    */
    SubscriptionResourceTypeId CHANNEL = SubscriptionResourceTypeIdEnum.CHANNEL;
    /**
    	<p>Changes to <a href="ctp:api:type:Customer">Customers</a>.</p>

    */
    SubscriptionResourceTypeId CUSTOMER = SubscriptionResourceTypeIdEnum.CUSTOMER;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomerToken">CustomerTokens</a>.</p>

    */
    SubscriptionResourceTypeId CUSTOMER_EMAIL_TOKEN = SubscriptionResourceTypeIdEnum.CUSTOMER_EMAIL_TOKEN;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomerGroup">CustomerGroups</a>.</p>

    */
    SubscriptionResourceTypeId CUSTOMER_GROUP = SubscriptionResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomerToken">CustomerTokens</a>.</p>

    */
    SubscriptionResourceTypeId CUSTOMER_PASSWORD_TOKEN = SubscriptionResourceTypeIdEnum.CUSTOMER_PASSWORD_TOKEN;
    /**
    	<p>Changes to <a href="ctp:api:type:DiscountCode">DiscountCodes</a>.</p>

    */
    SubscriptionResourceTypeId DISCOUNT_CODE = SubscriptionResourceTypeIdEnum.DISCOUNT_CODE;
    /**
    	<p>Changes to <a href="ctp:api:type:Extension">Extensions</a>.</p>

    */
    SubscriptionResourceTypeId EXTENSION = SubscriptionResourceTypeIdEnum.EXTENSION;
    /**
    	<p>Changes to <a href="ctp:api:type:InventoryEntry">InventoryEntries</a>.</p>

    */
    SubscriptionResourceTypeId INVENTORY_ENTRY = SubscriptionResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    	<p>Changes to <a href="ctp:api:type:CustomObject">CustomObjects</a>.</p>

    */
    SubscriptionResourceTypeId KEY_VALUE_DOCUMENT = SubscriptionResourceTypeIdEnum.KEY_VALUE_DOCUMENT;
    /**
    	<p>Changes to <a href="ctp:api:type:Order">Orders</a>. Changes to Orders via <a href="/../api/projects/order-edits">Order Edits</a> do not trigger a Message. To achieve this, a <a href="ctp:api:type:MessageSubscription">MessageSubscription</a> to <a href="/../api/message-types#ordereditappliedmessage">OrderEditAppliedMessage</a> is necessary.</p>

    */
    SubscriptionResourceTypeId ORDER = SubscriptionResourceTypeIdEnum.ORDER;
    /**
    	<p>Changes to <a href="ctp:api:type:OrderEdit">OrderEdits</a>.</p>

    */
    SubscriptionResourceTypeId ORDER_EDIT = SubscriptionResourceTypeIdEnum.ORDER_EDIT;
    /**
    	<p>Changes to <a href="ctp:api:type:Payment">Payments</a>.</p>

    */
    SubscriptionResourceTypeId PAYMENT = SubscriptionResourceTypeIdEnum.PAYMENT;
    /**
    	<p>Changes to <a href="ctp:api:type:Product">Products</a>.</p>

    */
    SubscriptionResourceTypeId PRODUCT = SubscriptionResourceTypeIdEnum.PRODUCT;
    /**
    	<p>Changes to <a href="ctp:api:type:ProductDiscount">ProductDiscount</a>.</p>

    */
    SubscriptionResourceTypeId PRODUCT_DISCOUNT = SubscriptionResourceTypeIdEnum.PRODUCT_DISCOUNT;
    /**
    	<p>Changes to <a href="ctp:api:type:ProductSelection">ProductSelections</a>.</p>

    */
    SubscriptionResourceTypeId PRODUCT_SELECTION = SubscriptionResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    	<p>Changes to <a href="ctp:api:type:ProductType">ProductTypes</a>.</p>

    */
    SubscriptionResourceTypeId PRODUCT_TYPE = SubscriptionResourceTypeIdEnum.PRODUCT_TYPE;
    /**
    	<p>Changes to <a href="ctp:api:type:Review">Reviews</a>.</p>

    */
    SubscriptionResourceTypeId REVIEW = SubscriptionResourceTypeIdEnum.REVIEW;
    /**
    	<p>Changes to <a href="ctp:api:type:ShippingMethod">ShippingMethods</a>.</p>

    */
    SubscriptionResourceTypeId SHIPPING_METHOD = SubscriptionResourceTypeIdEnum.SHIPPING_METHOD;
    /**
    	<p>Changes to <a href="ctp:api:type:ShoppingList">ShoppingLists</a>.</p>

    */
    SubscriptionResourceTypeId SHOPPING_LIST = SubscriptionResourceTypeIdEnum.SHOPPING_LIST;
    /**
    	<p>Changes to <a href="ctp:api:type:State">States</a>.</p>

    */
    SubscriptionResourceTypeId STATE = SubscriptionResourceTypeIdEnum.STATE;
    /**
    	<p>Changes to <a href="ctp:api:type:Store">Stores</a>.</p>

    */
    SubscriptionResourceTypeId STORE = SubscriptionResourceTypeIdEnum.STORE;
    /**
    	<p>Changes to <a href="ctp:api:type:Subscription">Subscriptions</a>.</p>

    */
    SubscriptionResourceTypeId SUBSCRIPTION = SubscriptionResourceTypeIdEnum.SUBSCRIPTION;
    /**
    	<p>Changes to <a href="ctp:api:type:TaxCategory">TaxCategories</a>.</p>

    */
    SubscriptionResourceTypeId TAX_CATEGORY = SubscriptionResourceTypeIdEnum.TAX_CATEGORY;
    /**
    	<p>Changes to <a href="ctp:api:type:Type">Types</a>.</p>

    */
    SubscriptionResourceTypeId TYPE = SubscriptionResourceTypeIdEnum.TYPE;
    /**
    	<p>Changes to <a href="ctp:api:type:Zone">Zones</a>.</p>

    */
    SubscriptionResourceTypeId ZONE = SubscriptionResourceTypeIdEnum.ZONE;

    enum SubscriptionResourceTypeIdEnum implements SubscriptionResourceTypeId {
        CART("cart"),

        CART_DISCOUNT("cart-discount"),

        CATEGORY("category"),

        CHANNEL("channel"),

        CUSTOMER("customer"),

        CUSTOMER_EMAIL_TOKEN("customer-email-token"),

        CUSTOMER_GROUP("customer-group"),

        CUSTOMER_PASSWORD_TOKEN("customer-password-token"),

        DISCOUNT_CODE("discount-code"),

        EXTENSION("extension"),

        INVENTORY_ENTRY("inventory-entry"),

        KEY_VALUE_DOCUMENT("key-value-document"),

        ORDER("order"),

        ORDER_EDIT("order-edit"),

        PAYMENT("payment"),

        PRODUCT("product"),

        PRODUCT_DISCOUNT("product-discount"),

        PRODUCT_SELECTION("product-selection"),

        PRODUCT_TYPE("product-type"),

        REVIEW("review"),

        SHIPPING_METHOD("shipping-method"),

        SHOPPING_LIST("shopping-list"),

        STATE("state"),

        STORE("store"),

        SUBSCRIPTION("subscription"),

        TAX_CATEGORY("tax-category"),

        TYPE("type"),

        ZONE("zone");
        private final String jsonName;

        private SubscriptionResourceTypeIdEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static SubscriptionResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SubscriptionResourceTypeId() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<SubscriptionResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static SubscriptionResourceTypeId[] values() {
        return SubscriptionResourceTypeIdEnum.values();
    }
}
