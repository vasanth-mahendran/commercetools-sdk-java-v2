package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.category.CategoryChangeAssetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryChangeAssetNameActionBuilder {
   
   @Nullable
   private String assetId;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private String assetKey;
   
   public CategoryChangeAssetNameActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategoryChangeAssetNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CategoryChangeAssetNameActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public String getAssetKey(){
      return this.assetKey;
   }

   public CategoryChangeAssetNameAction build() {
       return new CategoryChangeAssetNameActionImpl(assetId, name, assetKey);
   }
   
   public static CategoryChangeAssetNameActionBuilder of() {
      return new CategoryChangeAssetNameActionBuilder();
   }
   
   public static CategoryChangeAssetNameActionBuilder of(final CategoryChangeAssetNameAction template) {
      CategoryChangeAssetNameActionBuilder builder = new CategoryChangeAssetNameActionBuilder();
      builder.assetId = template.getAssetId();
      builder.name = template.getName();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}