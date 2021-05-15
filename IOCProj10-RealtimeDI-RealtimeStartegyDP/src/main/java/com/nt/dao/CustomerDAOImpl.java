package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIME_CUSTOMER VALUES(CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;

	// alt+shft+s,o
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl.1-param Constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int count=0;
		try {
			
			//get pooled connection obj
			con=ds.getConnection();
			//Create Prepared Statement Object  having pre-compliled SQL query.
			pstmt=con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
			pstmt.setString(1,bo.getCustName());
			
			pstmt.setFloat(2,bo.getPamt());
			pstmt.setFloat(4,bo.getRate());
			pstmt.setFloat(3,bo.getTime());
			pstmt.setFloat(5,bo.getIntrestAmount());
			pstmt.setString(6,bo.getCustAddr());
			//execute the Query
			count=pstmt.executeUpdate();
			
		}catch (SQLException se) {
			se.printStackTrace();
			throw(se);//Exception rethrowing
		}catch (Exception e) {
			e.printStackTrace();
			throw(e);//Exception rethrowing
		}
		finally {
			try {
				if(pstmt!=null)
					pstmt.close();
			}catch (SQLException se) {
				se.printStackTrace();
				throw(se);//Exception rethrowing
			}
			try {
				if(con!=null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw(se);//Exception rethrowing
			}
		}
		return count;
	}

}
