package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String custName;
	private String custAddr;
	private Float pamt;
	private Float rate;
	private Float time;
	//Setter& Getters (alt+shift+s,r)
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	//alt+shift+s,s
	@Override
	public String toString() {
		return "CustomerDTO [custName=" + custName + ", custAddr=" + custAddr + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	

}
