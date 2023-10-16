package com.bbva.rbvd.dto.lifeinsrc.dao;

import java.math.BigDecimal;

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
    private String customerEntryDate;
    private BigDecimal participantRoleId;
    private String insuredCustomerName;
    private String clientLastName;
    private String userEmailPersonalDesc;
    private String phoneId;
    private String customerBirthDate;
    private String creationUserId;

    private String userAuditId;


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

    public String getCustomerEntryDate() {
        return customerEntryDate;
    }

    public void setCustomerEntryDate(String customerEntryDate) {
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

    public String getCustomerBirthDate() {
        return customerBirthDate;
    }

    public void setCustomerBirthDate(String customerBirthDate) {
        this.customerBirthDate = customerBirthDate;
    }

    public String getCreationUserId() {
        return creationUserId;
    }

    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public void setUserAuditId(String userAuditId) {
        this.userAuditId = userAuditId;
    }

}
