package com.nt.bo;

public class CustomerBO {
	//bean property
	private Integer custId;
	private String custName;
	private String custAddr;
	private Float pamt;
	private Float rate;
	private Float time;
	private Float  intrestAmount;
	
	//setters and Getters (alt+shift+s,r=> select all)
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
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
	public Float getIntrestAmount() {
		return intrestAmount;
	}
	public void setIntrestAmount(Float intrestAmount) {
		this.intrestAmount = intrestAmount;
	}
	
	//toString (alt+shift+s,s)
	@Override
	public String toString() {
		return "CustomerBO [custId=" + custId + ", custName=" + custName + ", custAddr=" + custAddr + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", intrestAmount=" + intrestAmount + "]";
	}	
	
	
}
