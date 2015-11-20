package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.ConfirmOrderReferenceResponse;
import java.io.Serializable;

public final class ConfirmOrderReferenceResponseData  extends ResponseData implements Serializable {
    
    private String requestId;
    
    public ConfirmOrderReferenceResponseData(ConfirmOrderReferenceResponse confirmOrderReferenceResponse , ResponseData rawResponse) {
        super(rawResponse);
        if(confirmOrderReferenceResponse != null) {
            if(confirmOrderReferenceResponse.getResponseMetadata() != null) {
                this.requestId = confirmOrderReferenceResponse.getResponseMetadata().getRequestId();
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
