
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetCountryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCountryAction myCartSetCountryAction = MyCartSetCountryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetCountryActionImpl.class)
public interface MyCartSetCountryAction extends MyCartUpdateAction {

    String SET_COUNTRY = "setCountry";

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    public void setCountry(final String country);

    public static MyCartSetCountryAction of() {
        return new MyCartSetCountryActionImpl();
    }

    public static MyCartSetCountryAction of(final MyCartSetCountryAction template) {
        MyCartSetCountryActionImpl instance = new MyCartSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public static MyCartSetCountryActionBuilder builder() {
        return MyCartSetCountryActionBuilder.of();
    }

    public static MyCartSetCountryActionBuilder builder(final MyCartSetCountryAction template) {
        return MyCartSetCountryActionBuilder.of(template);
    }

    default <T> T withMyCartSetCountryAction(Function<MyCartSetCountryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetCountryAction>";
            }
        };
    }
}
