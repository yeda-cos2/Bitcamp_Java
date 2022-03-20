package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserInitParamDao {

	public UserInitParamDao() {
		// TODO Auto-generated constructor stub
	}
	
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;
	
	public String getJdbcDriver() {
		return jdbcDriver;
	}
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	public String getJdbcURL() {
		return jdbcURL;
	}
	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}
	public String getJdbcUser() {
		return jdbcUser;
	}
	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}
	public String getJdbcPasswd() {
		return jdbcPasswd;
	}
	public void setJdbcPasswd(String jdbcPasswd) {
		this.jdbcPasswd = jdbcPasswd;
	}
	
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
	
	try {
		Class.forName("jdbcDriver");
		con = DriverManager.getConnection(jdbcDriver, jdbcURL, jdbcUser);
		
		
		pStmt = con.prepareStatement("SELECT id,pwd FROM users WHERE id=? AND pwd=?");
		pStmt.setString(1, userVO.getId());
		pStmt.setString(2, userVO.getPwd());
		
		
		
		rs = pStmt.executeQuery();
		if (rs.next()) {
			System.out.println("db���� Ȯ���� id,pwd==>" + userVO.getId() + ":" + userVO.getPwd());
			userVO.setActive(true);
		} else {
			System.out.println("db�� <" + userVO.getId() + "> �ڷᰡ �����ϴ�");
		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e1) {
			}
		}
		if (pStmt != null) {
			try {
				pStmt.close();
			} catch (Exception e2) {
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (Exception e3) { }
		}
	}
}
}
