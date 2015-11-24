package com.amazon.payments.paywithamazon.response.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "error",
    "requestId"
})
@XmlRootElement(name = "ErrorResponse")
public class ErrorResponse {

    @XmlElement(name = "Error", required = true)
    protected List<Error> error;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;

    public ErrorResponse() {
        super();
    }


    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

    public String getRequestId() {
        return requestId;
    }



}