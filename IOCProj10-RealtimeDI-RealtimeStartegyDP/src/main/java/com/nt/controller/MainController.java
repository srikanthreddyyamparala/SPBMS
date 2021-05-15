package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
	private ICustomerMgmtService service;
	
	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController.1-param Constructor");
		this.service=service;
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		//convert Vo class obj data to DTO class obj data
		
		CustomerDTO dto=new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddr(vo.getCustAddr());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		
		String result=service.calculateSimpleIntrest(dto);
		
		return result;
		
	}
}
