package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CovidPaitentBO;

public class CovidPaitentDAOImpl implements ICovidPaitentDAO {
	private static final String COVID_PAITENT_DETAILS = "INSERT INTO COVID_PAITENT_DETAILS VALUES(COVID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";
	private DataSource ds;

	public CovidPaitentDAOImpl(DataSource ds) {
		System.out.println("CovidPaitentDAOImpl. 1-param Constructor");

		this.ds = ds;
	}

	public int insertPaitentDetails(CovidPaitentBO bo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int count = 0;
		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(COVID_PAITENT_DETAILS);
			pstmt.setString(1, bo.getPaitentName());
			pstmt.setString(2, bo.getPaitentAddr());
			pstmt.setString(3, bo.getMobileNo());
			pstmt.setFloat(4, bo.getNoofdaysHospitalized());
			pstmt.setFloat(5, bo.getTotalBillAmt());
			pstmt.setFloat(6, bo.getDiscount());
			pstmt.setFloat(7, bo.getNetAmt());
			pstmt.setFloat(8, bo.getBillperDay());

			count = pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
			throw (se);// Exception rethrowing
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);// Exception rethrowing
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw (se);// Exception rethrowing
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw (se);// Exception rethrowing
			}
		}
		return count;
	}

}
