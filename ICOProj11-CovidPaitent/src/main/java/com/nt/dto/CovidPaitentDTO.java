package com.nt.dto;

import java.io.Serializable;

public class CovidPaitentDTO implements Serializable {

	private String paitentName;
	private String paitentAddr;
	private String  mobileNo;
	private Float noofdaysHospitalized;
	private Float billperDay;
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
	
}
