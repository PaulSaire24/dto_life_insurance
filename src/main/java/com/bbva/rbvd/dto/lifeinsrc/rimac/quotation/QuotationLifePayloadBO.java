package com.bbva.rbvd.dto.lifeinsrc.rimac.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;
import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.PlanBO;

import java.util.List;

public class QuotationLifePayloadBO extends CommonFieldsDTO {
    private List<PlanBO> planes;
    private String codigoExterno;
    private Integer status;
    private String mensaje;
    private List<QuotationDetailBO> detalleCotizacion;

    public List<PlanBO> getPlanes() { return planes; }
    public void setPlanes(List<PlanBO> planes) { this.planes = planes; }
    public String getCodigoExterno() {return codigoExterno;}
    public void setCodigoExterno(String codigoExterno) {this.codigoExterno = codigoExterno;}
    public Integer getStatus() {return status;}
    public void setStatus(Integer status) {this.status = status;}
    public String getMensaje() {return mensaje;}
    public void setMensaje(String mensaje) {this.mensaje = mensaje;}
    public List<QuotationDetailBO> getDetalleCotizacion() {return detalleCotizacion;}
    public void setDetalleCotizacion(List<QuotationDetailBO> detalleCotizacion) {this.detalleCotizacion = detalleCotizacion;}

}
