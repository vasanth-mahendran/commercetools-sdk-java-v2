package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntry;
import com.commercetools.models.inventory.InventoryPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.models.inventory.InventoryEntry> results;
   
   public InventoryPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public InventoryPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public InventoryPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public InventoryPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public InventoryPagedQueryResponseBuilder results( final java.util.List<com.commercetools.models.inventory.InventoryEntry> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.models.inventory.InventoryEntry> getResults(){
      return this.results;
   }

   public InventoryPagedQueryResponse build() {
       return new InventoryPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static InventoryPagedQueryResponseBuilder of() {
      return new InventoryPagedQueryResponseBuilder();
   }
   
   public static InventoryPagedQueryResponseBuilder of(final InventoryPagedQueryResponse template) {
      InventoryPagedQueryResponseBuilder builder = new InventoryPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}