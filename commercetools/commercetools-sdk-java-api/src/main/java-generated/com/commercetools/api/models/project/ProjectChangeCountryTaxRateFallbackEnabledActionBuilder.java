
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeCountryTaxRateFallbackEnabledActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCountryTaxRateFallbackEnabledAction projectChangeCountryTaxRateFallbackEnabledAction = ProjectChangeCountryTaxRateFallbackEnabledAction.builder()
 *             .countryTaxRateFallbackEnabled(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeCountryTaxRateFallbackEnabledActionBuilder
        implements Builder<ProjectChangeCountryTaxRateFallbackEnabledAction> {

    private Boolean countryTaxRateFallbackEnabled;

    /**
     *  <p>When <code>true</code>, country <em>- no state</em> Tax Rate is used as fallback. See CartsConfiguration.</p>
     */

    public ProjectChangeCountryTaxRateFallbackEnabledActionBuilder countryTaxRateFallbackEnabled(
            final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    public ProjectChangeCountryTaxRateFallbackEnabledAction build() {
        Objects.requireNonNull(countryTaxRateFallbackEnabled,
            ProjectChangeCountryTaxRateFallbackEnabledAction.class + ": countryTaxRateFallbackEnabled is missing");
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl(countryTaxRateFallbackEnabled);
    }

    /**
     * builds ProjectChangeCountryTaxRateFallbackEnabledAction without checking for non null required values
     */
    public ProjectChangeCountryTaxRateFallbackEnabledAction buildUnchecked() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl(countryTaxRateFallbackEnabled);
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder of() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionBuilder();
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder of(
            final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder = new ProjectChangeCountryTaxRateFallbackEnabledActionBuilder();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        return builder;
    }

}
