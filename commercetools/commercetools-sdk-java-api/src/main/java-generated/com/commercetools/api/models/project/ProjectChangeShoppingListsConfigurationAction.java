
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeShoppingListsConfigurationActionImpl.class)
public interface ProjectChangeShoppingListsConfigurationAction extends ProjectUpdateAction {

    String CHANGE_SHOPPING_LISTS_CONFIGURATION = "changeShoppingListsConfiguration";

    @Valid
    @JsonProperty("shoppingListsConfiguration")
    public ShoppingListsConfiguration getShoppingListsConfiguration();

    public void setShoppingListsConfiguration(final ShoppingListsConfiguration shoppingListsConfiguration);

    public static ProjectChangeShoppingListsConfigurationAction of() {
        return new ProjectChangeShoppingListsConfigurationActionImpl();
    }

    public static ProjectChangeShoppingListsConfigurationAction of(
            final ProjectChangeShoppingListsConfigurationAction template) {
        ProjectChangeShoppingListsConfigurationActionImpl instance = new ProjectChangeShoppingListsConfigurationActionImpl();
        instance.setShoppingListsConfiguration(template.getShoppingListsConfiguration());
        return instance;
    }

    public static ProjectChangeShoppingListsConfigurationActionBuilder builder() {
        return ProjectChangeShoppingListsConfigurationActionBuilder.of();
    }

    public static ProjectChangeShoppingListsConfigurationActionBuilder builder(
            final ProjectChangeShoppingListsConfigurationAction template) {
        return ProjectChangeShoppingListsConfigurationActionBuilder.of(template);
    }

    default <T> T withProjectChangeShoppingListsConfigurationAction(
            Function<ProjectChangeShoppingListsConfigurationAction, T> helper) {
        return helper.apply(this);
    }
}
