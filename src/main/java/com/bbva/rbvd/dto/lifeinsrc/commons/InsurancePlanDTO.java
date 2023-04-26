package com.bbva.rbvd.dto.lifeinsrc.commons;

import java.util.List;

public class InsurancePlanDTO extends CommonFieldsDTO {

    private Boolean isRecommended;
    private TotalInstallmentDTO totalInstallment;
    private List<CoverageDTO> coverages;

    private List<InstallmentsDTO> installmentPlans;

    public boolean getIsRecommended() {
        return this.isRecommended;
    }
    public void setIsRecommended(boolean isRecommended) { this.isRecommended = isRecommended; }

    public TotalInstallmentDTO getTotalInstallment() { return totalInstallment; }
    public void setTotalInstallment(TotalInstallmentDTO totalInstallment) { this.totalInstallment = totalInstallment; }
    public List<CoverageDTO> getCoverages() { return coverages; }
    public void setCoverages(List<CoverageDTO> coverages) { this.coverages = coverages; }
    public List<InstallmentsDTO> getInstallmentPlans() { return installmentPlans; }
    public void setInstallmentPlans(List<InstallmentsDTO> installmentPlans) { this.installmentPlans = installmentPlans; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsurancePlanDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", isRecommended='").append(isRecommended).append('\'');
        sb.append(", totalInstallment='").append(totalInstallment).append('\'');
        sb.append(", coverages='").append(coverages).append('\'');
        sb.append(", installmentPlans='").append(installmentPlans).append('\'');
        sb.append('}');
        return sb.toString();
    }

}