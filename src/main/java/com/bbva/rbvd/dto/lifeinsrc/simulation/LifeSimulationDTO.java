package com.bbva.rbvd.dto.lifeinsrc.simulation;

import java.util.List;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.HolderDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuranceProductDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.InsuredAmountDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.RefundsDTO;
import com.bbva.rbvd.dto.lifeinsrc.commons.TermDTO;

public class LifeSimulationDTO extends CommonFieldsDTO {

    private InsuranceProductDTO product;

    private InsuredAmountDTO insuredAmount;

    private HolderDTO holder;
    
    private List<RefundsDTO> listRefunds; 
    
    private TermDTO term;
    
    
    

    public List<RefundsDTO> getListRefunds() {
		return listRefunds;
	}

	public void setListRefunds(List<RefundsDTO> listRefunds) {
		this.listRefunds = listRefunds;
	}

	public TermDTO getTerm() {
		return term;
	}

	public void setTerm(TermDTO term) {
		this.term = term;
	}

	public InsuranceProductDTO getProduct() { return product; }

    public void setProduct(InsuranceProductDTO product) { this.product = product; }

    public InsuredAmountDTO getInsuredAmount() { return insuredAmount; }

    public void setInsuredAmount(InsuredAmountDTO insuredAmount) { this.insuredAmount = insuredAmount; }

    public HolderDTO getHolder() { return holder; }

    public void setHolder(HolderDTO holder) { this.holder = holder; }

	@Override
	public String toString() {
		return "LifeSimulationDTO [product=" + product + ", insuredAmount=" + insuredAmount + ", holder=" + holder
				+ ", listRefunds=" + listRefunds + ", term=" + term + "]";
	}


    

}
