package com.bbva.rbvd.dto.lifeinsrc.dao;

import com.bbva.rbvd.dto.lifeinsrc.simulation.LifeSimulationDTO;

public class SimulationParticipantDAO extends CommonsDAO {
    private LifeSimulationDTO response;

    public LifeSimulationDTO getResponse() {
        return response;
    }

    public void setResponse(LifeSimulationDTO response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "SimulationParticipantDAO{" +
                "response=" + response +
                '}';
    }
}
