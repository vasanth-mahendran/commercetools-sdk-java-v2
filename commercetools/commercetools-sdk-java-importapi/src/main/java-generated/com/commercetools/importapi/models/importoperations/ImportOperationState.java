package com.commercetools.importapi.models.importoperations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This enumeration describes the operation state of a newly created import operation.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ImportOperationState {

    /**
    	<p>This is an initial state of import resource and is currently unresolved.</p>
    	
    */
    @JsonProperty("Unresolved")
    UNRESOLVED("Unresolved"),
    
    /**
    	<p>The validation of the import resource failed.</p>
    	
    */
    @JsonProperty("ValidationFailed")
    VALIDATION_FAILED("ValidationFailed"),
    
    /**
    	<p>The import resource is being deleted.</p>
    	
    */
    @JsonProperty("Delete")
    DELETE("Delete");

    private final String jsonName;

    private ImportOperationState(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<ImportOperationState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
