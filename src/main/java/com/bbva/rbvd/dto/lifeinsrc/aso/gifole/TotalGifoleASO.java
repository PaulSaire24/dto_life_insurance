package com.bbva.rbvd.dto.lifeinsrc.aso.gifole;

import com.bbva.rbvd.dto.lifeinsrc.aso.CommonFieldsASO;

public class TotalGifoleASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TotalGifoleASO{");
        sb.append("amount=").append(this.getAmount());
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
