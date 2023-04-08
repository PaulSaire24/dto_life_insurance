package com.bbva.rbvd.dto.lifeinsrc.commons;

public class InsuredAmountDTO extends CommonFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuredAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}