package com.bbva.rbvd.dto.lifeinsrc.dao;

import java.math.BigDecimal;

public class InsuranceProductModalityDAO extends CommonsDAO {

    public InsuranceProductModalityDAO() {
    }

    public InsuranceProductModalityDAO(String insuranceCompanyModalityId, String insuranceModalityName, String suggestedModalityIndType) {
        this.setInsuranceCompanyModalityId(insuranceCompanyModalityId);
        this.setInsuranceModalityName(insuranceModalityName);
        this.suggestedModalityIndType = suggestedModalityIndType;
    }

    public InsuranceProductModalityDAO(String insuranceCompanyModalityId, String insuranceModalityName, String suggestedModalityIndType, BigDecimal insuranceProductId, String insuranceProductDescription) {
        this(insuranceCompanyModalityId, insuranceModalityName, suggestedModalityIndType);
        this.setInsuranceProductId(insuranceProductId);
        this.setInsuranceProductDescription(insuranceProductDescription);
    }

    public InsuranceProductModalityDAO(String insuranceCompanyModalityId, String insuranceModalityName, String insuranceModalityType, String suggestedModalityIndType, BigDecimal publicationOrderNumber) {
        this(insuranceCompanyModalityId, insuranceModalityName, suggestedModalityIndType);
        this.publicationOrderNumber = publicationOrderNumber;
        this.setInsuranceModalityType(insuranceModalityType);
    }

    public InsuranceProductModalityDAO(
            String insuranceCompanyModalityId,
            String insuranceModalityName,
            String insuranceModalityType,
            String suggestedModalityIndType,
            BigDecimal publicationOrderNumber,
            String flexiblePlanIndicator,
            String newModalityIndType) {
        this(insuranceCompanyModalityId, insuranceModalityName, suggestedModalityIndType);
        this.publicationOrderNumber = publicationOrderNumber;
        this.setInsuranceModalityType(insuranceModalityType);
        this.setFlexiblePlanIndicator(flexiblePlanIndicator);
        this.setNewModalityIndType(newModalityIndType);
    }

    public InsuranceProductModalityDAO(String insuranceCompanyModalityId, String insuranceModalityName, String insuranceModalityType, String suggestedModalityIndType, String insuranceCompanyId, String insuranceCompanyDesc) {
        this(insuranceCompanyModalityId, insuranceModalityName, suggestedModalityIndType);
        this.setInsuranceModalityType(insuranceModalityType);
        this.insuranceCompanyId = insuranceCompanyId;
        this.insuranceCompanyDesc = insuranceCompanyDesc;
    }

    private String suggestedModalityIndType;
    private String insuranceCompanyId;
    private String insuranceCompanyDesc;
    private BigDecimal publicationOrderNumber;
    private String flexiblePlanIndicator;
    private String newModalityIndType;


    public String getSuggestedModalityIndType() { return suggestedModalityIndType; }
    public void setSuggestedModalityIndType(String suggestedModalityIndType) { this.suggestedModalityIndType = suggestedModalityIndType; }
    public String getInsuranceCompanyId() {return insuranceCompanyId;}
    public void setInsuranceCompanyId(String insuranceCompanyId) {this.insuranceCompanyId = insuranceCompanyId;}
    public String getInsuranceCompanyDesc() {return insuranceCompanyDesc;}
    public void setInsuranceCompanyDesc(String insuranceCompanyDesc) {this.insuranceCompanyDesc = insuranceCompanyDesc;}
    public BigDecimal getPublicationOrderNumber() {return publicationOrderNumber;}
    public void setPublicationOrderNumber(BigDecimal publicationOrderNumber) {this.publicationOrderNumber = publicationOrderNumber;}

    public String getFlexiblePlanIndicator() {
        return flexiblePlanIndicator;
    }

    public void setFlexiblePlanIndicator(String flexiblePlanIndicator) {
        this.flexiblePlanIndicator = flexiblePlanIndicator;
    }

    public String getNewModalityIndType() {
        return newModalityIndType;
    }

    public void setNewModalityIndType(String newModalityIndType) {
        this.newModalityIndType = newModalityIndType;
    }
}
