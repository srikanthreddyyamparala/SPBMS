package com.nt.controller;

import com.nt.dto.EmployeeRegristartionDTO;
import com.nt.service.IEmployeeRegristrationService;
import com.nt.vo.EmployeeRegristrationVo;

public class EmployeeRegistrationController {

	private IEmployeeRegristrationService service;

	public EmployeeRegistrationController(IEmployeeRegristrationService service) {
		this.service = service;
	}

	public String EmployeeRegistrationProcess(EmployeeRegristrationVo vo) throws Exception {

		EmployeeRegristartionDTO dto = new EmployeeRegristartionDTO();

		dto.setEname(vo.getEname());
		dto.setEaddr(vo.getEaddr());
		dto.setBasicSal(Float.parseFloat(vo.getBasicsal()));

		String result = service.calculateGrossandNetSalary(dto);

		return result;
	}

}
