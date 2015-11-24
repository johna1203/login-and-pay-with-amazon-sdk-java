package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId"
})
@XmlRootElement(name = "ResponseMetadata")
public class ResponseMetadata {

    @XmlElement(name = "RequestId", required = true)
    protected String requestId;

    public ResponseMetadata() {
        super();
    }


    public String getRequestId() {
        return requestId;
    }

    /**
     * Returns the string representation of ResponseMetadata
     */
    @Override
    public String toString() {
        return "ResponseMetadata{" + "requestId=" + requestId + '}';
    }



}