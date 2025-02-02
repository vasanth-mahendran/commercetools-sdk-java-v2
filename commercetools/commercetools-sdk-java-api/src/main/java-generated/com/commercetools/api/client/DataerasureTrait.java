
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DataerasureTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DataerasureTrait<T extends DataerasureTrait<T>> {
    List<String> getDataErasure();

    /**
     * set dataErasure with the specificied value
     */
    <TValue> DataerasureTrait<T> withDataErasure(final TValue dataErasure);

    /**
     * add additional dataErasure query parameter
     */
    <TValue> DataerasureTrait<T> addDataErasure(final TValue dataErasure);

    default DataerasureTrait<T> asDataerasureTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asDataerasureTraitToBaseType() {
        return (T) this;
    }
}
