package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	
	private ICustomerDAO dao;
	
	 public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao=dao;
	}

	@Override
	public String calculateSimpleIntrest(CustomerDTO dto) throws Exception {
		// calucate Simpleintrest amount
		float intrAmt=dto.getPamt()*dto.getRate()*dto.getTime()/100.0f;
		System.out.println("intrAmt:"+intrAmt);
		//Create Bo Class object having Persistable data
		CustomerBO bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddr(dto.getCustAddr());
		bo.setPamt(dto.getPamt());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intrAmt);
		bo.setRate(dto.getRate());
		
		
		int count=dao.insert(bo);
		System.out.println("COUNT:"+count);
		//terinary opertaor <condition>?<success>:<failure>
		if(count == 1)
				return ":"+intrAmt;
		else
				return		"Customer Registrartion Failed";
	}

}
