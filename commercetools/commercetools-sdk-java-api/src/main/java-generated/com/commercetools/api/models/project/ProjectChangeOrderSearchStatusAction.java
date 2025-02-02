
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeOrderSearchStatusAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeOrderSearchStatusAction projectChangeOrderSearchStatusAction = ProjectChangeOrderSearchStatusAction.builder()
 *             .status(OrderSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeOrderSearchStatusActionImpl.class)
public interface ProjectChangeOrderSearchStatusAction extends ProjectUpdateAction {

    String CHANGE_ORDER_SEARCH_STATUS = "changeOrderSearchStatus";

    /**
     *  <p>Activates or deactivates the Order Search feature. Activation will trigger building a search index for the Orders in the Project.</p>
     */
    @NotNull
    @JsonProperty("status")
    public OrderSearchStatus getStatus();

    public void setStatus(final OrderSearchStatus status);

    public static ProjectChangeOrderSearchStatusAction of() {
        return new ProjectChangeOrderSearchStatusActionImpl();
    }

    public static ProjectChangeOrderSearchStatusAction of(final ProjectChangeOrderSearchStatusAction template) {
        ProjectChangeOrderSearchStatusActionImpl instance = new ProjectChangeOrderSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public static ProjectChangeOrderSearchStatusActionBuilder builder() {
        return ProjectChangeOrderSearchStatusActionBuilder.of();
    }

    public static ProjectChangeOrderSearchStatusActionBuilder builder(
            final ProjectChangeOrderSearchStatusAction template) {
        return ProjectChangeOrderSearchStatusActionBuilder.of(template);
    }

    default <T> T withProjectChangeOrderSearchStatusAction(Function<ProjectChangeOrderSearchStatusAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeOrderSearchStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeOrderSearchStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeOrderSearchStatusAction>";
            }
        };
    }
}
