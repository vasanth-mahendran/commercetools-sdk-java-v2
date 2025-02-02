
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>To protect your Azure Function, set its <code>authLevel</code> to <code>function</code> and provide the function's key to be used inside the <code>x-functions-key</code> header. For more information, see the Azure Functions documentation.</p>
 *  <p>To protect the secret key from being exposed, remove the code parameter and secret key from the URL. For example, use <code>https://foo.azurewebsites.net/api/bar</code> instead of <code>https://foo.azurewebsites.net/api/bar?code=secret</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AzureFunctionsAuthentication azureFunctionsAuthentication = AzureFunctionsAuthentication.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AzureFunctionsAuthenticationImpl.class)
public interface AzureFunctionsAuthentication extends HttpDestinationAuthentication {

    String AZURE_FUNCTIONS = "AzureFunctions";

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static AzureFunctionsAuthentication of() {
        return new AzureFunctionsAuthenticationImpl();
    }

    public static AzureFunctionsAuthentication of(final AzureFunctionsAuthentication template) {
        AzureFunctionsAuthenticationImpl instance = new AzureFunctionsAuthenticationImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static AzureFunctionsAuthenticationBuilder builder() {
        return AzureFunctionsAuthenticationBuilder.of();
    }

    public static AzureFunctionsAuthenticationBuilder builder(final AzureFunctionsAuthentication template) {
        return AzureFunctionsAuthenticationBuilder.of(template);
    }

    default <T> T withAzureFunctionsAuthentication(Function<AzureFunctionsAuthentication, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AzureFunctionsAuthentication> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AzureFunctionsAuthentication>() {
            @Override
            public String toString() {
                return "TypeReference<AzureFunctionsAuthentication>";
            }
        };
    }
}
