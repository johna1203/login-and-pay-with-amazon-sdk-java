package com.amazon.payments.lpa.response.autogenerated.model;

import com.amazon.payments.lpa.response.autogenerated.model.IdList;
import com.amazon.payments.lpa.response.autogenerated.model.ProviderCreditSummaryList;
import com.amazon.payments.lpa.response.autogenerated.model.Status;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
        
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaptureDetails", propOrder = {
    "amazonCaptureId",
    "captureReferenceId",
    "sellerCaptureNote",
    "captureAmount",
    "refundedAmount",
    "captureFee",
    "idList",
    "creationTimestamp",
    "captureStatus",
    "softDescriptor",
    "providerCreditSummaryList"
})
public class CaptureDetails {

    @XmlElement(name = "AmazonCaptureId", required = true)
    protected String amazonCaptureId;
    @XmlElement(name = "CaptureReferenceId", required = true)
    protected String captureReferenceId;
    @XmlElement(name = "SellerCaptureNote", required = true)
    protected String sellerCaptureNote;
    @XmlElement(name = "CaptureAmount", required = true)
    protected Price captureAmount;
    @XmlElement(name = "RefundedAmount", required = true)
    protected Price refundedAmount;
    @XmlElement(name = "CaptureFee", required = true)
    protected Price captureFee;
    @XmlElement(name = "IdList", required = true)
    protected IdList idList;
    @XmlElement(name = "CreationTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    @XmlElement(name = "CaptureStatus", required = true)
    protected Status captureStatus;
    @XmlElement(name = "SoftDescriptor", required = true)
    protected String softDescriptor;
    @XmlElement(name = "ProviderCreditSummaryList")
    protected ProviderCreditSummaryList providerCreditSummaryList;

    public CaptureDetails() {
        super();
    }

    public String getAmazonCaptureId() {
        return amazonCaptureId;
    }

    public String getCaptureReferenceId() {
        return captureReferenceId;
    }

    public String getSellerCaptureNote() {
        return sellerCaptureNote;
    }

    public Price getCaptureAmount() {
        return captureAmount;
    }

    public Price getRefundedAmount() {
        return refundedAmount;
    }

    public Price getCaptureFee() {
        return captureFee;
    }

    public IdList getIdList() {
        return idList;
    }
    
    public XMLGregorianCalendar getCreationTimestamp() {
        return creationTimestamp;
    }

    public Status getCaptureStatus() {
        return captureStatus;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public ProviderCreditSummaryList getProviderCreditSummaryList() {
        return providerCreditSummaryList;
    }

}
