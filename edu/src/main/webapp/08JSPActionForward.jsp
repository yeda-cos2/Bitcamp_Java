<%@ page contentType="text/html; charset=EUC-KR" %>

<html>
<body>
	:: 08JSPActionForward.jsp ���� <br/>
	
	<%  request.setAttribute("aaa", new String("�����")); %>
	
	<jsp:forward page="09JSPActionForward.jsp"/>
	
	:: 08JSPActionForward.jsp �� <br/>

</body>
</html>