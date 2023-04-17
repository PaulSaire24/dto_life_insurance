package com.bbva.rbvd.dto.lifeinsrc.commons;

import com.bbva.rbvd.dto.lifeinsrc.rimac.quotation.UnitDTO;
import com.bbva.rbvd.dto.lifeinsrc.simulation.CoverageTypeDTO;

public class CoverageDTO extends CommonFieldsDTO {

    private CoverageTypeDTO coverageType;
    private UnitDTO unit;

    public CoverageTypeDTO getCoverageType() { return coverageType; }
    public void setCoverageType(CoverageTypeDTO coverageType) { this.coverageType = coverageType; }
    public UnitDTO getUnit() {return unit;}
    public void setUnit(UnitDTO unit) {this.unit = unit;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageDTO{");
        sb.append("id=").append(this.getId()).append('\'');
        sb.append(", name=").append(this.getName()).append('\'');
        sb.append(", description=").append(this.getDescription()).append('\'');
        sb.append(", isSelected=").append(this.getIsSelected()).append('\'');
        sb.append(", coverageType=").append(coverageType);
        sb.append(", unit=").append(unit);
        sb.append('}');
        return sb.toString();
    }

}
