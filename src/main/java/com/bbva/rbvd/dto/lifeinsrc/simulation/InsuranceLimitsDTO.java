package com.bbva.rbvd.dto.lifeinsrc.simulation;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuredAmountDTO;

public class InsuranceLimitsDTO extends AbstractDTO {

    private InsuredAmountDTO minimumAmount;
    private InsuredAmountDTO maximumAmount;

    public InsuredAmountDTO getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(InsuredAmountDTO minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public InsuredAmountDTO getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(InsuredAmountDTO maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceLimitsDTO{");
        sb.append("minimumAmount=").append(minimumAmount);
        sb.append(", maximumAmount=").append(maximumAmount);
        sb.append('}');
        return sb.toString();
    }
}
