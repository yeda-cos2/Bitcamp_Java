<%@ page contentType="text/html;charset=euc-kr" %>

<%@ page import="jw.service.user.vo.UserVO" %>>
<%@ page import="jw.service.user.dao.UserDao" %>>

<% if(request.getMethod().equals("GET")) { %>
     <jsp:forward page = "login.html"/>
 <% } %>    
 
 <%
   request.setCharacterEncoding("EUC_KR");
 
 	String id = request.getParameter("id");
 	String pwd = request.getParameter("pwd");
 	
 	UserVO userVO = new UserVO();
 	userVO.setId(id);
 	userVO.setPwd(pwd);
 	
 	UserDao userDAO = new UserDao();
 	userDAO.getUser(userVO);
 %>
<HTML>
<HEAD><TITLE> firstJSP</TITLE></HEAD>
<BODY>
    <h2>Login 화면</h2>>
    <% if(userVO.isActive()){ %>
    	<%=id %> 님 환영합니다.
    	<% session.setAttribute("userVO", userVO); %>
    <%} else{ %>
    	id, pwd를 확인하세요.
    <%} %>
    <p/><p/><a href='/edu/jw07/login.html'>뒤로</a>
    
</BODY>
</HTML>
