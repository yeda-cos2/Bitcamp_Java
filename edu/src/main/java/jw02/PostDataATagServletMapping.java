package jw02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class PostDataATagServletMapping extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException, IOException{
		// Client form Data 한글 디코딩
		req.setCharacterEncoding("EUC_KR");
		
		//아래의 두 실행문은 servlet에서 client로 Html을 전송시 필수 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client form data(QueryString :: name=value)처리 (API 확인)
		String clientName = req.getParameter("name");
		String ClientAddr = req.getParameter("addr");
		
		//client form data 처리 출력 확인
		System.out.println(clientName+" : "+ClientAddr);
		
		out.println("<html>");
		out.println("<head><title>PostDataATagServletMapping.html</title></head>");
		out.println("<body>");
		
		out.println("<h2>post test</h2>");
		out.println("<li> 이름 : " + clientName);
		out.println("<li> 주소 : " + ClientAddr);
		
		out.println("<p><p><a href='/edu/jw02/postDataATagServletMapping.html'>뒤로</a>");
		
		
		//==> <a> Tag 이용 QueryString 전달
		out.println
		("<p><a href='/edu/PostDataATagServletMapping?name=홍길동&addr=서울'>"+"자기자신</a>");
		
		out.println("</body>");
		out.println("</html>");
	
	}
}
