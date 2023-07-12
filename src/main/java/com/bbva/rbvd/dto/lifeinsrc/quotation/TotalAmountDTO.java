package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;

public class TotalAmountDTO extends CommonFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TotalAmountDTO{");
        sb.append("amount=").append(this.getAmount()).append('\'');
        sb.append(", currency=").append(this.getCurrency());
        sb.append('}');
        return sb.toString();
    }

}
