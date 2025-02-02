
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Channel.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelReference channelReference = ChannelReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelReferenceImpl.class)
public interface ChannelReference extends Reference, com.commercetools.api.models.Identifiable<Channel> {

    String CHANNEL = "channel";

    /**
     *  <p>Contains the representation of the expanded Channel. Only present in responses to requests with Reference Expansion for Channels.</p>
     */
    @Valid
    @JsonProperty("obj")
    public Channel getObj();

    /**
     *  <p>Unique identifier of the referenced Channel.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Channel obj);

    public void setId(final String id);

    public static ChannelReference of() {
        return new ChannelReferenceImpl();
    }

    public static ChannelReference of(final ChannelReference template) {
        ChannelReferenceImpl instance = new ChannelReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ChannelReferenceBuilder builder() {
        return ChannelReferenceBuilder.of();
    }

    public static ChannelReferenceBuilder builder(final ChannelReference template) {
        return ChannelReferenceBuilder.of(template);
    }

    default <T> T withChannelReference(Function<ChannelReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelReference>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelReference>";
            }
        };
    }
}
