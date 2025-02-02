
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetLanguagesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetLanguagesAction storeSetLanguagesAction = StoreSetLanguagesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetLanguagesActionImpl.class)
public interface StoreSetLanguagesAction extends StoreUpdateAction {

    String SET_LANGUAGES = "setLanguages";

    /**
     *  <p>Value to set. Any attempt to use languages other than the ones defined in the Project will fail with a ProjectNotConfiguredForLanguages error.</p>
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    public static StoreSetLanguagesAction of() {
        return new StoreSetLanguagesActionImpl();
    }

    public static StoreSetLanguagesAction of(final StoreSetLanguagesAction template) {
        StoreSetLanguagesActionImpl instance = new StoreSetLanguagesActionImpl();
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    public static StoreSetLanguagesActionBuilder builder() {
        return StoreSetLanguagesActionBuilder.of();
    }

    public static StoreSetLanguagesActionBuilder builder(final StoreSetLanguagesAction template) {
        return StoreSetLanguagesActionBuilder.of(template);
    }

    default <T> T withStoreSetLanguagesAction(Function<StoreSetLanguagesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetLanguagesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetLanguagesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetLanguagesAction>";
            }
        };
    }
}
