package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;

public class PaymentProductDTO extends CommonFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentProductDTO{");
        sb.append("id=").append(this.getId());
        sb.append('}');
        return sb.toString();
    }

}
