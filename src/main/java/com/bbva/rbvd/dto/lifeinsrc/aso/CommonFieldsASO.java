package com.bbva.rbvd.dto.lifeinsrc.aso;

import java.math.BigDecimal;

public class CommonFieldsASO {

    private String id;
    private String name;
    private String number;
    private String description;
    private BigDecimal amount;
    private String currency;
    private BigDecimal percentageValue;
    private String text;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public BigDecimal getAmount() {return amount;}
    public void setAmount(BigDecimal amount) {this.amount = amount;}
    public String getCurrency() {return currency;}
    public void setCurrency(String currency) {this.currency = currency;}
    public BigDecimal getPercentageValue() {return percentageValue;}
    public void setPercentageValue(BigDecimal percentageValue) {this.percentageValue = percentageValue;}
    public String getText() {return text;}
    public void setText(String text) {this.text = text;}
    
}
