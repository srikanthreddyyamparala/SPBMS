package com.nt.controller;

import com.nt.dto.CovidPaitentDTO;
import com.nt.service.ICovidPaitentService;
import com.nt.vo.CovidPaitentVO;

public class MainController {

	private ICovidPaitentService service;

	public MainController(ICovidPaitentService service) {
		System.out.println("MainController 1-param Constructor");
		this.service = service;
	}

	public String processCovidPaitentDetails(CovidPaitentVO vo) throws Exception {
		CovidPaitentDTO dto = new CovidPaitentDTO();
		dto.setPaitentName(vo.getPaitentName());
		dto.setPaitentAddr(vo.getPaitentAddr());
		dto.setMobileNo(vo.getMobileNo());
		dto.setNoofdaysHospitalized(Float.parseFloat(vo.getNoofdaysHospitalized()));
		dto.setBillperDay(Float.parseFloat(vo.getBillPerDay()));

		String result = service.netBillAmount(dto);
		return result;

	}
}
