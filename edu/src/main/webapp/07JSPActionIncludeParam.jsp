<%@ page contentType="text/html;charset=euc-kr" %>

<br/><hr/>

  <h3>
  �� 07JSPActionIncludeParam.jsp ����<br/><br/>

  request, session, application Object Scope Data ����<br/><br/>

  request ObjectScope ���� Data : <%=request.getAttribute("aaa")%><br/>
  session ObjectScope ���� Data : <%=session.getAttribute("bbb")%><br/>
  application ObjectScope ���� Data : <%=application.getAttribute("ccc")%><br/><br/>

 �� 07JSPActionIncludeParam.jsp �� <br/>
 </h3>

 <%--<jsp:param ~~/> ���� Data ���� API Ȯ�� --%>
 param���� �Ѿ�� str �� : <%=request.getParameter("str")%><br/><br/>

<hr/><br/>