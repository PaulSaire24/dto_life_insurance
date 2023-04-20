package com.bbva.rbvd.dto.lifeinsrc.dao.quotation;

import com.bbva.rbvd.dto.lifeinsrc.dao.CommonsDAO;

import java.sql.Timestamp;

public class EasyesQuotationDAO extends CommonsDAO {

    private Timestamp custSimulationExpiredDate;
    private String paymentFrequencyName;

    public Timestamp getCustSimulationExpiredDate() {return custSimulationExpiredDate;}
    public void setCustSimulationExpiredDate(Timestamp custSimulationExpiredDate) {this.custSimulationExpiredDate = custSimulationExpiredDate;}
    public String getPaymentFrequencyName() {return paymentFrequencyName;}
    public void setPaymentFrequencyName(String paymentFrequencyName) {this.paymentFrequencyName = paymentFrequencyName;}

}
