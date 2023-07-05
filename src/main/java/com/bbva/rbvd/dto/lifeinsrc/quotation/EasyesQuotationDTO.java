package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.*;

import java.util.List;

public class EasyesQuotationDTO extends CommonFieldsDTO {

    private InsuranceProductDTO product;
    private HolderDTO holder;
    private BankDTO bank;

    private List<RefundsDTO> refunds;
    private TermDTO term;

    public InsuranceProductDTO getProduct() {return product;}
    public void setProduct(InsuranceProductDTO product) {this.product = product;}
    public HolderDTO getHolder() {return holder;}
    public void setHolder(HolderDTO holder) {this.holder = holder;}
    public BankDTO getBank() {return bank;}
    public void setBank(BankDTO bank) {this.bank = bank;}

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EasyesQuotationDTO{");
        sb.append("product=").append(product);
        sb.append(", holder=").append(holder);
        sb.append(", bank=").append(bank);
        sb.append(", refunds=").append(refunds);
        sb.append(", term=").append(term);
        sb.append('}');
        return sb.toString();
    }
}
