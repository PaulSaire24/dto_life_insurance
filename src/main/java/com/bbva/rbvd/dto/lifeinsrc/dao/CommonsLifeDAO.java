package com.bbva.rbvd.dto.lifeinsrc.dao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class CommonsLifeDAO extends CommonsDAO {
    private BigDecimal insuredAmount;
    private String currencyId;
    private String periodType;
    private BigDecimal periodNumber;
    private BigDecimal refundPer;
    private BigDecimal totalReturnAmount;
    private String insuredId;
    private String customerDocumentType;
    private String phoneDesc;
    private String personalDocumentId;
    private String personalId;
    private String isBbvaCustomerType;
    private LocalDate customerEntryDate;
    private BigDecimal participantRoleId;
    private String insuredCustomerName;
    private String clientLastName;
    private String userEmailPersonalDesc;
    private String phoneId;
    private LocalDate customerBirthDate;
    private String genderId;

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

    public String getPhoneDesc() {
        return phoneDesc;
    }

    public void setPhoneDesc(String phoneDesc) {
        this.phoneDesc = phoneDesc;
    }

    public String getPersonalDocumentId() {
        return personalDocumentId;
    }

    public void setPersonalDocumentId(String personalDocumentId) {
        this.personalDocumentId = personalDocumentId;
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

    public LocalDate getCustomerEntryDate() {
        return customerEntryDate;
    }

    public void setCustomerEntryDate(LocalDate customerEntryDate) {
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

    public LocalDate getCustomerBirthDate() {
        return customerBirthDate;
    }

    public void setCustomerBirthDate(LocalDate customerBirthDate) {
        this.customerBirthDate = customerBirthDate;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    @Override
    public String toString() {
        return "CommonsLifeDAO{" +
                "insuredAmount=" + insuredAmount +
                ", currencyId='" + currencyId + '\'' +
                ", periodType='" + periodType + '\'' +
                ", periodNumber=" + periodNumber +
                ", refundPer=" + refundPer +
                ", totalReturnAmount=" + totalReturnAmount +
                ", insuredId='" + insuredId + '\'' +
                ", customerDocumentType='" + customerDocumentType + '\'' +
                ", phoneDesc='" + phoneDesc + '\'' +
                ", personalDocumentId='" + personalDocumentId + '\'' +
                ", personalId='" + personalId + '\'' +
                ", isBbvaCustomerType='" + isBbvaCustomerType + '\'' +
                ", customerEntryDate=" + customerEntryDate +
                ", participantRoleId=" + participantRoleId +
                ", insuredCustomerName='" + insuredCustomerName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", userEmailPersonalDesc='" + userEmailPersonalDesc + '\'' +
                ", phoneId='" + phoneId + '\'' +
                ", customerBirthDate=" + customerBirthDate +
                ", genderId='" + genderId + '\'' +
                '}';
    }
}
