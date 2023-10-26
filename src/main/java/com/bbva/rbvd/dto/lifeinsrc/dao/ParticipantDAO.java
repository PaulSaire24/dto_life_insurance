package com.bbva.rbvd.dto.lifeinsrc.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ParticipantDAO implements Serializable {
    private String insuredId;
    private String customerDocumentType;
    private String personalId;
    private String isBbvaCustomerType;
    private LocalDate customerEntryDate;
    private BigDecimal participantRoleId;
    private String insuredCustomerName;
    private String clientLastName;
    private LocalDate customerBirthDate;
    private String genderId;
    private ContactDetailsDAO contactDetails;

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

    public ContactDetailsDAO getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailsDAO contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "ParticipantDAO{" +
                "insuredId='" + insuredId + '\'' +
                ", customerDocumentType='" + customerDocumentType + '\'' +
                ", personalId='" + personalId + '\'' +
                ", isBbvaCustomerType='" + isBbvaCustomerType + '\'' +
                ", customerEntryDate=" + customerEntryDate +
                ", participantRoleId=" + participantRoleId +
                ", insuredCustomerName='" + insuredCustomerName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", customerBirthDate=" + customerBirthDate +
                ", genderId='" + genderId + '\'' +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
