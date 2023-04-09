package com.bbva.rbvd.dto.lifeinsrc.commons;

import com.bbva.rbvd.dto.lifeinsrc.simulation.CoverageTypeDTO;

public class CoverageDTO extends CommonFieldsDTO {

    private CoverageTypeDTO coverageType;

    public CoverageTypeDTO getCoverageType() { return coverageType; }

    public void setCoverageType(CoverageTypeDTO coverageType) { this.coverageType = coverageType; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageDTO{");
        sb.append("id=").append(this.getId()).append('\'');
        sb.append(", name=").append(this.getName()).append('\'');
        sb.append(", description=").append(this.getDescription()).append('\'');
        sb.append(", isSelected=").append(this.getIsSelected()).append('\'');
        sb.append(", coverageType=").append(coverageType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
