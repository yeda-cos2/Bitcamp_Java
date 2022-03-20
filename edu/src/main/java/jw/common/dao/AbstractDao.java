package jw.common.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.util.DBUtil;

public class AbstractDao {

	public AbstractDao() {
		// TODO Auto-generated constructor stub
	}

	//==>DBUtil.getConnection ÀÌ¿כ 
	public  Connection connect() {
		Connection con =null;
		try {
			con = DBUtil.getConnection();
		}catch(RuntimeException ex) {
			throw ex;
		}
		return con;
		
	}
	
	//==> Connection /Statement / ResultSet close()
	public void close(Connection con ,PreparedStatement pStmt, ResultSet rs ) {
		if(rs != null) {
			try {
				rs.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		this.close(con, pStmt );
	}
	
	public void close(Connection con ,PreparedStatement pStmt ) {
		if(pStmt != null) {
			try {
				pStmt.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
				
			}
	}
	
} // end of class

