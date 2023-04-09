package com.bbva.rbvd.dto.lifeinsrc.aso.gifole;

import com.bbva.rbvd.dto.lifeinsrc.aso.CommonFieldsASO;

public class QuotationASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
