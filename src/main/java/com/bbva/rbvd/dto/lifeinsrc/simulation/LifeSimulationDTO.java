package com.bbva.rbvd.dto.lifeinsrc.simulation;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.HolderDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuranceProductDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuredAmountDTO;

public class LifeSimulationDTO extends AbstractDTO {

    private InsuranceProductDTO product;

    private InsuredAmountDTO insuredAmount;

    private HolderDTO holder;

    private Boolean isDataTreatment;

    private String externalSimulationId;

    public InsuranceProductDTO getProduct() { return product; }

    public void setProduct(InsuranceProductDTO product) { this.product = product; }

    public InsuredAmountDTO getInsuredAmount() { return insuredAmount; }

    public void setInsuredAmount(InsuredAmountDTO insuredAmount) { this.insuredAmount = insuredAmount; }

    public HolderDTO getHolder() { return holder; }

    public void setHolder(HolderDTO holder) { this.holder = holder; }

    public Boolean getDataTreatment() { return isDataTreatment; }

    public void setDataTreatment(Boolean dataTreatment) { isDataTreatment = dataTreatment; }

    public String getExternalSimulationId() { return externalSimulationId; }

    public void setExternalSimulationId(String externalSimulationId) { this.externalSimulationId = externalSimulationId; }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LifeSimulationPayloadDTO{");
        sb.append("holder=").append(holder);
        sb.append(", product=").append(product);
        sb.append(", insuredAmount=").append(insuredAmount);
        sb.append(", isDataTreatment=").append(isDataTreatment);
        sb.append(", externalSimulationId=").append(externalSimulationId);
        sb.append('}');
        return sb.toString();
    }

}
