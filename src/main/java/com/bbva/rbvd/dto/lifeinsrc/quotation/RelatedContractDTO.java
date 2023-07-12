package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.apx.dto.AbstractDTO;

public class RelatedContractDTO extends AbstractDTO {

    private String contractId;
    private String number;
    private PaymentProductDTO product;

    public String getContractId() { return contractId; }
    public void setContractId(String contractId) { this.contractId = contractId; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public PaymentProductDTO getProduct() {return product;}
    public void setProduct(PaymentProductDTO product) {this.product = product;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RelatedContractDTO{");
        sb.append("contractId='").append(contractId).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", product=").append(product);
        sb.append('}');
        return sb.toString();
    }

}
