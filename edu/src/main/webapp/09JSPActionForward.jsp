<%@ page contentType="text/html; charset=EUC-KR" %>

<br/>
<hr/>
	<h3>
	:: 09JSPActionForward.jsp ���� <br/>
	<!--
		request Object Scope �������� Ȯ��(Data ��������)
		request ObjectScope Data ���� : response ��
		request ObjectScope Data ����Ұ� : response ��
	-->
	<br/>Request Object Scope ���� ���� : <%= request.getAttribute("aaa") %><br/><br/>
	:: 09JSPActionForward.jsp �� <br/>
	</h3>
<hr/>