
<%@ page contentType="text/html; charset=euc-kr"%>
    
<%@ page import = "java.sql.*" %>    

<%
	request.setCharacterEncoding("EUC_KR");
	//response.setContentType("text/html;charset=EUC_KR");
	//PrintWriter out = response.getWriter();
	
	//Client Form Data ó��
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	//=========================================================//
	//===== �� JDBC ���� =======================================//
	//=========================================================//
	// DBMS ���� ������ id, pwd ó�� ���� ��������
	
	
	String fromDbld = null;
	String fromDbPwd = null;

	try{
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbuser = "scott";
		String dbpwd = "tiger";
		
		//1�ܰ� Connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
		
		//2�ܰ� Statement
		PreparedStatement pStmt =
				con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
		pStmt.setString(1,id);
		
		//3�ܰ�
		ResultSet rs = pStmt.executeQuery();
		
		if(rs.next()){
			fromDbld = rs.getString("id");
			fromDbPwd = rs.getString("pwd");
			//==> debug :: console Ȯ��
			System.out.println("db���� Ȯ�� �� id,pwd ==>: "+fromDbld+":"+fromDbPwd);
		}else{
			//==> debug :: console Ȯ��
			System.out.println("db�� client���� �Է��� <"+id+"> �� <"+pwd+"> �� �����ϴ�.");
		}
		
		//������ JDBC���� �ν��Ͻ� close.
		rs.close();
		pStmt.close();
		con.close();
	}catch(Exception e){
		System.out.println(" ===> JDBC���� Exception�� �߻��� ��� <===");
		e.printStackTrace();
	}
	//=========================================================//
	//===== �� JDBC���� �κ� ����... ============================//
	//=========================================================//
%>
	<html>
	<head></head>
	<body>
	<h2>Login ȭ��</h2>

	<!--  //DBMS Data �� Client Form Data �� ȸ������ �Ǵ� -->
	<% if(fromDbld != null && fromDbPwd != null
		&& fromDbld.equals(id) && fromDbPwd.equals(pwd)){%>
		<%= id %>�� ȯ���մϴ�.
	<% }else{ %>
		id,pwd �� Ȯ���ϼ���.
	<% } %>
	
	<p/><p/><a href='/edu/jw07/loginJSP.html'>�ڷ�</a>
</body>
</html>
