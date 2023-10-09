package com.bbva.rbvd.dto.lifeinsrc.mock;

import com.bbva.rbvd.dto.lifeinsrc.dao.InsuranceProductModalityDAO;
import com.bbva.rbvd.dto.lifeinsrc.dao.ProductInformationDAO;
import com.bbva.rbvd.dto.lifeinsrc.quotation.EasyesQuotationDTO;
import com.bbva.rbvd.dto.lifeinsrc.rimac.quotation.EasyesQuotationBO;
import com.bbva.rbvd.dto.lifeinsrc.rimac.simulation.InsuranceLifeSimulationBO;
import com.bbva.rbvd.dto.lifeinsrc.simulation.LifeSimulationDTO;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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

    public EasyesQuotationBO getInsuranceRimacQuotationResponse() throws IOException {
        return this.objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/quotation/easyesRimacQuotationResponse.json"),
                EasyesQuotationBO.class);
    }

    public EasyesQuotationDTO getEasyesInsuranceQuotationRequest() throws IOException {
        return this.objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/quotation/easyesQuotationRequest.json"),
                EasyesQuotationDTO.class);
    }

    public LifeSimulationDTO getRequestDynamicLife() throws IOException {
        return this.objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationRequestDynamicLife.json"),
                LifeSimulationDTO.class);
    }

    public LifeSimulationDTO getResponsetDynamicLife() throws IOException {
        return this.objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationResponseDynamicLife.json"),
                LifeSimulationDTO.class);
    }

    public List<InsuranceProductModalityDAO> getInsuranceProductModalitiesDAO() throws IOException {
        return Arrays.asList(objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/general/responseInsuranceProductModalities.json"),
                InsuranceProductModalityDAO[].class));
    }

    public ProductInformationDAO getProductInformationDAO() throws IOException {
        return this.objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/general/responseProductInformation.json"),
                ProductInformationDAO.class);
    }

    public InsuranceLifeSimulationBO getRequestRimacDynamicLife() throws IOException {
        return this.objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationRequestRimacDynamic.json"),
                InsuranceLifeSimulationBO.class);
    }

    public InsuranceLifeSimulationBO getResponseRimacDynamicLife() throws IOException {
        return this.objectMapperHelper.readValue(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(
                        "com/bbva/rbvd/dto/insurance/mock/simulation/simulationRequestRimacDynamic.json"),
                InsuranceLifeSimulationBO.class);
    }

}