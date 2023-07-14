package com.bbva.rbvd.dto.lifeinsrc.commons;

import com.bbva.apx.dto.AbstractDTO;

import java.io.Serializable;

public class TermDTO extends AbstractDTO {
	
	public enum UNIT{YEARS}

	private Integer number;
	private UNIT unit;

	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public UNIT getUnit() {
		return unit;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("TermDTO{");
		sb.append("number=").append(number);
		sb.append(", unit=").append(unit);
		sb.append('}');
		return sb.toString();
	}
}
