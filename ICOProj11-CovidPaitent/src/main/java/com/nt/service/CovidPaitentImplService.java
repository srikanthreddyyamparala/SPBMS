package com.nt.service;

import com.nt.bo.CovidPaitentBO;
import com.nt.dao.ICovidPaitentDAO;
import com.nt.dto.CovidPaitentDTO;

public class CovidPaitentImplService implements ICovidPaitentService {

	private ICovidPaitentDAO dao;

	public CovidPaitentImplService(ICovidPaitentDAO dao) {
		System.out.println("CovidPaitentImplService 1-parama");
		this.dao = dao;
	}

	public String netBillAmount(CovidPaitentDTO dto) throws Exception {
		float totalBillAmount = (dto.getNoofdaysHospitalized() * dto.getBillperDay());
		System.out.println("TotalBillAmount:" + totalBillAmount);
		float discount = 0.0f;
		if (totalBillAmount > 100000 || totalBillAmount < 200000) {

			discount = 0.1f * totalBillAmount;
		} else if (totalBillAmount >= 200000) {
			discount = 0.2f * totalBillAmount;
		} else {
			discount = 0.0f;
		}
		System.out.println("Discount:" + discount);
		float netbillAmt = totalBillAmount - discount;
		System.out.println("netbillAmt:" + netbillAmt);
		CovidPaitentBO bo = new CovidPaitentBO();
		bo.setPaitentName(dto.getPaitentName());
		bo.setPaitentAddr(dto.getPaitentAddr());
		bo.setMobileNo(dto.getMobileNo());
		bo.setNoofdaysHospitalized(dto.getNoofdaysHospitalized());
		bo.setBillperDay(dto.getBillperDay());
		bo.setTotalBillAmt(totalBillAmount);
		bo.setDiscount(discount);
		bo.setNetAmt(netbillAmt);
		int count = dao.insertPaitentDetails(bo);

		if (count == 1)
			return "Total Bill Amount:" + totalBillAmount + " Discount:" + discount + " Net bill Amount:" + netbillAmt;
		else
			return "covid Paitent Insertion faile:";

	}

}
