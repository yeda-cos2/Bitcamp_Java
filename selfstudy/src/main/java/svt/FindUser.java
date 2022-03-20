package svt;


import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class FindUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();


		HttpSession session = req.getSession(true);

		out.println("<html>");
		out.println("<head><title>hello Sevlet</title></head>");
		out.println("<h2>내정보보기</h2>");
		out.println("<body>");
		
		// 내정보보기1로 올 때
		
		UserDao userDao = new UserDao();
		System.out.println("html에서 잘받아오나:"+req.getParameter("name"));
		out.println("<li>이름: "+userDao.findUser(req.getParameter("name")).getName());
		out.println("<li>성별: "+userDao.findUser(req.getParameter("name")).getSex());
		out.println("<li>id: "+userDao.findUser(req.getParameter("name")).getId());
		out.println("<li>비밀번호: "+userDao.findUser(req.getParameter("name")).getPwd());
		out.println("<li>생년월일: "+userDao.findUser(req.getParameter("name")).getYear());
		
		// 내정보보기2로 올 때
		
		if(session!=null) {
			String name=(String)session.getAttribute("name");
			System.out.println(name);
			String sex=(String)session.getAttribute("sex");
			String id=(String)session.getAttribute("id");
			String pwd=(String)session.getAttribute("pwd");
			String year=(String)session.getAttribute("year");
			String month=(String)session.getAttribute("month");
			String day=(String)session.getAttribute("day");
			out.print("<li>이름: "+name);
			out.print("<li>성별: "+sex);
			out.print("<li>id: "+id);
			out.println("<li>비밀번호: "+pwd);
			out.println("<li>생년월일: "+year+"년 "+month+" "+day);
		}
	


		out.println("<p>");
		out.println("<p><p><a href='/selfstudy/FindUser.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

	} // end of service
}// end of class
