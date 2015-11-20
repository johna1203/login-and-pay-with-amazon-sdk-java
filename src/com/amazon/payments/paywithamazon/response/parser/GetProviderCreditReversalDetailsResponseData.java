package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.GetProviderCreditReversalDetailsResponse;
import com.amazon.payments.paywithamazon.response.model.ProviderCreditReversalDetails;
import java.io.Serializable;

public final class GetProviderCreditReversalDetailsResponseData  extends ResponseData implements Serializable {
    
    private String requestId;
    private ProviderCreditReversalDetails providerCreditReversalDetails;
    
    public GetProviderCreditReversalDetailsResponseData(GetProviderCreditReversalDetailsResponse getProviderCreditReversalDetailsResponse , ResponseData rawResponse) {
        super(rawResponse);
        if(getProviderCreditReversalDetailsResponse != null) {
            if(getProviderCreditReversalDetailsResponse.getGetProviderCreditReversalDetailsResult()!= null) {
                this.providerCreditReversalDetails = getProviderCreditReversalDetailsResponse.getGetProviderCreditReversalDetailsResult().getProviderCreditReversalDetails();
            }
            this.requestId = getProviderCreditReversalDetailsResponse.getResponseMetadata().getRequestId();
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
     * Encapsulates details about GetProviderCreditReversalDetails API 
     * 
     * @return providerCreditReversalDetails
     */
    public ProviderCreditReversalDetails getDetails() {
        return providerCreditReversalDetails;
    }

}
