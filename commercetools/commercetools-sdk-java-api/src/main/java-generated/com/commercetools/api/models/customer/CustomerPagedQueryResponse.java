
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPagedQueryResponse customerPagedQueryResponse = CustomerPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerPagedQueryResponseImpl.class)
public interface CustomerPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Customer> {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Customer> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Customer... results);

    public void setResults(final List<Customer> results);

    public static CustomerPagedQueryResponse of() {
        return new CustomerPagedQueryResponseImpl();
    }

    public static CustomerPagedQueryResponse of(final CustomerPagedQueryResponse template) {
        CustomerPagedQueryResponseImpl instance = new CustomerPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static CustomerPagedQueryResponseBuilder builder() {
        return CustomerPagedQueryResponseBuilder.of();
    }

    public static CustomerPagedQueryResponseBuilder builder(final CustomerPagedQueryResponse template) {
        return CustomerPagedQueryResponseBuilder.of(template);
    }

    default <T> T withCustomerPagedQueryResponse(Function<CustomerPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPagedQueryResponse>";
            }
        };
    }
}
