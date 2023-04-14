package com.bbva.rbvd.dto.lifeinsrc.rimac.quotation;

import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.CommonFieldsBO;

import java.util.List;

public class EasyesQuotationPayloadBO extends CommonFieldsBO {

    private List<Long> planes;
    private String codigoExterno;
    private Integer status;
    private String mensaje;
    private List<QuotationDetailBO> detalleCotizacion;

    public List<Long> getPlanes() { return planes; }
    public void setPlanes(List<Long> planes) { this.planes = planes; }
    public String getCodigoExterno() {return codigoExterno;}
    public void setCodigoExterno(String codigoExterno) {this.codigoExterno = codigoExterno;}
    public Integer getStatus() {return status;}
    public void setStatus(Integer status) {this.status = status;}
    public String getMensaje() {return mensaje;}
    public void setMensaje(String mensaje) {this.mensaje = mensaje;}
    public List<QuotationDetailBO> getDetalleCotizacion() {return detalleCotizacion;}
    public void setDetalleCotizacion(List<QuotationDetailBO> detalleCotizacion) {this.detalleCotizacion = detalleCotizacion;}

}
