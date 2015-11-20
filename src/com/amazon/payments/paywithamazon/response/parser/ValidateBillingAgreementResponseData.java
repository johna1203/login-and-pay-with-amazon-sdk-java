package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.ValidateBillingAgreementResponse;
import java.io.Serializable;

public final class ValidateBillingAgreementResponseData extends ResponseData implements Serializable{
    
    private String requestId;
    
    public ValidateBillingAgreementResponseData(ValidateBillingAgreementResponse validateBillingAgreementResponse , ResponseData rawResponse) {
        super(rawResponse);
        if(validateBillingAgreementResponse != null) {
            if(validateBillingAgreementResponse.getResponseMetadata() != null) {
                this.requestId = validateBillingAgreementResponse.getResponseMetadata().getRequestId();
            }
        }
    }

    
    /**
     * @return  The requestID that uniquely identifies the service request
     * the caller made.
     */
    public String getRequestId() {
        return requestId;
    }
    
    
}
