package jw02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class PostDataATagServletMapping extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException, IOException{
		// Client form Data �ѱ� ���ڵ�
		req.setCharacterEncoding("EUC_KR");
		
		//�Ʒ��� �� ���๮�� servlet���� client�� Html�� ���۽� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client form data(QueryString :: name=value)ó�� (API Ȯ��)
		String clientName = req.getParameter("name");
		String ClientAddr = req.getParameter("addr");
		
		//client form data ó�� ��� Ȯ��
		System.out.println(clientName+" : "+ClientAddr);
		
		out.println("<html>");
		out.println("<head><title>PostDataATagServletMapping.html</title></head>");
		out.println("<body>");
		
		out.println("<h2>post test</h2>");
		out.println("<li> �̸� : " + clientName);
		out.println("<li> �ּ� : " + ClientAddr);
		
		out.println("<p><p><a href='/edu/jw02/postDataATagServletMapping.html'>�ڷ�</a>");
		
		
		//==> <a> Tag �̿� QueryString ����
		out.println
		("<p><a href='/edu/PostDataATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");
		
		out.println("</body>");
		out.println("</html>");
	
	}
}
