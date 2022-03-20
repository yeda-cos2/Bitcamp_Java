

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletdoPost extends HttpServlet {

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doPost(req,res);
}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println(":: servlet doPost() ����");
		System.out.println("Request Client IP : " + req.getRemoteAddr());

		res.setContentType("text/html;charset=EUC-KR");

		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head><title>hello Sevlet</title></head>");
		out.println("<body>");
		out.println("English : HelloSevlet");
		out.println("<p>");
		out.println("Korea:��� ����");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

		System.out.println(":: servlet doPost()����\n");

	}// end of service
}// end of class
