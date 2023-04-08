package com.bbva.rbvd.dto.lifeinsrc.bo;

import java.math.BigDecimal;
import java.util.Date;

public class CuotaFinanciamientoBO extends CommonFieldsBO {

    private Long cuota;
    private BigDecimal monto;
    private Date fechaVencimiento;

    public Long getCuota() { return cuota; }
    public void setCuota(Long cuota) { this.cuota = cuota; }
    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuotaFinanciamientoBO{");
        sb.append("cuota=").append(cuota);
        sb.append(", monto=").append(monto);
        sb.append(", fechaVencimiento='").append(fechaVencimiento).append('\'');
        sb.append(", moneda='").append(this.getMoneda()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
