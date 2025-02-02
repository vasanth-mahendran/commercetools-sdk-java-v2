
package com.commercetools.importapi.models.products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchKeywordBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeyword searchKeyword = SearchKeyword.builder()
 *             .text("{text}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordBuilder implements Builder<SearchKeyword> {

    private String text;

    @Nullable
    private com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer;

    /**
     *
     */

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>The tokenizer defines the tokens that are used to match against the Suggest Query input.</p>
     */

    public SearchKeywordBuilder suggestTokenizer(
            @Nullable final com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
        return this;
    }

    /**
     *  <p>The tokenizer defines the tokens that are used to match against the Suggest Query input.</p>
     */

    public SearchKeywordBuilder suggestTokenizer(
            Function<com.commercetools.importapi.models.products.SuggestTokenizerBuilder, Builder<? extends com.commercetools.importapi.models.products.SuggestTokenizer>> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.importapi.models.products.SuggestTokenizerBuilder.of())
                .build();
        return this;
    }

    public String getText() {
        return this.text;
    }

    @Nullable
    public com.commercetools.importapi.models.products.SuggestTokenizer getSuggestTokenizer() {
        return this.suggestTokenizer;
    }

    public SearchKeyword build() {
        Objects.requireNonNull(text, SearchKeyword.class + ": text is missing");
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    /**
     * builds SearchKeyword without checking for non null required values
     */
    public SearchKeyword buildUnchecked() {
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    public static SearchKeywordBuilder of() {
        return new SearchKeywordBuilder();
    }

    public static SearchKeywordBuilder of(final SearchKeyword template) {
        SearchKeywordBuilder builder = new SearchKeywordBuilder();
        builder.text = template.getText();
        builder.suggestTokenizer = template.getSuggestTokenizer();
        return builder;
    }

}
