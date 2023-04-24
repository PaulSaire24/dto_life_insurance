package com.bbva.rbvd.dto.lifeinsrc.commons;


public class TotalInstallmentDTO extends CommonFieldsDTO {

    private PeriodDTO period;

    public PeriodDTO getPeriod() { return period; }

    public void setPeriod(PeriodDTO period) { this.period = period; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TotalInstallmentDTO{");
        sb.append("period=").append(period).append('\'');
        sb.append(", amount=").append(this.getAmount()).append('\'');
        sb.append(", currency=").append(this.getCurrency());
        sb.append('}');
        return sb.toString();
    }
}
