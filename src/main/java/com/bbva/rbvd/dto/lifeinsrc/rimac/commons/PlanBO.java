package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import java.util.List;

public class PlanBO extends CommonFieldsBO {

    private Long plan;
    private String descripcionPlan;
    private List<FinanciamientoBO> financiamientos;
    private List<CoberturaBO> coberturas;
    private List<DatoParticularBO> datosParticulares;
    
    private Double cumulo;
    
    

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
    
    
    
	@Override
	public String toString() {
		return "PlanBO [plan=" + plan + ", descripcionPlan=" + descripcionPlan + ", financiamientos=" + financiamientos
				+ ", coberturas=" + coberturas + ", datosParticulares=" + datosParticulares + ", cumulo=" + cumulo
				+ "]";
	}
    
    
    

}
