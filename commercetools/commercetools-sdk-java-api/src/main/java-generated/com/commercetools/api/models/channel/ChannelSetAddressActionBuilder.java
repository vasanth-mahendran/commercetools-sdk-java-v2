
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetAddressAction channelSetAddressAction = ChannelSetAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelSetAddressActionBuilder implements Builder<ChannelSetAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ChannelSetAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ChannelSetAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public ChannelSetAddressAction build() {
        return new ChannelSetAddressActionImpl(address);
    }

    /**
     * builds ChannelSetAddressAction without checking for non null required values
     */
    public ChannelSetAddressAction buildUnchecked() {
        return new ChannelSetAddressActionImpl(address);
    }

    public static ChannelSetAddressActionBuilder of() {
        return new ChannelSetAddressActionBuilder();
    }

    public static ChannelSetAddressActionBuilder of(final ChannelSetAddressAction template) {
        ChannelSetAddressActionBuilder builder = new ChannelSetAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
