package com.nt.bo;

public class CovidPaitentBO {

	private Integer paitentId;
	private String paitentName;
	private String paitentAddr;
	private String  mobileNo;
	private Float noofdaysHospitalized;
	private Float billperDay;
	private Float totalBillAmt;
	private Float discount;
	private Float netAmt;
	public Integer getPaitentId() {
		return paitentId;
	}
	public void setPaitentId(Integer paitentId) {
		this.paitentId = paitentId;
	}
	public String getPaitentName() {
		return paitentName;
	}
	public void setPaitentName(String paitentName) {
		this.paitentName = paitentName;
	}
	public String getPaitentAddr() {
		return paitentAddr;
	}
	public void setPaitentAddr(String paitentAddr) {
		this.paitentAddr = paitentAddr;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Float getNoofdaysHospitalized() {
		return noofdaysHospitalized;
	}
	public void setNoofdaysHospitalized(Float noofdaysHospitalized) {
		this.noofdaysHospitalized = noofdaysHospitalized;
	}
	public Float getBillperDay() {
		return billperDay;
	}
	public void setBillperDay(Float billperDay) {
		this.billperDay = billperDay;
	}
	public Float getTotalBillAmt() {
		return totalBillAmt;
	}
	public void setTotalBillAmt(Float totalBillAmt) {
		this.totalBillAmt = totalBillAmt;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	public Float getNetAmt() {
		return netAmt;
	}
	public void setNetAmt(Float netAmt) {
		this.netAmt = netAmt;
	}
	
	
}
