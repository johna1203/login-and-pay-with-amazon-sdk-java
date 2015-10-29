package com.amazon.payments.lpa.response.autogenerated.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderCreditSummaryList", propOrder = {
    "member"
})
public class ProviderCreditSummaryList {

    @XmlElement(required = true)
    protected List<ProviderCreditSummary> member;

    public ProviderCreditSummaryList() {
        super();
    }

    public List<ProviderCreditSummary> getMember() {
        if (member == null) {
            member = new ArrayList<ProviderCreditSummary>();
        }
        return this.member;
    }




}
