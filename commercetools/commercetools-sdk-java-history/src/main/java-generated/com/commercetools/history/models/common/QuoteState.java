
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteState {

    QuoteState PENDING = QuoteStateEnum.PENDING;

    QuoteState DECLINED = QuoteStateEnum.DECLINED;

    QuoteState ACCEPTED = QuoteStateEnum.ACCEPTED;

    QuoteState FAILED = QuoteStateEnum.FAILED;

    QuoteState WITHDRAWN = QuoteStateEnum.WITHDRAWN;

    enum QuoteStateEnum implements QuoteState {
        PENDING("Pending"),

        DECLINED("Declined"),

        ACCEPTED("Accepted"),

        FAILED("Failed"),

        WITHDRAWN("Withdrawn");
        private final String jsonName;

        private QuoteStateEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static QuoteState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new QuoteState() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<QuoteState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static QuoteState[] values() {
        return QuoteStateEnum.values();
    }
}
