package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginBeanDataSource extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		//Client Form Data 처리
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		///UserVO instance 생성 및 Client Form Data 전달 (Blinding)\
		UserVO userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()) {
			out.println(id+"님 환영합니다.");
		}else {
			out.println("Login 실패 id, pwd를 확인하세요.");
		}
		
		out.println("<p><p><a href='/edu/jw04/loginBeanDataSource.html'>뒤로</a>");
		out.println("</boyd>");
		out.println("</html>");
		
	}
}
