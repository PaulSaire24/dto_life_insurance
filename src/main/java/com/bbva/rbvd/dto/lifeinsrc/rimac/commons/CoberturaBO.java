package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CoberturaBO extends CommonFieldsBO implements Serializable {

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
	private Integer orden;


	
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


	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CoberturaBO{");
		sb.append("cobertura=").append(cobertura);
		sb.append(", descripcionCobertura='").append(descripcionCobertura).append('\'');
		sb.append(", tipoCobertura='").append(tipoCobertura).append('\'');
		sb.append(", sumaAsegurada=").append(sumaAsegurada);
		sb.append(", principal='").append(principal).append('\'');
		sb.append(", observacionCobertura='").append(observacionCobertura).append('\'');
		sb.append(", detalleCobertura='").append(detalleCobertura).append('\'');
		sb.append(", porcentajeSeleccionado='").append(porcentajeSeleccionado).append('\'');
		sb.append(", condicion='").append(condicion).append('\'');
		sb.append(", codigoCobertura=").append(codigoCobertura);
		sb.append(", indSeleccionar='").append(indSeleccionar).append('\'');
		sb.append(", fechaFin=").append(fechaFin);
		sb.append(", orden=").append(orden);
		sb.append('}');
		return sb.toString();
	}
}
