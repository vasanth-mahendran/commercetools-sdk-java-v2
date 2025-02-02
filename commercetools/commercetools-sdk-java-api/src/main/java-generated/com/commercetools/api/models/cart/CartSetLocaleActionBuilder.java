
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLocaleAction cartSetLocaleAction = CartSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLocaleActionBuilder implements Builder<CartSetLocaleAction> {

    @Nullable
    private String locale;

    /**
     *
     */

    public CartSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public CartSetLocaleAction build() {
        return new CartSetLocaleActionImpl(locale);
    }

    /**
     * builds CartSetLocaleAction without checking for non null required values
     */
    public CartSetLocaleAction buildUnchecked() {
        return new CartSetLocaleActionImpl(locale);
    }

    public static CartSetLocaleActionBuilder of() {
        return new CartSetLocaleActionBuilder();
    }

    public static CartSetLocaleActionBuilder of(final CartSetLocaleAction template) {
        CartSetLocaleActionBuilder builder = new CartSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
