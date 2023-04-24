package com.bbva.rbvd.dto.lifeinsrc.commons;

import java.util.List;

public class InsuranceProductDTO extends CommonFieldsDTO {

    private List<InsurancePlanDTO> plans;

    public List<InsurancePlanDTO> getPlans() { return plans; }
    public void setPlans(List<InsurancePlanDTO> plans) { this.plans = plans; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceProductDTO{");
        sb.append("id=").append(this.getId());
        sb.append(", plans=").append(plans);
        sb.append('}');
        return sb.toString();
    }

}