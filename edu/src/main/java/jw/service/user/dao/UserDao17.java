package jw.service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

public class UserDao extends AbstractDao {

	// Field

	// Constructor
	public UserDao() {
	}

	// Method
	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			con = this.connect();

			pStmt = con.prepareStatement("SELECT id,pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());

			rs = pStmt.executeQuery();
			if (rs.next()) {
				System.out.println("db에서 확인한 id,pwd==>" + userVO.getId() + ":" + userVO.getPwd());
				userVO.setActive(true);
			} else {
				System.out.println("db에 <" + userVO.getId() + "> 자료가 없습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pStmt, rs);
		}
	}

	public boolean addUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		boolean insertResult=false;
		try {
			con = this.connect();

			pStmt = con.prepareStatement("INSERT "+"INTO users(no,id,pwd) "+"VALUES(?,?,?)");
			pStmt.setString(1, userVO.getNo());
			pStmt.setString(2, userVO.getId());
			pStmt.setString(3, userVO.getPwd());
			
			if(1==pStmt.executeUpdate()) {
				insertResult=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pStmt);
		}
		return insertResult;
}
}