package com.bbva.rbvd.dto.lifeinsrc.rimac.quotation;

import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.CommonFieldsBO;
import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.PlanBO;

import java.util.List;

public class QuotationDetailBO extends CommonFieldsBO {

    private String fechaCreacion;
    private String fechaExpiracion;
    private String indicadorSeleccionado;
    private String nroDocumento;
    private List<PlanBO> planes;

    public String getFechaCreacion() {return fechaCreacion;}
    public void setFechaCreacion(String fechaCreacion) {this.fechaCreacion = fechaCreacion;}
    public String getFechaExpiracion() {return fechaExpiracion;}
    public void setFechaExpiracion(String fechaExpiracion) {this.fechaExpiracion = fechaExpiracion;}
    public String getIndicadorSeleccionado() {return indicadorSeleccionado;}
    public void setIndicadorSeleccionado(String indicadorSeleccionado) {this.indicadorSeleccionado = indicadorSeleccionado;}
    public String getNroDocumento() {return nroDocumento;}
    public void setNroDocumento(String nroDocumento) {this.nroDocumento = nroDocumento;}
    public List<PlanBO> getPlanes() {return planes;}
    public void setPlanes(List<PlanBO> planes) {this.planes = planes;}

}
