package com.bbva.rbvd.dto.lifeinsrc.rimac.commons;

import java.math.BigDecimal;

public class CommonFieldsBO {

    private String producto;
    private String moneda;
    private String tipoDocumento;
    private String numeroDocumento;
    private BigDecimal primaNeta;
    private BigDecimal primaBruta;
    private String cotizacion;

    private BigDecimal sumaAseguradaMinima;
    private BigDecimal sumaAseguradaMaxima;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommonFieldsBO{");
        sb.append("producto='").append(producto).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
        sb.append(", numeroDocumento='").append(numeroDocumento).append('\'');
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", cotizacion='").append(cotizacion).append('\'');
        sb.append(", sumaAseguradaMinima=").append(sumaAseguradaMinima);
        sb.append(", sumaAseguradaMaxima=").append(sumaAseguradaMaxima);
        sb.append('}');
        return sb.toString();
    }
}
