package com.bbva.rbvd.dto.lifeinsrc.commons;

import com.bbva.apx.dto.AbstractDTO;

public class CommonFieldsDTO extends AbstractDTO {

    private String id;

    private String name;

    private Double amount;
    private String currency;

    private String description;

    private Boolean isSelected;

    private String traceId;

    private String saleChannelId;

    private String creationUser;

    private String userAudit;

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

    public Boolean getIsSelected() {
        return this.isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSaleChannelId() { return this.saleChannelId; }

    public void setSaleChannelId(String saleChannelId) { this.saleChannelId = saleChannelId; }

    public String getCreationUser() { return this.creationUser; }

    public void setCreationUser(String creationUser) { this.creationUser = creationUser; }

    public String getUserAudit() { return this.userAudit; }

    public void setUserAudit(String userAudit) { this.userAudit = userAudit; }

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
        sb.append(", saleChannelId='").append(saleChannelId).append('\'');
        sb.append(", creationUser='").append(creationUser).append('\'');
        sb.append(", userAudit='").append(userAudit).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
