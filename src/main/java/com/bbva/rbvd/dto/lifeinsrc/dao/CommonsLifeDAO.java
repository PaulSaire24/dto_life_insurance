package com.bbva.rbvd.dto.lifeinsrc.dao;

import java.math.BigDecimal;
import java.sql.Date;

public class CommonsLifeDAO extends CommonsDAO {


    private BigDecimal insuredAmount;
    private String currencyId;
    private String periodType;
    private BigDecimal periodNumber;
    private BigDecimal refundPer;
    private BigDecimal totalReturnAmount;
    private String insuredId;
    private String customerDocumentType;
    private String personalId;
    private String isBbvaCustomerType;
    private Date customerEntryDate;
    private BigDecimal participantRoleId;
    private String insuredCustomerName;
    private String clientLastName;
    private String userEmailPersonalDesc;
    private String phoneId;
    private Date customerBirthDate;

    public Date getCustomerBirthDate() {
        return customerBirthDate;
    }

    public void setCustomerBirthDate(Date customerBirthDate) {
        this.customerBirthDate = customerBirthDate;
    }

    public BigDecimal getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(BigDecimal insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public BigDecimal getPeriodNumber() {
        return periodNumber;
    }

    public void setPeriodNumber(BigDecimal periodNumber) {
        this.periodNumber = periodNumber;
    }

    public BigDecimal getRefundPer() {
        return refundPer;
    }

    public void setRefundPer(BigDecimal refundPer) {
        this.refundPer = refundPer;
    }

    public BigDecimal getTotalReturnAmount() {
        return totalReturnAmount;
    }

    public void setTotalReturnAmount(BigDecimal totalReturnAmount) {
        this.totalReturnAmount = totalReturnAmount;
    }

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId;
    }

    public String getCustomerDocumentType() {
        return customerDocumentType;
    }

    public void setCustomerDocumentType(String customerDocumentType) {
        this.customerDocumentType = customerDocumentType;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getIsBbvaCustomerType() {
        return isBbvaCustomerType;
    }

    public void setIsBbvaCustomerType(String isBbvaCustomerType) {
        this.isBbvaCustomerType = isBbvaCustomerType;
    }

    public Date getCustomerEntryDate() {
        return customerEntryDate;
    }

    public void setCustomerEntryDate(Date customerEntryDate) {
        this.customerEntryDate = customerEntryDate;
    }

    public BigDecimal getParticipantRoleId() {
        return participantRoleId;
    }

    public void setParticipantRoleId(BigDecimal participantRoleId) {
        this.participantRoleId = participantRoleId;
    }

    public String getInsuredCustomerName() {
        return insuredCustomerName;
    }

    public void setInsuredCustomerName(String insuredCustomerName) {
        this.insuredCustomerName = insuredCustomerName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getUserEmailPersonalDesc() {
        return userEmailPersonalDesc;
    }

    public void setUserEmailPersonalDesc(String userEmailPersonalDesc) {
        this.userEmailPersonalDesc = userEmailPersonalDesc;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulationProductDAO{");
        sb.append("insuranceSimulationId=").append(this.getInsuranceSimulationId());
        sb.append(", insuranceProductId=").append(this.getInsuranceProductId());
        sb.append(", periodType='").append(periodType).append('\'');
        sb.append(", periodNumber=").append(periodNumber).append('\'');
        sb.append(", refundPer=").append(refundPer).append('\'');
        sb.append(", totalReturnAmount='").append(totalReturnAmount).append('\'');
        sb.append(", insuredId='").append(insuredId).append('\'');
        sb.append(", customerDocumentType=").append(customerDocumentType).append('\'');
        sb.append(", personalId=").append(personalId).append('\'');
        sb.append(", isBbvaCustomerType='").append(isBbvaCustomerType).append('\'');
        sb.append(", customerEntryDate='").append(customerEntryDate).append('\'');
        sb.append(", participantRoleId='").append(participantRoleId).append('\'');
        sb.append(", insuredCustomerName=").append(insuredCustomerName).append('\'');
        sb.append(", clientLastName=").append(clientLastName).append('\'');
        sb.append(", userEmailPersonalDesc='").append(userEmailPersonalDesc).append('\'');
        sb.append(", creationUser='").append(this.getCreationUser()).append('\'');
        sb.append(", userAudit='").append(this.getUserAudit()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
