<%@ page contentType = "text/html;charset=euc-kr"%>

<%@ page import = "jw.service.user.vo.UserVO" %>

<!-- 
	:: WorkFlosw Control) : ������ڵ� : �α��� ���� Ȯ��
	:: �α��� ȸ���� session ObjectScope �� userVO �� �����ϸ�
	:: Field �� active �� true
 -->
 
 <%
 	UserVO userVO = (UserVO)session.getAttribute("userVO");
	if( userVO == null ){
		userVO = new UserVO();
	}
 %>
 <!-- 
 	==> �� login �� ȸ�� : UserVO.active false
 		1.�α��� page include
 		2.ȸ������ page �� �̵� �� �� �ִ� link display
 	==> login �� ȸ�� : UserVO.active true ���
 		1.ȸ�� id display
 		2.�α׾ƿ� ��ư display
  -->
  <% if ( ! userVO.isActive() ){ %>
  <!-- 1. �α��� page include... -->
  <jsp:include page="../jw07/login.html"/>
  <br/><br/>
  <!-- 2. ȸ������ page�� �̵� �� �� �մ� link -->
  <a href="/edu/jw07/addUser.html">ȸ������....</a>
  <%}else{ %>
  <!-- 1. ȸ�� id display -->
  <%= userVO.getId() %>�� �α��� �ϼ̽��ϴ�.
  <br/><br/>
  <!-- 2. �α׾ƿ� ��ư display -->
  <form method = "post" action = "<%= request.getRequestURL()%>">
  URL : <%= request.getRequestURL() %><br/>
  URI : <%= request.getRequestURI() %><br/>
  <input type = "submit" value = "Logout"/>
  </form>
  <br/>
  <br/>
  <%} %>
  
  <!-- Get / Post ��� �̿� :: 1���� page�� 2���� ���� display -->
  <%
  	if(request.getMethod().equals("POST")){
  		// logout �� 3���� ���
  		
  		//1. session�� ����
  		 //session.invalidate();
  		//2. login ������ ���� userVO session ObjectScope remove
  		session.removeAttribute("useerVO");
  		
  		//3. login ������ ���� userVO Field active false
  		 //userVO.setActive(false)
  		 
  		 //==> logout �� �α��� page�� sendRedirect
  		 response.sendRedirect("edu/jw08/logout.jsp");
  	}
  
  %>