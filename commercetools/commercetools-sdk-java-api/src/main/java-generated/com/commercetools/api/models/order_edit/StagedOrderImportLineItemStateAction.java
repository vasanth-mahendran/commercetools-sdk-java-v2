package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderImportLineItemStateActionImpl;

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
@JsonDeserialize(as = StagedOrderImportLineItemStateActionImpl.class)
public interface StagedOrderImportLineItemStateAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    public void setLineItemId(final String lineItemId);
    
    @JsonIgnore
    public void setState(final ItemState ...state);
    public void setState(final List<ItemState> state);

    public static StagedOrderImportLineItemStateAction of(){
        return new StagedOrderImportLineItemStateActionImpl();
    }
    

    public static StagedOrderImportLineItemStateAction of(final StagedOrderImportLineItemStateAction template) {
        StagedOrderImportLineItemStateActionImpl instance = new StagedOrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    public static StagedOrderImportLineItemStateActionBuilder builder(){
        return StagedOrderImportLineItemStateActionBuilder.of();
    }
    
    public static StagedOrderImportLineItemStateActionBuilder builder(final StagedOrderImportLineItemStateAction template){
        return StagedOrderImportLineItemStateActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderImportLineItemStateAction(Function<StagedOrderImportLineItemStateAction, T> helper) {
        return helper.apply(this);
    }
}
