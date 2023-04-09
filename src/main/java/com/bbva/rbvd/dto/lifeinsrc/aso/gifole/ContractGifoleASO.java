package com.bbva.rbvd.dto.lifeinsrc.aso.gifole;

import com.bbva.rbvd.dto.lifeinsrc.aso.CommonFieldsASO;

public class ContractGifoleASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractGifoleASO{");
        sb.append("number='").append(this.getNumber()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
