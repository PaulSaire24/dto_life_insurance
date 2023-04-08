package com.bbva.rbvd.dto.lifeinsrc.bo;

import java.util.List;

public class PlanBO extends CommonFieldsBO {

    private Long plan;
    private String descripcionPlan;
    private List<FinanciamientoBO> financiamientos;
    private List<CoberturaBO> coberturas;

    public Long getPlan() { return plan; }
    public void setPlan(Long plan) { this.plan = plan; }
    public String getDescripcionPlan() { return descripcionPlan; }
    public void setDescripcionPlan(String descripcionPlan) { this.descripcionPlan = descripcionPlan; }
    public List<FinanciamientoBO> getFinanciamientos() { return financiamientos; }
    public void setFinanciamientos(List<FinanciamientoBO> financiamientos) { this.financiamientos = financiamientos; }
    public List<CoberturaBO> getCoberturas() { return coberturas; }
    public void setCoberturas(List<CoberturaBO> coberturas) { this.coberturas = coberturas; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanBO{");
        sb.append("plan=").append(plan);
        sb.append(", descripcionPlan='").append(descripcionPlan).append('\'');
        sb.append(", moneda='").append(this.getMoneda()).append('\'');
        sb.append(", primaNeta=").append(this.getPrimaNeta());
        sb.append(", primaBruta=").append(this.getPrimaBruta());
        sb.append(", financiamientos=").append(financiamientos);
        sb.append(", coberturas=").append(coberturas);
        sb.append('}');
        return sb.toString();
    }

}
