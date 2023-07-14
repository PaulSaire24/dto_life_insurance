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
	private InsuranceLimitsDTO insuranceLimits;


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

	public InsuranceLimitsDTO getInsuranceLimits() {
		return insuranceLimits;
	}

	public void setInsuranceLimits(InsuranceLimitsDTO insuranceLimits) {
		this.insuranceLimits = insuranceLimits;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("LifeSimulationDTO{");
		sb.append("product=").append(product);
		sb.append(", insuredAmount=").append(insuredAmount);
		sb.append(", holder=").append(holder);
		sb.append(", listRefunds=").append(listRefunds);
		sb.append(", term=").append(term);
		sb.append(", insuranceLimits=").append(insuranceLimits);
		sb.append('}');
		return sb.toString();
	}
}
