
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Response to a query request for Record.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecordPagedQueryResponse recordPagedQueryResponse = RecordPagedQueryResponse.builder()
 *             .limit(1)
 *             .count(1)
 *             .total(1)
 *             .offset(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecordPagedQueryResponseImpl.class)
public interface RecordPagedQueryResponse {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Actual number of results returned.</p>
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation and not strongly consistent.</p>
     */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     */
    @NotNull
    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Record> getResults();

    public void setLimit(final Integer limit);

    public void setCount(final Integer count);

    public void setTotal(final Integer total);

    public void setOffset(final Integer offset);

    @JsonIgnore
    public void setResults(final Record... results);

    public void setResults(final List<Record> results);

    public static RecordPagedQueryResponse of() {
        return new RecordPagedQueryResponseImpl();
    }

    public static RecordPagedQueryResponse of(final RecordPagedQueryResponse template) {
        RecordPagedQueryResponseImpl instance = new RecordPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static RecordPagedQueryResponseBuilder builder() {
        return RecordPagedQueryResponseBuilder.of();
    }

    public static RecordPagedQueryResponseBuilder builder(final RecordPagedQueryResponse template) {
        return RecordPagedQueryResponseBuilder.of(template);
    }

    default <T> T withRecordPagedQueryResponse(Function<RecordPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RecordPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecordPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<RecordPagedQueryResponse>";
            }
        };
    }
}
