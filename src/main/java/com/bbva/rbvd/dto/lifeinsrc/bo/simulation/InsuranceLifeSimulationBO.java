package com.bbva.rbvd.dto.lifeinsrc.bo.simulation;

import com.bbva.rbvd.dto.lifeinsrc.bo.SimulacionLifePayloadBO;

public class InsuranceLifeSimulationBO {
    private SimulacionLifePayloadBO payload;

    public SimulacionLifePayloadBO getPayload() {
        return payload;
    }

    public void setPayload(SimulacionLifePayloadBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceLifeSimulationBO{");
        sb.append("payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}