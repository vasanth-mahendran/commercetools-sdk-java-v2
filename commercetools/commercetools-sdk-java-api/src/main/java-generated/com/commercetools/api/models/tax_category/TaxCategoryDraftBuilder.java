
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryDraft taxCategoryDraft = TaxCategoryDraft.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryDraftBuilder implements Builder<TaxCategoryDraft> {

    private String name;

    @Nullable
    private String description;

    @Nullable
    private java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates;

    @Nullable
    private String key;

    /**
     *  <p>Name of the TaxCategory.</p>
     */

    public TaxCategoryDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the TaxCategory.</p>
     */

    public TaxCategoryDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     */

    public TaxCategoryDraftBuilder rates(
            @Nullable final com.commercetools.api.models.tax_category.TaxRateDraft... rates) {
        this.rates = new ArrayList<>(Arrays.asList(rates));
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     */

    public TaxCategoryDraftBuilder rates(
            @Nullable final java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates) {
        this.rates = rates;
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     */

    public TaxCategoryDraftBuilder plusRates(
            @Nullable final com.commercetools.api.models.tax_category.TaxRateDraft... rates) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.addAll(Arrays.asList(rates));
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     */

    public TaxCategoryDraftBuilder plusRates(
            Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.add(builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     */

    public TaxCategoryDraftBuilder withRates(
            Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        this.rates = new ArrayList<>();
        this.rates.add(builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the TaxCategory.</p>
     */

    public TaxCategoryDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> getRates() {
        return this.rates;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public TaxCategoryDraft build() {
        Objects.requireNonNull(name, TaxCategoryDraft.class + ": name is missing");
        return new TaxCategoryDraftImpl(name, description, rates, key);
    }

    /**
     * builds TaxCategoryDraft without checking for non null required values
     */
    public TaxCategoryDraft buildUnchecked() {
        return new TaxCategoryDraftImpl(name, description, rates, key);
    }

    public static TaxCategoryDraftBuilder of() {
        return new TaxCategoryDraftBuilder();
    }

    public static TaxCategoryDraftBuilder of(final TaxCategoryDraft template) {
        TaxCategoryDraftBuilder builder = new TaxCategoryDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.rates = template.getRates();
        builder.key = template.getKey();
        return builder;
    }

}
