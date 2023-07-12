package com.bbva.rbvd.dto.lifeinsrc.quotation;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class PaymentMethodDTO extends AbstractDTO {

    private String paymentType;
    private String installmentFrequency;
    private List<RelatedContractDTO> relatedContracts;
    private TotalAmountDTO totalAmount;

    public String getPaymentType() { return paymentType; }
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }
    public String getInstallmentFrequency() { return installmentFrequency; }
    public void setInstallmentFrequency(String installmentFrequency) { this.installmentFrequency = installmentFrequency; }
    public List<RelatedContractDTO> getRelatedContracts() {return relatedContracts;}
    public void setRelatedContracts(List<RelatedContractDTO> relatedContracts) {this.relatedContracts = relatedContracts;}
    public TotalAmountDTO getTotalAmount() {return totalAmount;}
    public void setTotalAmount(TotalAmountDTO totalAmount) {this.totalAmount = totalAmount;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentMethodDTO{");
        sb.append("paymentType='").append(paymentType).append('\'');
        sb.append(", installmentFrequency='").append(installmentFrequency).append('\'');
        sb.append(", relatedContracts=").append(relatedContracts);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append('}');
        return sb.toString();
    }

}
