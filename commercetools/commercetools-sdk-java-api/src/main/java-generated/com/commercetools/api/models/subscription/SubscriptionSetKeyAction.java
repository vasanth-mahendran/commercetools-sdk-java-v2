package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionSetKeyActionImpl;

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
@JsonDeserialize(as = SubscriptionSetKeyActionImpl.class)
public interface SubscriptionSetKeyAction extends SubscriptionUpdateAction {

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static SubscriptionSetKeyAction of(){
        return new SubscriptionSetKeyActionImpl();
    }
    

    public static SubscriptionSetKeyAction of(final SubscriptionSetKeyAction template) {
        SubscriptionSetKeyActionImpl instance = new SubscriptionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static SubscriptionSetKeyActionBuilder builder(){
        return SubscriptionSetKeyActionBuilder.of();
    }
    
    public static SubscriptionSetKeyActionBuilder builder(final SubscriptionSetKeyAction template){
        return SubscriptionSetKeyActionBuilder.of(template);
    }
    

    default <T> T withSubscriptionSetKeyAction(Function<SubscriptionSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
