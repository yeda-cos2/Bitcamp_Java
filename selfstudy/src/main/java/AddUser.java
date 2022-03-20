

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class AddUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		UserVO userVO=new UserVO();
		userVO.setId(req.getParameter("id"));
		userVO.setPwd(req.getParameter("pwd"));
		userVO.setName(req.getParameter("name"));
		userVO.setSex(req.getParameter("sex"));
		userVO.setYear(req.getParameter("year"));
		userVO.setMonth(req.getParameter("month"));
		userVO.setDay(req.getParameter("day"));
		System.out.println("�Է°��޾ƿ���"+req.getParameter("id"));
		System.out.println("userVO����"+userVO);
		
		UserDao userDao=new UserDao();
		userDao.addUser(userVO);
		out.println("<html>");
		out.println("<head><title>hello Sevlet</title></head>");
		out.println("<h2>ȸ������</h2>");
		out.println("<body>");
		
		if(userVO.isActive()) {
			out.println(req.getParameter("name")+"�� ���� ȯ���մϴ�.");
		}else {
			out.println(userVO.getId()+"�� �̹� �����ϴ� ���̵��Դϴ�.");
		}
		out.println("<p>");
		out.println("<p><p><a href='/selfstudy/AddUser.html'>�ڷ�</a>");
		out.println("<p><p><a href='/selfstudy/FindUser.html'>����������</a>");
		out.println("<p><p><a href='/selfstudy/svt/FindUser.java'>����������2</a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

	} // end of service
}// end of class
