package com.bbva.rbvd.dto.lifeinsrc.commons;

import com.bbva.apx.dto.AbstractDTO;

public class CommonFieldsDTO extends AbstractDTO {

    private String id;

    private String name;

    private Double amount;
    private String currency;

    private String description;

    private String isSelected;

    private String traceId;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getIsSelected() { return isSelected; }

    public void setIsSelected(String isSelected) { this.isSelected = isSelected; }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", amount='").append(amount).append('\'');
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", isSelected='").append(isSelected).append('\'');
        sb.append(", traceId='").append(traceId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
