package com.bbva.rbvd.dto.lifeinsrc.rimac.simulation;

import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.DatoParticularBO;
import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.FinanciamientoBO;
import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.CommonFieldsBO;

import java.util.List;

public class SimulacionLifePayloadBO extends CommonFieldsBO {

    private List<CotizacionBO> cotizaciones;
    private List<Long> planes;
    private List<DatoParticularBO> datosParticulares;
    private List<FinanciamientoBO> financiamiento;
    private List<Integer> periodosConDescuentoPrima;
    private AseguradoBO asegurado;

    public List<CotizacionBO> getCotizaciones() { return cotizaciones; }
    public void setCotizaciones(List<CotizacionBO> cotizaciones) { this.cotizaciones = cotizaciones; }
    public List<Long> getPlanes() { return planes; }
    public void setPlanes(List<Long> planes) { this.planes = planes; }
    public List<DatoParticularBO> getDatosParticulares() { return datosParticulares; }
    public void setDatosParticulares(List<DatoParticularBO> datosParticulares) { this.datosParticulares = datosParticulares; }
    public List<Integer> getPeriodosConDescuentoPrima() {return periodosConDescuentoPrima;}
    public void setPeriodosConDescuentoPrima(List<Integer> periodosConDescuentoPrima) {this.periodosConDescuentoPrima = periodosConDescuentoPrima;}
    public List<FinanciamientoBO> getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(List<FinanciamientoBO> financiamiento) { this.financiamiento = financiamiento; }
    public AseguradoBO getAsegurado() { return asegurado; }
    public void setAsegurado(AseguradoBO asegurado) { this.asegurado = asegurado; }

}
