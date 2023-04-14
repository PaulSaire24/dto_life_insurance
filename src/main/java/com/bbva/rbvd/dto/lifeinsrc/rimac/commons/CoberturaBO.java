package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import java.math.BigDecimal;

public class CoberturaBO extends CommonFieldsBO {

    private Long cobertura;
    private String descripcionCobertura;
    private String tipoCobertura;
    private BigDecimal sumaAsegurada;
    private String principal;
    private String observacionCobertura;
    private String detalleCobertura;
    private String porcentajeSeleccionado;
    private String condicion;

    public Long getCobertura() { return cobertura; }
    public void setCobertura(Long cobertura) { this.cobertura = cobertura; }
    public String getDescripcionCobertura() { return descripcionCobertura; }
    public void setDescripcionCobertura(String descripcionCobertura) { this.descripcionCobertura = descripcionCobertura; }
    public String getTipoCobertura() {return tipoCobertura;}
    public void setTipoCobertura(String tipoCobertura) {this.tipoCobertura = tipoCobertura;}
    public BigDecimal getSumaAsegurada() {return sumaAsegurada;}
    public void setSumaAsegurada(BigDecimal sumaAsegurada) {this.sumaAsegurada = sumaAsegurada;}
    public String getPrincipal() {return principal;}
    public void setPrincipal(String principal) {this.principal = principal;}
    public String getObservacionCobertura() {return observacionCobertura;}
    public void setObservacionCobertura(String observacionCobertura) {this.observacionCobertura = observacionCobertura;}
    public String getDetalleCobertura() {return detalleCobertura;}
    public void setDetalleCobertura(String detalleCobertura) {this.detalleCobertura = detalleCobertura;}
    public String getPorcentajeSeleccionado() {return porcentajeSeleccionado;}
    public void setPorcentajeSeleccionado(String porcentajeSeleccionado) {this.porcentajeSeleccionado = porcentajeSeleccionado;}
    public String getCondicion() {return condicion;}
    public void setCondicion(String condicion) {this.condicion = condicion;}

}
