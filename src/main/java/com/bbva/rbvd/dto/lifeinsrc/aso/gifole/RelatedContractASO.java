package com.bbva.rbvd.dto.lifeinsrc.aso.gifole;

import com.bbva.rbvd.dto.lifeinsrc.aso.CommonFieldsASO;

public class RelatedContractASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RelatedContractASO{");
        sb.append("number=").append(this.getNumber()).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
