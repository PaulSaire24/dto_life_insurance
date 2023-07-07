package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import java.math.BigDecimal;
import java.util.List;

public class PlanBO extends CommonFieldsBO {

    private Long plan;
    private String descripcionPlan;
    private List<FinanciamientoBO> financiamientos;
    private List<CoberturaBO> coberturas;
    private List<DatoParticularBO> datosParticulares;
    private BigDecimal cumulo;
    private BigDecimal montoDevolucion;
    private BigDecimal cumuloCoberturas;
    private BigDecimal cumuloTotal;
    private BigDecimal cumuloDisponible;

	
	public Long getPlan() { return plan; }
    public void setPlan(Long plan) { this.plan = plan; }
    public String getDescripcionPlan() { return descripcionPlan; }
    public void setDescripcionPlan(String descripcionPlan) { this.descripcionPlan = descripcionPlan; }
    public List<FinanciamientoBO> getFinanciamientos() { return financiamientos; }
    public void setFinanciamientos(List<FinanciamientoBO> financiamientos) { this.financiamientos = financiamientos; }
    public List<CoberturaBO> getCoberturas() { return coberturas; }
    public void setCoberturas(List<CoberturaBO> coberturas) { this.coberturas = coberturas; }
    public List<DatoParticularBO> getDatosParticulares() {return datosParticulares;}
    public void setDatosParticulares(List<DatoParticularBO> datosParticulares) {this.datosParticulares = datosParticulares;}

    public BigDecimal getCumulo() {
        return cumulo;
    }

    public void setCumulo(BigDecimal cumulo) {
        this.cumulo = cumulo;
    }

    public BigDecimal getMontoDevolucion() {
        return montoDevolucion;
    }

    public void setMontoDevolucion(BigDecimal montoDevolucion) {
        this.montoDevolucion = montoDevolucion;
    }

    public BigDecimal getCumuloCoberturas() {
        return cumuloCoberturas;
    }

    public void setCumuloCoberturas(BigDecimal cumuloCoberturas) {
        this.cumuloCoberturas = cumuloCoberturas;
    }

    public BigDecimal getCumuloTotal() {
        return cumuloTotal;
    }

    public void setCumuloTotal(BigDecimal cumuloTotal) {
        this.cumuloTotal = cumuloTotal;
    }

    public BigDecimal getCumuloDisponible() {
        return cumuloDisponible;
    }

    public void setCumuloDisponible(BigDecimal cumuloDisponible) {
        this.cumuloDisponible = cumuloDisponible;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanBO{");
        sb.append("plan=").append(plan);
        sb.append(", descripcionPlan='").append(descripcionPlan).append('\'');
        sb.append(", financiamientos=").append(financiamientos);
        sb.append(", coberturas=").append(coberturas);
        sb.append(", datosParticulares=").append(datosParticulares);
        sb.append(", cumulo=").append(cumulo);
        sb.append(", montoDevolucion=").append(montoDevolucion);
        sb.append(", cumuloCoberturas=").append(cumuloCoberturas);
        sb.append(", cumuloTotal=").append(cumuloTotal);
        sb.append(", cumuloDisponible=").append(cumuloDisponible);
        sb.append('}');
        return sb.toString();
    }
}
