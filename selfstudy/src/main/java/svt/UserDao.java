package svt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import jw.common.pool.OracleConnectionPool;

public class UserDao {

	// Field
	String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String dbuser = "hr";
	String dbpwd = "hr";

	// Constructor
	public UserDao() {
	}

	// Method
	public void addUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		PreparedStatement fStmt = null;
		ResultSet rs = null;
		ResultSet frs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbuser, dbpwd);

			fStmt = con.prepareStatement("select id from users where id=?");
			fStmt.setString(1, userVO.getId());

			frs = fStmt.executeQuery();

			if (frs.next()) {
				userVO.setActive(false);
			} else {
				pStmt = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?)");
				pStmt.setString(1, userVO.getName());
				System.out.println("getid잘먹나:" + userVO.getId());
				pStmt.setString(2, userVO.getSex());
				pStmt.setString(3, userVO.getYear() + "년 " + userVO.getMonth() + " " + userVO.getDay());
				pStmt.setString(4, userVO.getId());
				pStmt.setString(5, userVO.getPwd());

				rs = pStmt.executeQuery();

				userVO.setActive(true);
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
			if (frs != null) {
				try {
					con.close();
				} catch (Exception e3) {
				}
			}
			if (fStmt != null) {
				try {
					con.close();
				} catch (Exception e3) {
				}
			}
		}
	}

	public UserVO findUser(String name) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		UserVO user = new UserVO();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbuser, dbpwd);

			pStmt = con.prepareStatement("select name,sex,birth,id,pwd from users where name=?");
			pStmt.setString(1, name);

			rs = pStmt.executeQuery();

			if (rs.next()) {
				user.setName(rs.getString("name"));
				user.setId(rs.getString("id"));
				user.setSex(rs.getString("sex"));
				user.setYear(rs.getString("birth"));
				user.setPwd(rs.getString("pwd"));
				System.out.println("DB에서 id잘 가져오나:" + rs.getString("id"));
				System.out.println("가져온거 uservo에 잘 저장됐나:" + user);

				return user;
			}

		} catch (Exception e) {

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
		}
		return user;
	}
}