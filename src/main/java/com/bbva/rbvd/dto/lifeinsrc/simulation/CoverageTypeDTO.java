package com.bbva.rbvd.dto.lifeinsrc.simulation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;

public class CoverageTypeDTO extends CommonFieldsDTO {

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageTypeDTO{");
        sb.append(", id=").append(this.getId()).append('\'');
        sb.append(", name=").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
