package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuranceProductDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.HolderDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.RefundsDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.TermDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuredAmountDTO;

import java.util.List;


public class QuotationLifeDTO extends CommonFieldsDTO {
    private InsuranceProductDTO product;
    private HolderDTO holder;
    private BankDTO bank;
    private List<RefundsDTO> refunds;
    private TermDTO term;
    private PaymentMethodDTO paymentMethod;
    private InsuredAmountDTO insuredAmount;

    public InsuranceProductDTO getProduct() {
        return product;
    }

    public void setProduct(InsuranceProductDTO product) {
        this.product = product;
    }

    public HolderDTO getHolder() {
        return holder;
    }

    public void setHolder(HolderDTO holder) {
        this.holder = holder;
    }

    public BankDTO getBank() {
        return bank;
    }

    public void setBank(BankDTO bank) {
        this.bank = bank;
    }

    public List<RefundsDTO> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<RefundsDTO> refunds) {
        this.refunds = refunds;
    }

    public TermDTO getTerm() {
        return term;
    }

    public void setTerm(TermDTO term) {
        this.term = term;
    }

    public PaymentMethodDTO getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodDTO paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public InsuredAmountDTO getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(InsuredAmountDTO insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    @Override
    public String toString() {
        return "QuotationDTO{" +
                "product=" + product +
                ", holder=" + holder +
                ", bank=" + bank +
                ", refunds=" + refunds +
                ", term=" + term +
                ", paymentMethod=" + paymentMethod +
                ", insuredAmount=" + insuredAmount +
                '}';
    }
}
