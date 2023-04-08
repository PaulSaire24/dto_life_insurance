package com.bbva.rbvd.dto.lifeinsrc.utils;

public enum RBVDProperties {

    SIMULATION_LIFE_URI("simulation.rimac.life.uri"),
    SIMULATION_LIFE_RIMAC("simulationlife.rimac");
    private final String value;

    private RBVDProperties(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
