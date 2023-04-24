package com.bbva.rbvd.dto.lifeinsrc.mock;


import com.bbva.rbvd.dto.lifeinsrc.rimac.simulation.InsuranceLifeSimulationBO;
import com.bbva.rbvd.dto.lifeinsrc.simulation.LifeSimulationDTO;

import java.io.IOException;

public class MockData {

    private static final MockData INSTANCE = new MockData();

    private final ObjectMapperHelper objectMapperHelper;

    private MockData() {objectMapperHelper = ObjectMapperHelper.getInstance();}

    public static MockData getInstance() {
        return INSTANCE;
    }

    public LifeSimulationDTO getInsuranceSimulationRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationRequest.json"),
                LifeSimulationDTO.class);
    }

    public LifeSimulationDTO getInsuranceSimulationResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationResponse.json"),
                LifeSimulationDTO.class);
    }

    public InsuranceLifeSimulationBO getInsuranceRimacSimulationRequest() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationRequestRimac.json"),
                InsuranceLifeSimulationBO.class);
    }

    public InsuranceLifeSimulationBO getInsuranceRimacSimulationResponse() throws IOException {
        return objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationResponseRimac.json"),
                InsuranceLifeSimulationBO.class);
    }

}