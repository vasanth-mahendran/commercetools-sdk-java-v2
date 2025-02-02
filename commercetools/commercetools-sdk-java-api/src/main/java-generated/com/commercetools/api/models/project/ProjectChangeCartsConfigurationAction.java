
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeCartsConfigurationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCartsConfigurationAction projectChangeCartsConfigurationAction = ProjectChangeCartsConfigurationAction.builder()
 *             .cartsConfiguration(cartsConfigurationBuilder -> cartsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCartsConfigurationActionImpl.class)
public interface ProjectChangeCartsConfigurationAction extends ProjectUpdateAction {

    String CHANGE_CARTS_CONFIGURATION = "changeCartsConfiguration";

    /**
     *  <p>Configuration for the Carts feature.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("cartsConfiguration")
    public CartsConfiguration getCartsConfiguration();

    public void setCartsConfiguration(final CartsConfiguration cartsConfiguration);

    public static ProjectChangeCartsConfigurationAction of() {
        return new ProjectChangeCartsConfigurationActionImpl();
    }

    public static ProjectChangeCartsConfigurationAction of(final ProjectChangeCartsConfigurationAction template) {
        ProjectChangeCartsConfigurationActionImpl instance = new ProjectChangeCartsConfigurationActionImpl();
        instance.setCartsConfiguration(template.getCartsConfiguration());
        return instance;
    }

    public static ProjectChangeCartsConfigurationActionBuilder builder() {
        return ProjectChangeCartsConfigurationActionBuilder.of();
    }

    public static ProjectChangeCartsConfigurationActionBuilder builder(
            final ProjectChangeCartsConfigurationAction template) {
        return ProjectChangeCartsConfigurationActionBuilder.of(template);
    }

    default <T> T withProjectChangeCartsConfigurationAction(Function<ProjectChangeCartsConfigurationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCartsConfigurationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCartsConfigurationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeCartsConfigurationAction>";
            }
        };
    }
}
