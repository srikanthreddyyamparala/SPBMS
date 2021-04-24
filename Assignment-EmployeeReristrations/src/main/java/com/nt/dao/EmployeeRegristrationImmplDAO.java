package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeRegristrationBO;

public class EmployeeRegristrationImmplDAO implements IEmployeeRegristrationDao {
	private static final String EMP_REGISTRATION_DETAILS = "INSERT INTO EMP_REGISTARTION VALUES(EMPREG_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;

	public EmployeeRegristrationImmplDAO(DataSource ds) {
		System.out.println("EmployeeRegristrationImmplDAO : 1-param Constructor");
		this.ds = ds;
	}

	

	@Override
	public int inserEmployee(EmployeeRegristrationBO bo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int count=0;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(EMP_REGISTRATION_DETAILS);
			pstmt.setString(1, bo.getEname());
			pstmt.setString(2, bo.getEaddr());
			pstmt.setFloat(3, bo.getBasicSal());
			pstmt.setFloat(4, bo.getGrossSal());
			pstmt.setFloat(5, bo.getNetSal());

			count = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}

			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return count;
	}

}
