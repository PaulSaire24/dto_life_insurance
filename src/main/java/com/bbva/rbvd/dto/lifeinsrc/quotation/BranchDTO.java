package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;

public class BranchDTO extends CommonFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BranchDTO{");
        sb.append("id=").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
