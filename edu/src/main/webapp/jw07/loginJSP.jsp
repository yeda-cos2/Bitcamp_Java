
<%@ page contentType="text/html; charset=euc-kr"%>
    
<%@ page import = "java.sql.*" %>    

<%
	request.setCharacterEncoding("EUC_KR");
	//response.setContentType("text/html;charset=EUC_KR");
	//PrintWriter out = response.getWriter();
	
	//Client Form Data 처리
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	//=========================================================//
	//===== ㅇ JDBC 시작 =======================================//
	//=========================================================//
	// DBMS 에서 추출한 id, pwd 처리 위한 변수선언
	
	
	String fromDbld = null;
	String fromDbPwd = null;

	try{
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbuser = "scott";
		String dbpwd = "tiger";
		
		//1단계 Connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
		
		//2단계 Statement
		PreparedStatement pStmt =
				con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
		pStmt.setString(1,id);
		
		//3단계
		ResultSet rs = pStmt.executeQuery();
		
		if(rs.next()){
			fromDbld = rs.getString("id");
			fromDbPwd = rs.getString("pwd");
			//==> debug :: console 확인
			System.out.println("db에서 확인 한 id,pwd ==>: "+fromDbld+":"+fromDbPwd);
		}else{
			//==> debug :: console 확인
			System.out.println("db에 client에서 입력한 <"+id+"> 와 <"+pwd+"> 가 없습니다.");
		}
		
		//각각의 JDBC관련 인스턴스 close.
		rs.close();
		pStmt.close();
		con.close();
	}catch(Exception e){
		System.out.println(" ===> JDBC관련 Exception이 발생한 모양 <===");
		e.printStackTrace();
	}
	//=========================================================//
	//===== ㅇ JDBC관련 부분 종료... ============================//
	//=========================================================//
%>
	<html>
	<head></head>
	<body>
	<h2>Login 화면</h2>

	<!--  //DBMS Data 와 Client Form Data 비교 회원유무 판단 -->
	<% if(fromDbld != null && fromDbPwd != null
		&& fromDbld.equals(id) && fromDbPwd.equals(pwd)){%>
		<%= id %>님 환영합니다.
	<% }else{ %>
		id,pwd 를 확인하세요.
	<% } %>
	
	<p/><p/><a href='/edu/jw07/loginJSP.html'>뒤로</a>
</body>
</html>
