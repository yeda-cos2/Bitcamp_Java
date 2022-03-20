package svt;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class AddUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession(true);

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
		
		session.setAttribute("name", userVO.getName());
		session.setAttribute("sex", userVO.getSex());
		session.setAttribute("id", userVO.getId());
		session.setAttribute("pwd", userVO.getPwd());
		session.setAttribute("year", userVO.getYear());
		session.setAttribute("month", userVO.getMonth());
		session.setAttribute("day", userVO.getDay());
		
//		String name=(String)session.getAttribute("name");
//		System.out.println(name);
		
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
		out.println("<p><p><a href='/selfstudy/FindUser.html'>내정보보기1</a>");
		out.println("<p><p><a href='/selfstudy/FindUser'>내정보보기2</a>");		
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

	} // end of service
}// end of class
