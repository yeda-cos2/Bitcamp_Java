package jw05;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionUseCookieOne  extends HttpServlet{

		public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
			
			HttpSession session=req.getSession(true);
			
			
			if(session.isNew()) {

				session.setAttribute("name",new String("ȫ�浿"));	
					}
			
			req.setCharacterEncoding("EUC_KR");
			res.setContentType("text/html;charset=EUC-KR");
			PrintWriter out = res.getWriter();
			
			out.println("<html>");
			out.println("<head></head>");
			out.println("<body>");
			out.println("<center><h2>SessionUseCookieOne</h2></center>");
			
			System.out.println("\n UNIQUE�� JSESSIONID�� :"+session.getId());
			
		if(session.isNew()) {
			out.println("������ ���� ������<br>");
			
		}else {
			out.println("\n UNIQUE�� JSESSIONID�� :"+session.getId()+"��� ��");
		}
		
		
		out.println("<hr>");
		out.println("<a href='/edu/SessionUseCookieTwo'>��ũ</a>");
		out.println("</body></html>");
}
		
		
	
}//end of class