

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import jw04.UserDataSourceDao;
import jw04.UserVO;

public class FindUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head><title>hello Sevlet</title></head>");
		out.println("<h2>내정보보기</h2>");
		out.println("<body>");
		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				System.out.println("\nCookie에 저장된 정보 : ");
				System.out.println(cookies[i].getName() + ": " + cookies[i].getValue());
				System.out.println("\n");
			}
		}
		HttpSession session = req.getSession(true);
		UserVO userVO = (UserVO) session.getAttribute("userVO");
		System.out.println("session에 저장된 UserVO 유무 확인:" + userVO);
//		
		if (session != null) {
			out.println("<hr> JSESSIONID=" + session.getId() + "</hr>");
			String name = (String) session.getAttribute("name");
			out.println("이름: " + name);
		} 
		
		UserDao userDao = new UserDao();
		System.out.println("html에서 잘받아오나:"+req.getParameter("name"));
		out.println("<li>이름: "+userDao.findUser(req.getParameter("name")).getName());
		out.println("<li>성별: "+userDao.findUser(req.getParameter("name")).getSex());
		out.println("<li>id: "+userDao.findUser(req.getParameter("name")).getId());
		out.println("<li>비밀번호: "+userDao.findUser(req.getParameter("name")).getPwd());
		out.println("<li>생년월일: "+userDao.findUser(req.getParameter("name")).getYear());

		
		out.println("<p>");
		out.println("<p><p><a href='/selfstudy/FindUser.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

	} // end of service
}// end of class
