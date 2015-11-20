package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.RefundDetails;
import com.amazon.payments.paywithamazon.response.model.RefundResponse;
import java.io.Serializable;

public final class RefundResponseData  extends ResponseData implements Serializable {
    
    private String requestId;
    private RefundDetails refundDetails;
    
    public RefundResponseData(RefundResponse refundResponse , ResponseData rawResponse) {
        super(rawResponse);
        if(refundResponse != null) {
            if(refundResponse.getRefundResult() != null) {
                refundDetails = refundResponse.getRefundResult().getRefundDetails();
            }
            this.requestId = refundResponse.getResponseMetadata().getRequestId();
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
     * Encapsulates details about a Refund object and its status.
     * Documentation: https://payments.amazon.com/documentation/apireference/201751630#201752740
     * 
     * @return refundDetails
     */
    public RefundDetails getDetails() {
        return refundDetails;
    }

}
