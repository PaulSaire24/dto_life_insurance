package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonFieldsBO {

    private String producto;
    private String moneda;
    private String tipoDocumento;
    private String numeroDocumento;
    private BigDecimal primaNeta;
    private BigDecimal primaBruta;
    private BigDecimal precioNormal;
    private String cotizacion;
    private BigDecimal sumaAseguradaMinima;
    private BigDecimal sumaAseguradaMaxima;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;


    public String getProducto() {return producto;}
    public void setProducto(String producto) {this.producto = producto;}
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public String getNumeroDocumento() { return numeroDocumento; }
    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }
    public BigDecimal getPrimaNeta() { return primaNeta; }
    public void setPrimaNeta(BigDecimal primaNeta) { this.primaNeta = primaNeta; }
    public BigDecimal getPrimaBruta() { return primaBruta; }
    public void setPrimaBruta(BigDecimal primaBruta) { this.primaBruta = primaBruta; }
    public String getCotizacion() { return cotizacion; }
    public void setCotizacion(String cotizacion) { this.cotizacion = cotizacion; }

    public BigDecimal getSumaAseguradaMinima() {
        return sumaAseguradaMinima;
    }

    public void setSumaAseguradaMinima(BigDecimal sumaAseguradaMinima) {
        this.sumaAseguradaMinima = sumaAseguradaMinima;
    }

    public BigDecimal getSumaAseguradaMaxima() {
        return sumaAseguradaMaxima;
    }

    public void setSumaAseguradaMaxima(BigDecimal sumaAseguradaMaxima) {
        this.sumaAseguradaMaxima = sumaAseguradaMaxima;
    }

    public BigDecimal getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(BigDecimal precioNormal) {
        this.precioNormal = precioNormal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    @Override
    public String toString() {
        return "CommonFieldsBO{" +
                "producto='" + producto + '\'' +
                ", moneda='" + moneda + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", primaNeta=" + primaNeta +
                ", primaBruta=" + primaBruta +
                ", precioNormal=" + precioNormal +
                ", cotizacion='" + cotizacion + '\'' +
                ", sumaAseguradaMinima=" + sumaAseguradaMinima +
                ", sumaAseguradaMaxima=" + sumaAseguradaMaxima +
                ", nombres='" + nombres + '\'' +
                ", apePaterno='" + apePaterno + '\'' +
                ", apeMaterno='" + apeMaterno + '\'' +
                '}';
    }
}
