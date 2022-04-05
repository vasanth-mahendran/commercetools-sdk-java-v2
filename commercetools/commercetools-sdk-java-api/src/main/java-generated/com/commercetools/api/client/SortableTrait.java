
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SortableTrait<T extends SortableTrait<T>> {
    List<String> getSort();

    /**
     * set sort with the specificied value
     */
    <TValue> SortableTrait<T> withSort(final TValue sort);

    /**
     * add additional sort query parameter
     */
    <TValue> SortableTrait<T> addSort(final TValue sort);

    default SortableTrait<T> asSortableTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asSortableTraitToBaseType() {
        return (T) this;
    }
}
