package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.ProviderCreditReversalDetails;
import com.amazon.payments.paywithamazon.response.model.ReverseProviderCreditResponse;
import java.io.Serializable;

public final class ReverseProviderCreditResponseData extends ResponseData implements Serializable{
    
    private String requestId;
    private ProviderCreditReversalDetails providerCreditReversalDetails;
    
    public ReverseProviderCreditResponseData(ReverseProviderCreditResponse reverseProviderCreditResponse , ResponseData rawResponse) {
        super(rawResponse);
        if(reverseProviderCreditResponse != null) {
            if(reverseProviderCreditResponse.getReverseProviderCreditResult()!= null) {
                this.providerCreditReversalDetails = reverseProviderCreditResponse.getReverseProviderCreditResult().getProviderCreditReversalDetails();
            }
            this.requestId = reverseProviderCreditResponse.getResponseMetadata().getRequestId();
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
     * 
     * @return providerCreditReversalDetails
     */
    public ProviderCreditReversalDetails getDetails() {
        return providerCreditReversalDetails;
    }
}
