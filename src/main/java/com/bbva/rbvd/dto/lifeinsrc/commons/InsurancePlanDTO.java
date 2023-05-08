package com.bbva.rbvd.dto.lifeinsrc.commons;

import java.util.List;

public class InsurancePlanDTO extends CommonFieldsDTO {

    private TotalInstallmentDTO totalInstallment;
    private List<CoverageDTO> coverages;
    private List<InstallmentsDTO> installmentPlans;

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
        sb.append(", totalInstallment='").append(totalInstallment).append('\'');
        sb.append(", coverages='").append(coverages).append('\'');
        sb.append(", installmentPlans='").append(installmentPlans).append('\'');
        sb.append(", isAvailable='").append(this.getIsAvailable()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}