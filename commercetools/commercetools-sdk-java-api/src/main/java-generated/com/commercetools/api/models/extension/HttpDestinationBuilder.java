
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * HttpDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HttpDestination httpDestination = HttpDestination.builder()
 *             .url("{url}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HttpDestinationBuilder implements Builder<HttpDestination> {

    private String url;

    @Nullable
    private com.commercetools.api.models.extension.HttpDestinationAuthentication authentication;

    /**
     *  <p>URL to the target destination.</p>
     */

    public HttpDestinationBuilder url(final String url) {
        this.url = url;
        return this;
    }

    /**
     *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
     */

    public HttpDestinationBuilder authentication(
            @Nullable final com.commercetools.api.models.extension.HttpDestinationAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     *  <p>Authentication methods (such as <code>Basic</code> or <code>Bearer</code>).</p>
     */

    public HttpDestinationBuilder authentication(
            Function<com.commercetools.api.models.extension.HttpDestinationAuthenticationBuilder, Builder<? extends com.commercetools.api.models.extension.HttpDestinationAuthentication>> builder) {
        this.authentication = builder
                .apply(com.commercetools.api.models.extension.HttpDestinationAuthenticationBuilder.of())
                .build();
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    @Nullable
    public com.commercetools.api.models.extension.HttpDestinationAuthentication getAuthentication() {
        return this.authentication;
    }

    public HttpDestination build() {
        Objects.requireNonNull(url, HttpDestination.class + ": url is missing");
        return new HttpDestinationImpl(url, authentication);
    }

    /**
     * builds HttpDestination without checking for non null required values
     */
    public HttpDestination buildUnchecked() {
        return new HttpDestinationImpl(url, authentication);
    }

    public static HttpDestinationBuilder of() {
        return new HttpDestinationBuilder();
    }

    public static HttpDestinationBuilder of(final HttpDestination template) {
        HttpDestinationBuilder builder = new HttpDestinationBuilder();
        builder.url = template.getUrl();
        builder.authentication = template.getAuthentication();
        return builder;
    }

}
