package com.bbva.rbvd.dto.lifeinsrc.rimac.quotation;

public class QuotationLifeBO {
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
