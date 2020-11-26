package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.customfields.CustomField;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>A field with a money set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MoneySetFieldImpl implements MoneySetField {

    private String type;
    
    private java.util.List<com.commercetools.importapi.models.common.Money> value;

    @JsonCreator
    MoneySetFieldImpl(@JsonProperty("value") final java.util.List<com.commercetools.importapi.models.common.Money> value) {
        this.value = value;
        this.type = "MoneySet";
    }
    public MoneySetFieldImpl() {
        this.type = "MoneySet";
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.common.Money> getValue(){
        return this.value;
    }

    public void setValue(final com.commercetools.importapi.models.common.Money ...value){
       this.value = new ArrayList<>(Arrays.asList(value));
    }
    
    public void setValue(final java.util.List<com.commercetools.importapi.models.common.Money> value){
       this.value = value;
    }

}
