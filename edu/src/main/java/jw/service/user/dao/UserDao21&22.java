package jw.service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

public class UserDao21 extends AbstractDao{
	//Field

	//constructor
	public UserDao21(){}

	//Method
	public void getUser(UserVO userVO){
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try{
			//1단계 connection
			con = this.connect();

			//2단계 statement
			pStmt = con.prepareStatement("SE:ECT id , pwd FROM users WHERE id=? AND pwd =?");
			pStmt.setString(1,userVO.getId());
			pStmt.setString(2,userVO.getPwd());

			//3단계 resultset
			rs = pStmt.executeQuery();
			if(rs.next()){
				System.out.println("db에서 확인 한 id,pwd ==>:"+userVO.getId()+":"+userVO.getPwd());
				userVO.setActive(true);
			}else{
				System.out.println("db에 <" + userVO.getId()+">에 해당하는 자료가 없습니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			this.close(con,pStmt,rs);
		}
	}//end of getUser()

	public boolean addUser(UserVO userVO){
		Connection con = null;
		PreparedStatement pStmt = null;
		boolean insertResult = false;
		try{
			//1단계  connection
			con = this.connect();

			//2단계 statement
			pStmt = con.prepareStatement("INSERT"+"INTO users(no,id,pwd)"+"VALUES(?,?,?)");
			pStmt.setString(2,userVO.getId());
			pStmt.setString(3,userVO.getPwd());

			//3단계 결과값 확인하기
			if(1==pStmt.executeUpdate()){
				insertResult = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			this.close(con,pStmt);
		}
		return insertResult;
	}//end of addUser()

	public ArrayList<UserVO> getUserList(){
		ArrayList<UserVO> arrayList  = new ArrayList<UserVO>();

		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try{
			//1단계 connection
			con = this.connect();

			//2단계 statement
			pStmt = con.prepareStatement("SELECT no,id pwd FROM users ORDER BY no");

			//3단계 resultset 결과 처리
			rs = pStmt.executeQuery();

			//==> :: select 각각의 회원정보 UserVO 로 Binding
			//==> :: 각각의 회원정보를 갖는 UserVO 를 ArrayList에 저장
			while(rs.next()){
				UserVO userVO = new UserVO();
				userVO.setNO(rs.getInt("no"));
				userVO.setPwd(rs.getString("pwd"));
				userVO.setId(rs.getString("id"));

				//==> userVO 정보확인인 : console확인
				System.out.println(userVO);

				//==> arrayList에 UserVO 인스턴스 add
				arrayList.add(userVO);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			this.close(con,pStmt,rs);
		}
		return arrayList;
	}//end of getUserList()

}