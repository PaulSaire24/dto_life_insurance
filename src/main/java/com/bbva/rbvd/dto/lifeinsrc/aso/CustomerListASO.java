package com.bbva.rbvd.dto.lifeinsrc.aso;

import com.bbva.rbvd.dto.lifeinsrc.bo.customer.CustomerBO;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerListASO {

    private List<CustomerBO> data;

    public List<CustomerBO> getData() { return data; }

    public void setData(List<CustomerBO> data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerListASO{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
