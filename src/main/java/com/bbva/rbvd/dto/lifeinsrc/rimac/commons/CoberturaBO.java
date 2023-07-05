package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import java.math.BigDecimal;
import java.util.Date;

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
    
    private Long codigoCobertura;
    private String indSeleccionar;
    private Date fechaFin;
    private BigDecimal sumaAseguradaMinima;
    private BigDecimal SumaAseguradaMaxima;
    
    
    
    
   
    
    public BigDecimal getSumaAseguradaMinima() {
		return sumaAseguradaMinima;
	}
	public void setSumaAseguradaMinima(BigDecimal sumaAseguradaMinima) {
		this.sumaAseguradaMinima = sumaAseguradaMinima;
	}
	
	public BigDecimal getSumaAseguradaMaxima() {
		return SumaAseguradaMaxima;
	}
	public void setSumaAseguradaMaxima(BigDecimal sumaAseguradaMaxima) {
		SumaAseguradaMaxima = sumaAseguradaMaxima;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public Long getCodigoCobertura() {
		return codigoCobertura;
	}
	public void setCodigoCobertura(Long codigoCobertura) {
		this.codigoCobertura = codigoCobertura;
	}
	public String getIndSeleccionar() {
		return indSeleccionar;
	}
	public void setIndSeleccionar(String indSeleccionar) {
		this.indSeleccionar = indSeleccionar;
	}
	
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
    
    
    
	@Override
	public String toString() {
		return "CoberturaBO [cobertura=" + cobertura + ", descripcionCobertura=" + descripcionCobertura
				+ ", tipoCobertura=" + tipoCobertura + ", sumaAsegurada=" + sumaAsegurada + ", principal=" + principal
				+ ", observacionCobertura=" + observacionCobertura + ", detalleCobertura=" + detalleCobertura
				+ ", porcentajeSeleccionado=" + porcentajeSeleccionado + ", condicion=" + condicion
				+ ", codigoCobertura=" + codigoCobertura + ", indSeleccionar=" + indSeleccionar + ", fechaFin="
				+ fechaFin + ", sumaAseguradaMinima=" + sumaAseguradaMinima + ", SumaAseguradaMaxima="
				+ SumaAseguradaMaxima + "]";
	}
    
    
	
    
    
	
    
    
    
    
    

}
