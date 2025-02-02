
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines the configuration for the Messages Query feature for the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagesConfigurationDraft messagesConfigurationDraft = MessagesConfigurationDraft.builder()
 *             .enabled(true)
 *             .deleteDaysAfterCreation(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MessagesConfigurationDraftImpl.class)
public interface MessagesConfigurationDraft {

    /**
     *  <p>Setting to <code>true</code> activates the Messages Query feature.</p>
     */
    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API.</p>
     */
    @NotNull
    @JsonProperty("deleteDaysAfterCreation")
    public Integer getDeleteDaysAfterCreation();

    public void setEnabled(final Boolean enabled);

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);

    public static MessagesConfigurationDraft of() {
        return new MessagesConfigurationDraftImpl();
    }

    public static MessagesConfigurationDraft of(final MessagesConfigurationDraft template) {
        MessagesConfigurationDraftImpl instance = new MessagesConfigurationDraftImpl();
        instance.setEnabled(template.getEnabled());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    public static MessagesConfigurationDraftBuilder builder() {
        return MessagesConfigurationDraftBuilder.of();
    }

    public static MessagesConfigurationDraftBuilder builder(final MessagesConfigurationDraft template) {
        return MessagesConfigurationDraftBuilder.of(template);
    }

    default <T> T withMessagesConfigurationDraft(Function<MessagesConfigurationDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MessagesConfigurationDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagesConfigurationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MessagesConfigurationDraft>";
            }
        };
    }
}
