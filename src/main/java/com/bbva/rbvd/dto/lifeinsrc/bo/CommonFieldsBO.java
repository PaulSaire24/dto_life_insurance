package com.bbva.rbvd.dto.lifeinsrc.bo;

import java.math.BigDecimal;

public class CommonFieldsBO {

    private String tipoDocumento;
    private String numeroDocumento;

    private BigDecimal primaNeta;

    private BigDecimal primaBruta;

    private String moneda;

    private BigDecimal sumaAsegurada;

    private String principal;

    private String observacionCobertura;

    private String condicion;

    private Long httpStatus;

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public String getNumeroDocumento() { return numeroDocumento; }
    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }
    public BigDecimal getPrimaNeta() { return primaNeta; }
    public void setPrimaNeta(BigDecimal primaNeta) { this.primaNeta = primaNeta; }
    public BigDecimal getPrimaBruta() { return primaBruta; }
    public void setPrimaBruta(BigDecimal primaBruta) { this.primaBruta = primaBruta; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public BigDecimal getSumaAsegurada() { return sumaAsegurada; }
    public void setSumaAsegurada(BigDecimal sumaAsegurada) { this.sumaAsegurada = sumaAsegurada; }
    public String getPrincipal() { return principal; }
    public void setPrincipal(String principal) { this.principal = principal; }
    public String getObservacionCobertura() { return observacionCobertura; }
    public void setObservacionCobertura(String observacionCobertura) { this.observacionCobertura = observacionCobertura; }
    public String getCondicion() { return condicion; }
    public void setCondicion(String condicion) { this.condicion = condicion; }
    public Long getHttpStatus() { return this.httpStatus; }
    public void setHttpStatus(Long httpStatus) {
        this.httpStatus = httpStatus;
    }

}
