package com.bbva.rbvd.dto.lifeinsrc.aso.gifole;

import com.bbva.rbvd.dto.lifeinsrc.aso.CommonFieldsASO;

public class PeriodASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PeriodASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
