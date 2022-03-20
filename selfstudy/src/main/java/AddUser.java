

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
		System.out.println("입력값받아오기"+req.getParameter("id"));
		System.out.println("userVO저장"+userVO);
		
		UserDao userDao=new UserDao();
		userDao.addUser(userVO);
		out.println("<html>");
		out.println("<head><title>hello Sevlet</title></head>");
		out.println("<h2>회원가입</h2>");
		out.println("<body>");
		
		if(userVO.isActive()) {
			out.println(req.getParameter("name")+"님 가입 환영합니다.");
		}else {
			out.println(userVO.getId()+"는 이미 존재하는 아이디입니다.");
		}
		out.println("<p>");
		out.println("<p><p><a href='/selfstudy/AddUser.html'>뒤로</a>");
		out.println("<p><p><a href='/selfstudy/FindUser.html'>내정보보기</a>");
		out.println("<p><p><a href='/selfstudy/svt/FindUser.java'>내정보보기2</a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

	} // end of service
}// end of class
