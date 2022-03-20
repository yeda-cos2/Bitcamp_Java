
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletService extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println(":: servlet service() ����");
		System.out.println("Request Client IP : " + req.getRemoteAddr());

//		res.setContentType("text/html");
			res.setContentType("text/html;charset=EUC-KR");

//			OutputStream outputStream=res.getOutputStream();
//			Writer writer=new OutputStreamWriter(outputStream);
//			PrintWriter out =new PrintWriter(writer);

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

		System.out.println(":: servlet service()����\n");

	}// end of service
}// end of class