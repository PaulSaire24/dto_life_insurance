package com.bbva.rbvd.dto.lifeinsrc.commons;

import com.bbva.apx.dto.AbstractDTO;
import java.math.BigDecimal;

public class CommonFieldsDTO extends AbstractDTO {

    private String id;
    private String name;
    private BigDecimal amount;
    private String currency;
    private String description;
    private Boolean isSelected;
    private Boolean isDataTreatment;
    private String externalSimulationId;
    private String traceId;
    private String saleChannelId;
    private String creationUser;
    private String userAudit;
    private boolean isAvailable;
    private Double bankingFactor;
    private TierDTO tier;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
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
    public Boolean getIsDataTreatment() { return isDataTreatment; }
    public void setIsDataTreatment(Boolean isDataTreatment) { this.isDataTreatment = isDataTreatment; }
    public String getExternalSimulationId() { return externalSimulationId; }
    public void setExternalSimulationId(String externalSimulationId) { this.externalSimulationId = externalSimulationId; }
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
    public Boolean getIsAvailable() { return this.isAvailable; }
    public void setIsAvailable(Boolean isAvailable) { this.isAvailable = isAvailable; }
    public Double getBankingFactor() { return bankingFactor; }
    public void setBankingFactor(Double bankingFactor) { this.bankingFactor = bankingFactor; }
    public TierDTO getTier() {
        return this.tier;
    }
    public void setTier(TierDTO tier) { this.tier = tier; }
}
