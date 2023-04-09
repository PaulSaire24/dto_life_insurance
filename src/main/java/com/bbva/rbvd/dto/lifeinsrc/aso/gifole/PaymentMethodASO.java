package com.bbva.rbvd.dto.lifeinsrc.aso.gifole;

import com.bbva.rbvd.dto.lifeinsrc.aso.CommonFieldsASO;

import java.util.List;

public class PaymentMethodASO extends CommonFieldsASO {

    private List<RelatedContractASO> relatedContracts;

    public List<RelatedContractASO> getRelatedContracts() {return relatedContracts;}
    public void setRelatedContracts(List<RelatedContractASO> relatedContracts) {this.relatedContracts = relatedContracts;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentMethodASO{");
        sb.append("id=").append(this.getId());
        sb.append(", relatedContracts='").append(relatedContracts).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
