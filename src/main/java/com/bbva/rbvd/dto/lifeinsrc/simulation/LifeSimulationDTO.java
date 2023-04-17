package com.bbva.rbvd.dto.lifeinsrc.simulation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.HolderDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuranceProductDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuredAmountDTO;

public class LifeSimulationDTO extends CommonFieldsDTO {

    private InsuranceProductDTO product;

    private InsuredAmountDTO insuredAmount;

    private HolderDTO holder;

    public InsuranceProductDTO getProduct() { return product; }

    public void setProduct(InsuranceProductDTO product) { this.product = product; }

    public InsuredAmountDTO getInsuredAmount() { return insuredAmount; }

    public void setInsuredAmount(InsuredAmountDTO insuredAmount) { this.insuredAmount = insuredAmount; }

    public HolderDTO getHolder() { return holder; }

    public void setHolder(HolderDTO holder) { this.holder = holder; }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LifeSimulationPayloadDTO{");
        sb.append("holder=").append(holder);
        sb.append(", product=").append(product);
        sb.append(", insuredAmount=").append(insuredAmount);
        sb.append(", isDataTreatment=").append(this.getIsDataTreatment());
        sb.append(", externalSimulationId=").append(this.getExternalSimulationId());
        sb.append('}');
        return sb.toString();
    }

}
