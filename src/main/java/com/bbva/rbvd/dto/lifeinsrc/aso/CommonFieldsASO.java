package com.bbva.rbvd.dto.lifeinsrc.aso;

import com.bbva.rbvd.dto.lifeinsrc.aso.gifole.ChannelGifoleASO;
import com.bbva.rbvd.dto.lifeinsrc.aso.gifole.ContractGifoleASO;
import com.bbva.rbvd.dto.lifeinsrc.aso.gifole.CustomerGifoleASO;
import com.bbva.rbvd.dto.lifeinsrc.aso.gifole.ProductGifoleASO;

public class CommonFieldsASO {

    private String id;
    private String name;
    private String number;
    private String description;

    private CustomerGifoleASO customer;
    private ProductGifoleASO product;
    private ContractGifoleASO contract;
    private ChannelGifoleASO channel;

    private Double amount;

    private String currency;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public CustomerGifoleASO getCustomer() { return customer; }
    public void setCustomer(CustomerGifoleASO customer) { this.customer = customer; }
    public ProductGifoleASO getProduct() { return product; }
    public void setProduct(ProductGifoleASO product) { this.product = product; }
    public ContractGifoleASO getContract() { return contract; }
    public void setContract(ContractGifoleASO contract) { this.contract = contract; }
    public ChannelGifoleASO getChannel() { return channel; }
    public void setChannel(ChannelGifoleASO channel) { this.channel = channel; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    
}
