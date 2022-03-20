package jw04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;
/*
 * FileName : InsertJDBC.java
 */

public class UserDataSourceDao {

	// Field
	// String dburl = "jdbc:oracle:thin:@127.0.0.1:1521xe";
	// String dbuser = "scott";
	// String dbpwd = "tiger";

	// Constructor
	public UserDataSourceDao() {
	}

	// Method
	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");

			con = ds.getConnection();

			// 2�ܰ� statement
			pStmt = con.prepareStatement("select id,pwd from users where id=? and pwd=?");
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());

			// 3�ܰ� resultSet
			rs = pStmt.executeQuery();

			if (rs.next()) {
				System.out.println("db���� Ȯ�� �� id,pwd ==>:" + userVO.getId() + ":" + userVO.getPwd());
				// ==>Data�� �����Ѵٸ�...
				userVO.setActive(true);
			} else {
				System.out.println("db�� <" + userVO.getId() + ">�� �ش��ϴ� �ڷᰡ �����ϴ�.");
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
				} catch (Exception e3) {
				}
			}
		}
	}

}// end class
