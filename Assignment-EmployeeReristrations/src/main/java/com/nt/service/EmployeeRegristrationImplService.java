package com.nt.service;

import com.nt.bo.EmployeeRegristrationBO;
import com.nt.dao.IEmployeeRegristrationDao;
import com.nt.dto.EmployeeRegristartionDTO;

public class EmployeeRegristrationImplService implements IEmployeeRegristrationService {
	
	private IEmployeeRegristrationDao dao;
	
	public EmployeeRegristrationImplService( IEmployeeRegristrationDao dao) {
		 System.out.println("EmployeeRegristrationImplService :: 1-param Constructor");
		 this.dao=dao;
	}

	@Override
	public String calculateGrossandNetSalary(EmployeeRegristartionDTO dto) throws Exception {
	 
		EmployeeRegristrationBO bo=new EmployeeRegristrationBO();
		
		Float grossSal=dto.getBasicSal()+(dto.getBasicSal()*0.4f);
		Float netSal=dto.getBasicSal()-(dto.getBasicSal()*0.2f);
		
		System.out.println("Gross:"+grossSal +" Net:"+netSal);
		
		bo.setEname(dto.getEname());
		bo.setEaddr(dto.getEaddr());
		bo.setBasicSal(dto.getBasicSal());
		bo.setGrossSal(grossSal);
		bo.setNetSal(netSal);
		
		int count=dao.inserEmployee(bo);
		
		return  count==1?"Employee Regristration  sucessfully---> Gross salary::"+grossSal+" NetSalaray"+netSal:"Employee registration failed";   

	}

}
