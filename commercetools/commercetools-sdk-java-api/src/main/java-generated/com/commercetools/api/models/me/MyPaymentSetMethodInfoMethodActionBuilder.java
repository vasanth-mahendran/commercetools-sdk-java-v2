
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoMethodAction myPaymentSetMethodInfoMethodAction = MyPaymentSetMethodInfoMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetMethodInfoMethodActionBuilder implements Builder<MyPaymentSetMethodInfoMethodAction> {

    @Nullable
    private String method;

    /**
     *
     */

    public MyPaymentSetMethodInfoMethodActionBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    @Nullable
    public String getMethod() {
        return this.method;
    }

    public MyPaymentSetMethodInfoMethodAction build() {
        return new MyPaymentSetMethodInfoMethodActionImpl(method);
    }

    /**
     * builds MyPaymentSetMethodInfoMethodAction without checking for non null required values
     */
    public MyPaymentSetMethodInfoMethodAction buildUnchecked() {
        return new MyPaymentSetMethodInfoMethodActionImpl(method);
    }

    public static MyPaymentSetMethodInfoMethodActionBuilder of() {
        return new MyPaymentSetMethodInfoMethodActionBuilder();
    }

    public static MyPaymentSetMethodInfoMethodActionBuilder of(final MyPaymentSetMethodInfoMethodAction template) {
        MyPaymentSetMethodInfoMethodActionBuilder builder = new MyPaymentSetMethodInfoMethodActionBuilder();
        builder.method = template.getMethod();
        return builder;
    }

}
