
package com.commercetools.importapi.models.products;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomTokenizerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomTokenizer customTokenizer = CustomTokenizer.builder()
 *             .plusInputs(inputsBuilder -> inputsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomTokenizerBuilder implements Builder<CustomTokenizer> {

    private java.util.List<String> inputs;

    /**
     *
     */

    public CustomTokenizerBuilder inputs(final String... inputs) {
        this.inputs = new ArrayList<>(Arrays.asList(inputs));
        return this;
    }

    /**
     *
     */

    public CustomTokenizerBuilder inputs(final java.util.List<String> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     *
     */

    public CustomTokenizerBuilder plusInputs(final String... inputs) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.addAll(Arrays.asList(inputs));
        return this;
    }

    public java.util.List<String> getInputs() {
        return this.inputs;
    }

    public CustomTokenizer build() {
        Objects.requireNonNull(inputs, CustomTokenizer.class + ": inputs is missing");
        return new CustomTokenizerImpl(inputs);
    }

    /**
     * builds CustomTokenizer without checking for non null required values
     */
    public CustomTokenizer buildUnchecked() {
        return new CustomTokenizerImpl(inputs);
    }

    public static CustomTokenizerBuilder of() {
        return new CustomTokenizerBuilder();
    }

    public static CustomTokenizerBuilder of(final CustomTokenizer template) {
        CustomTokenizerBuilder builder = new CustomTokenizerBuilder();
        builder.inputs = template.getInputs();
        return builder;
    }

}
