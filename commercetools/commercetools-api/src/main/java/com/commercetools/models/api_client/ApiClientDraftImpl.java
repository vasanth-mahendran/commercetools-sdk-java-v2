package com.commercetools.models.api_client;


import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ApiClientDraftImpl implements ApiClientDraft {

   private Long deleteDaysAfterCreation;
   
   private String scope;
   
   private String name;

   @JsonCreator
   ApiClientDraftImpl(@JsonProperty("deleteDaysAfterCreation") final Long deleteDaysAfterCreation, @JsonProperty("scope") final String scope, @JsonProperty("name") final String name) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      this.scope = scope;
      this.name = name;
   }
   public ApiClientDraftImpl() {
      
   }
   
   
   public Long getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public String getScope(){
      return this.scope;
   }
   
   
   public String getName(){
      return this.name;
   }

   public void setDeleteDaysAfterCreation(final Long deleteDaysAfterCreation){
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
   }
   
   public void setScope(final String scope){
      this.scope = scope;
   }
   
   public void setName(final String name){
      this.name = name;
   }

}