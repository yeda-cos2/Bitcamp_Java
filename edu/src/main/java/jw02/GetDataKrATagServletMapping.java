package jw02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException, IOException{
		/*
		 * ==> Tomcat 8.X �̻� Get ��� �ѱ��ذ���
		 * ==> server.xml ���� ����
		 * <Connector port="8080" protocol="HTTP/1.1"
		 * 		connectionTimeout="20000"
		 * 		redirectPort="8443"
		 * 		useBodyEncodingForURI="true"/>  <== �߰�
		 */
		req.setCharacterEncoding("EUC_KR");
		
		//�Ʒ��� �� ���๮�� servlet���� client�� Html�� ���۽� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client form data(QueryString :: name=value)ó�� (API Ȯ��)
		String clientName = req.getParameter("name");
		String ClientAddr = req.getParameter("addr");
		
		//client form data ���(����� ���� ?)
		System.out.println(clientName+" : "+ClientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetDataKrATagServletMapping</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get test</h2>");
		out.println("<li> �̸� : " + clientName);
		out.println("<li> �ּ� : " + ClientAddr);
		
		out.println("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>�ڷ�</a>");
		
		//==> <a> �±׸� �̿��Ͽ� Query ���ڿ� ����
		out.println
		("<p><a href='/edu/GetDataKrATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
