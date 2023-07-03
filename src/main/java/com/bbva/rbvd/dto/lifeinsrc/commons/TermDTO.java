package com.bbva.rbvd.dto.lifeinsrc.commons;

import java.io.Serializable;

public class TermDTO implements Serializable {
	
	public enum UNIT{YEARS};
	
	
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
		return "TermDTO [number=" + number + "]";
	};
	
	

	

	

}
