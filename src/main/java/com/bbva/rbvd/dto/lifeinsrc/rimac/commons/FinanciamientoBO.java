package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import java.math.BigDecimal;

import java.util.List;

public class FinanciamientoBO extends CommonFieldsBO {

    private Long financiamiento;
    private String periodicidad;
    private Long numeroCuotas;
    private String fechaInicio;
    private String fechaFin;
    private String indicadorDescuentoPrima;
    private BigDecimal montoNetoFraccionado;
    private BigDecimal montoPago;
    private List<CuotaFinanciamientoBO> cuotasFinanciamiento;

    public Long getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(Long financiamiento) { this.financiamiento = financiamiento; }
    public String getPeriodicidad() { return periodicidad; }
    public void setPeriodicidad(String periodicidad) { this.periodicidad = periodicidad; }
    public Long getNumeroCuotas() { return numeroCuotas; }
    public void setNumeroCuotas(Long numeroCuotas) { this.numeroCuotas = numeroCuotas; }
    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public String getFechaFin() {return fechaFin;}
    public void setFechaFin(String fechaFin) {this.fechaFin = fechaFin;}
    public String getIndicadorDescuentoPrima() {return indicadorDescuentoPrima;}
    public void setIndicadorDescuentoPrima(String indicadorDescuentoPrima) {this.indicadorDescuentoPrima = indicadorDescuentoPrima;}
    public BigDecimal getMontoNetoFraccionado() { return montoNetoFraccionado; }
    public void setMontoNetoFraccionado(BigDecimal montoNetoFraccionado) { this.montoNetoFraccionado = montoNetoFraccionado; }
    public BigDecimal getMontoPago() {return montoPago;}
    public void setMontoPago(BigDecimal montoPago) {this.montoPago = montoPago;}
    public List<CuotaFinanciamientoBO> getCuotasFinanciamiento() { return cuotasFinanciamiento; }
    public void setCuotasFinanciamiento(List<CuotaFinanciamientoBO> cuotasFinanciamiento) { this.cuotasFinanciamiento = cuotasFinanciamiento; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinanciamientoBO{");
        sb.append("financiamiento=").append(financiamiento).append('\'');
        sb.append(", periodicidad='").append(periodicidad).append('\'');
        sb.append(", numeroCuotas=").append(numeroCuotas).append('\'');
        sb.append(", indicadorDescuentoPrima=").append(indicadorDescuentoPrima).append('\'');
        sb.append(", montoNetoFraccionado=").append(montoNetoFraccionado).append('\'');
        sb.append(", montoPago=").append(montoPago).append('\'');
        sb.append(", fechaInicio='").append(fechaInicio).append('\'');
        sb.append(", cuotasFinanciamiento=").append(cuotasFinanciamiento);
        sb.append('}');
        return sb.toString();
    }

}
