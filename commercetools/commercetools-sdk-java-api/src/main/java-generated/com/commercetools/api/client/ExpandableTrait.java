
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpandableTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ExpandableTrait<T extends ExpandableTrait<T>> {
    List<String> getExpand();

    /**
     * set expand with the specificied value
     */
    <TValue> ExpandableTrait<T> withExpand(final TValue expand);

    /**
     * add additional expand query parameter
     */
    <TValue> ExpandableTrait<T> addExpand(final TValue expand);

    default ExpandableTrait<T> asExpandableTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asExpandableTraitToBaseType() {
        return (T) this;
    }
}
