package com.bbva.rbvd.dto.lifeinsrc.commons;

public class InstallmentsDTO extends CommonFieldsDTO {

    private Long paymentsTotalNumber;
    private PaymentAmountDTO paymentAmount;
    private PeriodDTO period;

    public Long getPaymentsTotalNumber() { return paymentsTotalNumber; }
    public void setPaymentsTotalNumber(Long paymentsTotalNumber) { this.paymentsTotalNumber = paymentsTotalNumber; }
    public PaymentAmountDTO getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(PaymentAmountDTO paymentAmount) { this.paymentAmount = paymentAmount; }
    public PeriodDTO getPeriod() { return period; }
    public void setPeriod(PeriodDTO period) { this.period = period; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentsSimulationDTO{");
        sb.append("paymentsTotalNumber=").append(paymentsTotalNumber).append('\'');
        sb.append(", paymentAmount=").append(paymentAmount).append('\'');
        sb.append(", period=").append(period).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
