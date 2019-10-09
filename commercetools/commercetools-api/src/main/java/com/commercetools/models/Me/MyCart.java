package com.commercetools.models.me;

import com.commercetools.models.cart.CartOrigin;
import com.commercetools.models.cart.CartState;
import com.commercetools.models.cart.CustomLineItem;
import com.commercetools.models.cart.DiscountCodeInfo;
import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.LineItem;
import com.commercetools.models.cart.RoundingMode;
import com.commercetools.models.cart.ShippingInfo;
import com.commercetools.models.cart.ShippingRateInput;
import com.commercetools.models.cart.TaxCalculationMode;
import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.cart.TaxedPrice;
import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.common.Address;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.order.PaymentInfo;
import com.commercetools.models.store.StoreKeyReference;
import com.commercetools.models.type.CustomFields;
import com.commercetools.models.me.MyCartImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCartImpl.class)
public interface MyCart extends LoggedResource {

   
   
   @JsonProperty("customerId")
   public String getCustomerId();
   
   
   @JsonProperty("customerEmail")
   public String getCustomerEmail();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   @Valid
   @JsonProperty("store")
   public StoreKeyReference getStore();
   
   @NotNull
   @Valid
   @JsonProperty("lineItems")
   public List<LineItem> getLineItems();
   
   @NotNull
   @Valid
   @JsonProperty("customLineItems")
   public List<CustomLineItem> getCustomLineItems();
   
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public TypedMoney getTotalPrice();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedPrice getTaxedPrice();
   
   @NotNull
   @JsonProperty("cartState")
   public CartState getCartState();
   
   @Valid
   @JsonProperty("shippingAddress")
   public Address getShippingAddress();
   
   @Valid
   @JsonProperty("billingAddress")
   public Address getBillingAddress();
   
   
   @JsonProperty("inventoryMode")
   public InventoryMode getInventoryMode();
   
   @NotNull
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();
   
   @NotNull
   @JsonProperty("taxRoundingMode")
   public RoundingMode getTaxRoundingMode();
   
   @NotNull
   @JsonProperty("taxCalculationMode")
   public TaxCalculationMode getTaxCalculationMode();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();
   
   @Valid
   @JsonProperty("shippingInfo")
   public ShippingInfo getShippingInfo();
   
   @Valid
   @JsonProperty("discountCodes")
   public List<DiscountCodeInfo> getDiscountCodes();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @Valid
   @JsonProperty("paymentInfo")
   public PaymentInfo getPaymentInfo();
   
   
   @JsonProperty("locale")
   public String getLocale();
   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Integer getDeleteDaysAfterLastModification();
   
   @NotNull
   @Valid
   @JsonProperty("refusedGifts")
   public List<CartDiscountReference> getRefusedGifts();
   
   @NotNull
   @JsonProperty("origin")
   public CartOrigin getOrigin();
   
   @Valid
   @JsonProperty("shippingRateInput")
   public ShippingRateInput getShippingRateInput();
   
   @Valid
   @JsonProperty("itemShippingAddresses")
   public List<Address> getItemShippingAddresses();

   public void setCustomerId(final String customerId);
   
   public void setCustomerEmail(final String customerEmail);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setStore(final StoreKeyReference store);
   
   public void setLineItems(final List<LineItem> lineItems);
   
   public void setCustomLineItems(final List<CustomLineItem> customLineItems);
   
   public void setTotalPrice(final TypedMoney totalPrice);
   
   public void setTaxedPrice(final TaxedPrice taxedPrice);
   
   public void setCartState(final CartState cartState);
   
   public void setShippingAddress(final Address shippingAddress);
   
   public void setBillingAddress(final Address billingAddress);
   
   public void setInventoryMode(final InventoryMode inventoryMode);
   
   public void setTaxMode(final TaxMode taxMode);
   
   public void setTaxRoundingMode(final RoundingMode taxRoundingMode);
   
   public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setCountry(final String country);
   
   public void setShippingInfo(final ShippingInfo shippingInfo);
   
   public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);
   
   public void setCustom(final CustomFields custom);
   
   public void setPaymentInfo(final PaymentInfo paymentInfo);
   
   public void setLocale(final String locale);
   
   public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);
   
   public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);
   
   public void setOrigin(final CartOrigin origin);
   
   public void setShippingRateInput(final ShippingRateInput shippingRateInput);
   
   public void setItemShippingAddresses(final List<Address> itemShippingAddresses);
   
   public static MyCartImpl of(){
      return new MyCartImpl();
   }
   

   public static MyCartImpl of(final MyCart template) {
      MyCartImpl instance = new MyCartImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCountry(template.getCountry());
      instance.setTotalPrice(template.getTotalPrice());
      instance.setShippingRateInput(template.getShippingRateInput());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setOrigin(template.getOrigin());
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      instance.setShippingInfo(template.getShippingInfo());
      instance.setRefusedGifts(template.getRefusedGifts());
      instance.setLocale(template.getLocale());
      instance.setInventoryMode(template.getInventoryMode());
      instance.setLineItems(template.getLineItems());
      instance.setCustomLineItems(template.getCustomLineItems());
      instance.setItemShippingAddresses(template.getItemShippingAddresses());
      instance.setCustomerEmail(template.getCustomerEmail());
      instance.setCartState(template.getCartState());
      instance.setCustomerId(template.getCustomerId());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setDiscountCodes(template.getDiscountCodes());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCustom(template.getCustom());
      instance.setTaxCalculationMode(template.getTaxCalculationMode());
      instance.setStore(template.getStore());
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      instance.setTaxMode(template.getTaxMode());
      instance.setShippingAddress(template.getShippingAddress());
      instance.setBillingAddress(template.getBillingAddress());
      instance.setPaymentInfo(template.getPaymentInfo());
      return instance;
   }

}