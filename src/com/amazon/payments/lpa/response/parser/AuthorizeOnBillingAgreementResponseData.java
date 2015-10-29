package com.amazon.payments.lpa.response.parser;

import com.amazon.payments.lpa.response.autogenerated.model.AuthorizationDetails;
import com.amazon.payments.lpa.response.autogenerated.model.AuthorizeOnBillingAgreementResponse;
import com.amazon.payments.lpa.response.autogenerated.model.HttpResponseObject;

public class AuthorizeOnBillingAgreementResponseData {
    
    private String rawXML;
    private String requestId;
    private AuthorizationDetails authorizationDetails;
    
    public AuthorizeOnBillingAgreementResponseData(AuthorizeOnBillingAgreementResponse authorizeOnBillingAgreementResponse , HttpResponseObject rawResponse) {
        this.rawXML = rawResponse.getData();
        if(authorizeOnBillingAgreementResponse != null) {
            if(authorizeOnBillingAgreementResponse.getAuthorizeOnBillingAgreementResult()!= null) {
                this.authorizationDetails = authorizeOnBillingAgreementResponse.getAuthorizeOnBillingAgreementResult().getAuthorizationDetails();
            }
            this.requestId = authorizeOnBillingAgreementResponse.getResponseMetadata().getRequestId();
        }
    }

    public String toXML() {
        return rawXML;
    }

    public String getRequestId() {
        return requestId;
    }

    public AuthorizationDetails getDetails() {
        return authorizationDetails;
    }

}
