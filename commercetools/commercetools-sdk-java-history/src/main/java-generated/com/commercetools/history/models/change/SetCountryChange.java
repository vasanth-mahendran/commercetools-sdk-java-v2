
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCountryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCountryChange setCountryChange = SetCountryChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCountryChangeImpl.class)
public interface SetCountryChange extends Change {

    String SET_COUNTRY_CHANGE = "SetCountryChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCountry</code></p>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetCountryChange of() {
        return new SetCountryChangeImpl();
    }

    public static SetCountryChange of(final SetCountryChange template) {
        SetCountryChangeImpl instance = new SetCountryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCountryChangeBuilder builder() {
        return SetCountryChangeBuilder.of();
    }

    public static SetCountryChangeBuilder builder(final SetCountryChange template) {
        return SetCountryChangeBuilder.of(template);
    }

    default <T> T withSetCountryChange(Function<SetCountryChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCountryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCountryChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCountryChange>";
            }
        };
    }
}
