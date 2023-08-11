package com.bbva.rbvd.dto.lifeinsrc.rimac.quotation;

import java.io.Serializable;

public class QuotationLifeBO implements Serializable {
    private static final long serialVersionUID = 1L;


    private QuotationLifePayloadBO payload;

    public QuotationLifePayloadBO getPayload() {return payload;}
    public void setPayload(QuotationLifePayloadBO payload) {this.payload = payload;}

    @Override
    public String toString() {
        return "QuotationLifeBO{" +
                "payload=" + payload +
                '}';
    }
}
