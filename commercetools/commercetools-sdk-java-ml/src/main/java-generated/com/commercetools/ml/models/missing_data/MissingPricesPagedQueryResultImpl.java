
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * MissingPricesPagedQueryResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingPricesPagedQueryResultImpl implements MissingPricesPagedQueryResult, ModelBase {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results;

    private com.commercetools.ml.models.missing_data.MissingPricesMeta meta;

    @JsonCreator
    MissingPricesPagedQueryResultImpl(@JsonProperty("count") final Long count, @JsonProperty("total") final Long total,
            @JsonProperty("offset") final Long offset,
            @JsonProperty("results") final java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results,
            @JsonProperty("meta") final com.commercetools.ml.models.missing_data.MissingPricesMeta meta) {
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
        this.meta = meta;
    }

    public MissingPricesPagedQueryResultImpl() {
    }

    /**
     *
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> getResults() {
        return this.results;
    }

    /**
     *
     */

    public com.commercetools.ml.models.missing_data.MissingPricesMeta getMeta() {
        return this.meta;
    }

    public void setCount(final Long count) {
        this.count = count;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setOffset(final Long offset) {
        this.offset = offset;
    }

    public void setResults(final com.commercetools.ml.models.missing_data.MissingPrices... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results) {
        this.results = results;
    }

    public void setMeta(final com.commercetools.ml.models.missing_data.MissingPricesMeta meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingPricesPagedQueryResultImpl that = (MissingPricesPagedQueryResultImpl) o;

        return new EqualsBuilder().append(count, that.count)
                .append(total, that.total)
                .append(offset, that.offset)
                .append(results, that.results)
                .append(meta, that.meta)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(count)
                .append(total)
                .append(offset)
                .append(results)
                .append(meta)
                .toHashCode();
    }

}
