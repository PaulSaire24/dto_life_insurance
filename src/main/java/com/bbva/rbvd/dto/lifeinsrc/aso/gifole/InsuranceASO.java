package com.bbva.rbvd.dto.lifeinsrc.aso.gifole;

import com.bbva.rbvd.dto.lifeinsrc.aso.CommonFieldsASO;

public class InsuranceASO extends CommonFieldsASO {

    private PaymentMethodASO paymentMethod;

    public PaymentMethodASO getPaymentMethod() {return paymentMethod;}
    public void setPaymentMethod(PaymentMethodASO paymentMethod) {this.paymentMethod = paymentMethod;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceASO{");
        sb.append("id=").append(this.getId());
        sb.append(", paymentMethod='").append(paymentMethod).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
