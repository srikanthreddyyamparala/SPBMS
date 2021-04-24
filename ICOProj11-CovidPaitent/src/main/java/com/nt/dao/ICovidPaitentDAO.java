package com.nt.dao;

import com.nt.bo.CovidPaitentBO;

public interface ICovidPaitentDAO {
	
	public int insertPaitentDetails(CovidPaitentBO bo) throws Exception;

}
