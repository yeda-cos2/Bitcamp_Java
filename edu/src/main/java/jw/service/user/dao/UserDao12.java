package jw.service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

/*
 * FileName : UserDao.java
 * ::AbstractDao 공유 회원 관리 Service 담당 DAO
 */

public class UserDao extends AbstractDao{


	public UserDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		
		try {
			
			//1단계 : connection
			con = this.connect();
			
			
			//2단계 : statement
			pStmt=con.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());
			
			
			//3단계 : resultset
			rs= pStmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("db에서 확인한 id, pwd ==> : "+userVO.getId()+" : "+userVO.getPwd());
				userVO.setActive(true);
			}else {
				System.out.println("db에 <"+userVO.getId()+"> 에 해당하는 자료가 없습니다.");
			}
		}catch(Exception e) {
				e.printStackTrace();
		}finally {
			this.close(con,pStmt,rs);
		}
	}//end of getUser()

}
