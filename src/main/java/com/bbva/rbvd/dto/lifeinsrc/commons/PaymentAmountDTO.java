package com.bbva.rbvd.dto.lifeinsrc.commons;


public class PaymentAmountDTO extends CommonFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
