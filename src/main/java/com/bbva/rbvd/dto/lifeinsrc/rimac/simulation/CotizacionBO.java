package com.bbva.rbvd.dto.lifeinsrc.rimac.simulation;

import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.CommonFieldsBO;
import com.bbva.rbvd.dto.lifeinsrc.rimac.commons.PlanBO;

public class CotizacionBO extends CommonFieldsBO {

    private String diasVigencia;
    private String fechaFinVigencia;
    private PlanBO plan;

    private Long indicadorBloqueo;

    public String getDiasVigencia() { return diasVigencia; }
    public void setDiasVigencia(String diasVigencia) { this.diasVigencia = diasVigencia; }
    public String getFechaFinVigencia() { return fechaFinVigencia; }
    public void setFechaFinVigencia(String fechaFinVigencia) { this.fechaFinVigencia = fechaFinVigencia; }
    public PlanBO getPlan() { return plan; }
    public void setPlan(PlanBO plan) { this.plan = plan; }

    public Long getIndicadorBloqueo() { return indicadorBloqueo; }

    public void setIndicadorBloqueo(Long indicadorBloqueo) { this.indicadorBloqueo = indicadorBloqueo; }
}
