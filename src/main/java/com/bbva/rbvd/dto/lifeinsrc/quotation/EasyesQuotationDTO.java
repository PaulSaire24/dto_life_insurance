package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.HolderDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuranceProductDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuredAmountDTO;

public class EasyesQuotationDTO extends CommonFieldsDTO {

    private InsuranceProductDTO product;
    private InsuredAmountDTO insuredAmount;
    private HolderDTO holder;

    public InsuranceProductDTO getProduct() {return product;}
    public void setProduct(InsuranceProductDTO product) {this.product = product;}
    public InsuredAmountDTO getInsuredAmount() {return insuredAmount;}
    public void setInsuredAmount(InsuredAmountDTO insuredAmount) {this.insuredAmount = insuredAmount;}
    public HolderDTO getHolder() {return holder;}
    public void setHolder(HolderDTO holder) {this.holder = holder;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EasyesQuotationDTO{");
        sb.append("product=").append(product);
        sb.append(", insuredAmount=").append(insuredAmount);
        sb.append(", holder=").append(holder);
        sb.append(", isDataTreatment='").append(this.getIsDataTreatment()).append('\'');
        sb.append(", externalSimulationId='").append(this.getExternalSimulationId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
