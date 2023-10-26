package com.bbva.rbvd.dto.lifeinsrc.dao;

import java.math.BigDecimal;

public class InsuredLifeDAO extends CommonsDAO{
    private BigDecimal insuredAmount;
    private ParticipantDAO participant;
    private ContactDetailsDAO contactDetails;
    private Term term;
    private Refunds refunds;
    public class Term{
        private BigDecimal periodNumber;
        private String periodType;

        public BigDecimal getPeriodNumber() {
            return periodNumber;
        }

        public void setPeriodNumber(BigDecimal periodNumber) {
            this.periodNumber = periodNumber;
        }

        public String getPeriodType() {
            return periodType;
        }

        public void setPeriodType(String periodType) {
            this.periodType = periodType;
        }
    }
    public class Refunds{
        private BigDecimal refundPer;
        private BigDecimal totalReturnAmount;
        private String currencyId;

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

        public String getCurrencyId() {
            return currencyId;
        }

        public void setCurrencyId(String currencyId) {
            this.currencyId = currencyId;
        }
    }

    public BigDecimal getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(BigDecimal insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public ParticipantDAO getParticipant() {
        return participant;
    }

    public void setParticipant(ParticipantDAO participant) {
        this.participant = participant;
    }

    public ContactDetailsDAO getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailsDAO contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Refunds getRefunds() {
        return refunds;
    }

    public void setRefunds(Refunds refunds) {
        this.refunds = refunds;
    }
}
