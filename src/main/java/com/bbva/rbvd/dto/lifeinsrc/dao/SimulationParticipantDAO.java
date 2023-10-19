package com.bbva.rbvd.dto.lifeinsrc.dao;

public class SimulationParticipantDAO extends CommonsLifeDAO {
    @Override
    public String toString() {
        return "SimulationParticipantDAO{" +
                "insuredAmount=" + getInsuredAmount() +
                ", currencyId='" + getCurrencyId() + '\'' +
                ", periodType='" + getPeriodType() + '\'' +
                ", periodNumber=" + getPeriodNumber() +
                ", refundPer=" + getRefundPer() +
                ", totalReturnAmount=" + getTotalReturnAmount()+
                ", insuredId='" + getInsuredId() + '\'' +
                ", customerDocumentType='" + getCustomerDocumentType() + '\'' +
                ", phoneDesc='" + getPhoneDesc() + '\'' +
                ", personalDocumentId='" + getPersonalDocumentId() + '\'' +
                ", personalId='" + getPersonalId() + '\'' +
                ", isBbvaCustomerType='" + getIsBbvaCustomerType() + '\'' +
                ", customerEntryDate=" + getCustomerEntryDate() +
                ", participantRoleId=" + getParticipantRoleId() +
                ", insuredCustomerName='" + getInsuredCustomerName() + '\'' +
                ", clientLastName='" + getClientLastName() + '\'' +
                ", userEmailPersonalDesc='" + getUserEmailPersonalDesc() + '\'' +
                ", phoneId='" + getPhoneId() + '\'' +
                ", customerBirthDate=" + getCustomerBirthDate() +
                ", genderId='" + getGenderId() + '\'' +
                '}';
    }
}
