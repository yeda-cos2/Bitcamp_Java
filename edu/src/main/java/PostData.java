


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PostData extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		System.out.println(clientName + " : " + clientAddr);

		out.println("<html>");
		out.println("<head><title>PostData.java</title></head>");
		out.println("<body>");

		out.println("<h2>Post Test</h2>");
		out.println("<li>�̸�:" + clientName);
		out.println("<li>�ּ�:" + clientAddr);

		out.println("<p><p><a href='/edu/PostData.html'>�ڷ�</a>");

		out.println("</body>");
		out.println("</html>");

	}// end of service
}// end of class
