package com.commercetools.importapi.models.prices;


import com.commercetools.importapi.models.prices.SubRateImpl;

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
@JsonDeserialize(as = SubRateImpl.class)
public interface SubRate  {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();

    public void setName(final String name);
    
    public void setAmount(final Double amount);

    public static SubRate of(){
        return new SubRateImpl();
    }
    

    public static SubRate of(final SubRate template) {
        SubRateImpl instance = new SubRateImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static SubRateBuilder builder(){
        return SubRateBuilder.of();
    }
    
    public static SubRateBuilder builder(final SubRate template){
        return SubRateBuilder.of(template);
    }
    

    default <T> T withSubRate(Function<SubRate, T> helper) {
        return helper.apply(this);
    }
}
