package com.bbva.rbvd.dto.lifeinsrc.mock;


import com.bbva.rbvd.dto.lifeinsrc.bo.simulation.InsuranceLifeSimulationBO;
import com.bbva.rbvd.dto.lifeinsrc.mapper.ObjectMapperHelper;
import com.bbva.rbvd.dto.lifeinsrc.simulation.LifeSimulationDTO;

import java.io.IOException;

public final class MockData {

    private static final MockData INSTANCE = new MockData();
    private ObjectMapperHelper objectMapperHelper = ObjectMapperHelper.getInstance();

    private MockData() {

    }

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