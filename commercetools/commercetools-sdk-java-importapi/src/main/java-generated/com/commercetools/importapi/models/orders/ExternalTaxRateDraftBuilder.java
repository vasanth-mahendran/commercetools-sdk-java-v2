
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalTaxRateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTaxRateDraft externalTaxRateDraft = ExternalTaxRateDraft.builder()
 *             .name("{name}")
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalTaxRateDraftBuilder implements Builder<ExternalTaxRateDraft> {

    private String name;

    @Nullable
    private Double amount;

    private String country;

    @Nullable
    private String state;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates;

    @Nullable
    private Boolean includedInPrice;

    /**
     *
     */

    public ExternalTaxRateDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder amount(@Nullable final Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder subRates(
            @Nullable final com.commercetools.importapi.models.prices.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder subRates(
            @Nullable final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder plusSubRates(
            @Nullable final com.commercetools.importapi.models.prices.SubRate... subRates) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.addAll(Arrays.asList(subRates));
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder plusSubRates(
            Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder withSubRates(
            Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ExternalTaxRateDraftBuilder includedInPrice(@Nullable final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public Double getAmount() {
        return this.amount;
    }

    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.prices.SubRate> getSubRates() {
        return this.subRates;
    }

    @Nullable
    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    public ExternalTaxRateDraft build() {
        Objects.requireNonNull(name, ExternalTaxRateDraft.class + ": name is missing");
        Objects.requireNonNull(country, ExternalTaxRateDraft.class + ": country is missing");
        return new ExternalTaxRateDraftImpl(name, amount, country, state, subRates, includedInPrice);
    }

    /**
     * builds ExternalTaxRateDraft without checking for non null required values
     */
    public ExternalTaxRateDraft buildUnchecked() {
        return new ExternalTaxRateDraftImpl(name, amount, country, state, subRates, includedInPrice);
    }

    public static ExternalTaxRateDraftBuilder of() {
        return new ExternalTaxRateDraftBuilder();
    }

    public static ExternalTaxRateDraftBuilder of(final ExternalTaxRateDraft template) {
        ExternalTaxRateDraftBuilder builder = new ExternalTaxRateDraftBuilder();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        builder.country = template.getCountry();
        builder.state = template.getState();
        builder.subRates = template.getSubRates();
        builder.includedInPrice = template.getIncludedInPrice();
        return builder;
    }

}
