package com.bbva.rbvd.dto.lifeinsrc.commons;

import com.bbva.rbvd.dto.lifeinsrc.simulation.CoverageTypeDTO;
import com.bbva.rbvd.dto.lifeinsrc.simulation.InsuranceLimitsDTO;

public class CoverageDTO extends CommonFieldsDTO {

    private CoverageTypeDTO coverageType;
    private UnitDTO unit;
    private InsuredAmountDTO insuredAmount;
    private PaymentAmountDTO feePaymentAmount;
    private InsuranceLimitsDTO coverageLimits;

    public CoverageTypeDTO getCoverageType() { return coverageType; }
    public void setCoverageType(CoverageTypeDTO coverageType) { this.coverageType = coverageType; }
    public UnitDTO getUnit() {return unit;}
    public void setUnit(UnitDTO unit) {this.unit = unit;}

    public InsuredAmountDTO getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(InsuredAmountDTO insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public PaymentAmountDTO getFeePaymentAmount() {
        return feePaymentAmount;
    }

    public void setFeePaymentAmount(PaymentAmountDTO feePaymentAmount) {
        this.feePaymentAmount = feePaymentAmount;
    }

    public InsuranceLimitsDTO getCoverageLimits() {
        return coverageLimits;
    }

    public void setCoverageLimits(InsuranceLimitsDTO coverageLimits) {
        this.coverageLimits = coverageLimits;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageDTO{");
        sb.append("id=").append(this.getId()).append('\'');
        sb.append(", name=").append(this.getName()).append('\'');
        sb.append(", description=").append(this.getDescription()).append('\'');
        sb.append(", isSelected=").append(this.getIsSelected()).append('\'');
        sb.append(", coverageType=").append(coverageType);
        sb.append(", unit=").append(unit);
        sb.append(", insuredAmount=").append(insuredAmount).append('\'');
        sb.append(", feePaymentAmount=").append(feePaymentAmount).append('\'');
        sb.append(", coverageLimits=").append(coverageLimits).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
