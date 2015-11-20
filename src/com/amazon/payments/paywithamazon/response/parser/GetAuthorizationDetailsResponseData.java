package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.AuthorizationDetails;
import com.amazon.payments.paywithamazon.response.model.GetAuthorizationDetailsResponse;
import java.io.Serializable;

public final class GetAuthorizationDetailsResponseData extends ResponseData implements  Serializable{
    
    private String requestId;
    private AuthorizationDetails authorizationDetails;
    
    public GetAuthorizationDetailsResponseData(GetAuthorizationDetailsResponse authorizeResponse , ResponseData rawResponse) {
        super(rawResponse);
        if(authorizeResponse != null) {
            if(authorizeResponse.getGetAuthorizationDetailsResult() != null) {
                authorizationDetails = authorizeResponse.getGetAuthorizationDetailsResult().getAuthorizationDetails();
            }
            this.requestId = authorizeResponse.getResponseMetadata().getRequestId();
        }
    }

    /**
     * @return  The requestID that uniquely identifies the service request
     * the caller made.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Encapsulates details about an Authorization object, 
     * including the status, amount captured, and fee charged.
     * Documentation: https://payments.amazon.com/documentation/apireference/201751630#201752450
     * 
     * @return authorizationDetails
     *
     */
    public AuthorizationDetails getDetails() {
        return authorizationDetails;
    }

}
