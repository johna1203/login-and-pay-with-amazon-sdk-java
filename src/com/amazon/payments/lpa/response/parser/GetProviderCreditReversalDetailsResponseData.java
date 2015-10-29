package com.amazon.payments.lpa.response.parser;

import com.amazon.payments.lpa.response.autogenerated.model.GetProviderCreditReversalDetailsResponse;
import com.amazon.payments.lpa.response.autogenerated.model.HttpResponseObject;
import com.amazon.payments.lpa.response.autogenerated.model.ProviderCreditDetails;
import com.amazon.payments.lpa.response.autogenerated.model.ProviderCreditReversalDetails;

public class GetProviderCreditReversalDetailsResponseData {
    
    private String rawXML;
    private String requestId;
    private ProviderCreditReversalDetails providerCreditReversalDetails;
    
    public GetProviderCreditReversalDetailsResponseData(GetProviderCreditReversalDetailsResponse getProviderCreditReversalDetailsResponse , HttpResponseObject rawResponse) {
        this.rawXML = rawResponse.getData();
        if(getProviderCreditReversalDetailsResponse != null) {
            if(getProviderCreditReversalDetailsResponse.getGetProviderCreditReversalDetailsResult()!= null) {
                this.providerCreditReversalDetails = getProviderCreditReversalDetailsResponse.getGetProviderCreditReversalDetailsResult().getProviderCreditReversalDetails();
            }
            this.requestId = getProviderCreditReversalDetailsResponse.getResponseMetadata().getRequestId();
        }
    }

    public String toXML() {
        return rawXML;
    }

    public String getRequestId() {
        return requestId;
    }

    public ProviderCreditReversalDetails getDetails() {
        return providerCreditReversalDetails;
    }

}
