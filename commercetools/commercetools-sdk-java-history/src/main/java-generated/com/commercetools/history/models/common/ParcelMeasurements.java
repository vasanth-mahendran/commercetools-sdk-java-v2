
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurements
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurements parcelMeasurements = ParcelMeasurements.builder()
 *             .heightInMillimeter(1)
 *             .lengthInMillimeter(1)
 *             .widthInMillimeter(1)
 *             .weightInGram(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelMeasurementsImpl.class)
public interface ParcelMeasurements {

    /**
     *
     */
    @NotNull
    @JsonProperty("heightInMillimeter")
    public Integer getHeightInMillimeter();

    /**
     *
     */
    @NotNull
    @JsonProperty("lengthInMillimeter")
    public Integer getLengthInMillimeter();

    /**
     *
     */
    @NotNull
    @JsonProperty("widthInMillimeter")
    public Integer getWidthInMillimeter();

    /**
     *
     */
    @NotNull
    @JsonProperty("weightInGram")
    public Integer getWeightInGram();

    public void setHeightInMillimeter(final Integer heightInMillimeter);

    public void setLengthInMillimeter(final Integer lengthInMillimeter);

    public void setWidthInMillimeter(final Integer widthInMillimeter);

    public void setWeightInGram(final Integer weightInGram);

    public static ParcelMeasurements of() {
        return new ParcelMeasurementsImpl();
    }

    public static ParcelMeasurements of(final ParcelMeasurements template) {
        ParcelMeasurementsImpl instance = new ParcelMeasurementsImpl();
        instance.setHeightInMillimeter(template.getHeightInMillimeter());
        instance.setLengthInMillimeter(template.getLengthInMillimeter());
        instance.setWidthInMillimeter(template.getWidthInMillimeter());
        instance.setWeightInGram(template.getWeightInGram());
        return instance;
    }

    public static ParcelMeasurementsBuilder builder() {
        return ParcelMeasurementsBuilder.of();
    }

    public static ParcelMeasurementsBuilder builder(final ParcelMeasurements template) {
        return ParcelMeasurementsBuilder.of(template);
    }

    default <T> T withParcelMeasurements(Function<ParcelMeasurements, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurements> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurements>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelMeasurements>";
            }
        };
    }
}
