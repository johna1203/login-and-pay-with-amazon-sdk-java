package com.amazon.payments.lpa.response.autogenerated.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reverseProviderCreditResult",
    "responseMetadata"
})
@XmlRootElement(name = "ReverseProviderCreditResponse")
public class ReverseProviderCreditResponse {

    @XmlElement(name = "ReverseProviderCreditResult", required = true)
    protected ReverseProviderCreditResult reverseProviderCreditResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    public ReverseProviderCreditResponse() {
        super();
    }

    public ReverseProviderCreditResult getReverseProviderCreditResult() {
        return reverseProviderCreditResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    
}
