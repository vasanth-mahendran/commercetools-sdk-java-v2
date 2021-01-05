package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import java.time.ZonedDateTime;
import com.commercetools.api.models.error.DiscountCodeNonApplicableErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeNonApplicableErrorImpl.class)
public interface DiscountCodeNonApplicableError extends ErrorObject {

    
    
    @JsonProperty("discountCode")
    public String getDiscountCode();
    
    
    @JsonProperty("reason")
    public String getReason();
    
    
    @JsonProperty("dicountCodeId")
    public String getDicountCodeId();
    
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();
    
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();
    
    
    @JsonProperty("validityCheckTime")
    public ZonedDateTime getValidityCheckTime();

    public void setDiscountCode(final String discountCode);
    
    public void setReason(final String reason);
    
    public void setDicountCodeId(final String dicountCodeId);
    
    public void setValidFrom(final ZonedDateTime validFrom);
    
    public void setValidUntil(final ZonedDateTime validUntil);
    
    public void setValidityCheckTime(final ZonedDateTime validityCheckTime);

    public static DiscountCodeNonApplicableError of(){
        return new DiscountCodeNonApplicableErrorImpl();
    }
    

    public static DiscountCodeNonApplicableError of(final DiscountCodeNonApplicableError template) {
        DiscountCodeNonApplicableErrorImpl instance = new DiscountCodeNonApplicableErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setDiscountCode(template.getDiscountCode());
        instance.setReason(template.getReason());
        instance.setDicountCodeId(template.getDicountCodeId());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setValidityCheckTime(template.getValidityCheckTime());
        return instance;
    }

    public static DiscountCodeNonApplicableErrorBuilder builder(){
        return DiscountCodeNonApplicableErrorBuilder.of();
    }
    
    public static DiscountCodeNonApplicableErrorBuilder builder(final DiscountCodeNonApplicableError template){
        return DiscountCodeNonApplicableErrorBuilder.of(template);
    }
    

    default <T> T withDiscountCodeNonApplicableError(Function<DiscountCodeNonApplicableError, T> helper) {
        return helper.apply(this);
    }
}
