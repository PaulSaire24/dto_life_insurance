package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.HolderDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuranceProductDTO;

public class EasyesQuotationDTO extends CommonFieldsDTO {

    private InsuranceProductDTO product;
    private HolderDTO holder;
    private BankDTO bank;

    public InsuranceProductDTO getProduct() {return product;}
    public void setProduct(InsuranceProductDTO product) {this.product = product;}
    public HolderDTO getHolder() {return holder;}
    public void setHolder(HolderDTO holder) {this.holder = holder;}
    public BankDTO getBank() {return bank;}
    public void setBank(BankDTO bank) {this.bank = bank;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EasyesQuotationDTO{");
        sb.append("product=").append(product);
        sb.append(", holder=").append(holder);
        sb.append(", isDataTreatment='").append(this.getIsDataTreatment()).append('\'');
        sb.append(", externalSimulationId='").append(this.getExternalSimulationId()).append('\'');
        sb.append(", bank=").append(bank);
        sb.append('}');
        return sb.toString();
    }

}
