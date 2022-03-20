package jw02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException, IOException{
		/*
		 * ==> Tomcat 8.X 이상 Get 방식 한글해결방법
		 * ==> server.xml 설정 변경
		 * <Connector port="8080" protocol="HTTP/1.1"
		 * 		connectionTimeout="20000"
		 * 		redirectPort="8443"
		 * 		useBodyEncodingForURI="true"/>  <== 추가
		 */
		req.setCharacterEncoding("EUC_KR");
		
		//아래의 두 실행문은 servlet에서 client로 Html을 전송시 필수 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client form data(QueryString :: name=value)처리 (API 확인)
		String clientName = req.getParameter("name");
		String ClientAddr = req.getParameter("addr");
		
		//client form data 출력(출력은 어디로 ?)
		System.out.println(clientName+" : "+ClientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetDataKrATagServletMapping</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get test</h2>");
		out.println("<li> 이름 : " + clientName);
		out.println("<li> 주소 : " + ClientAddr);
		
		out.println("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>뒤로</a>");
		
		//==> <a> 태그를 이용하여 Query 문자열 전달
		out.println
		("<p><a href='/edu/GetDataKrATagServletMapping?name=홍길동&addr=서울'>"+"자기자신</a>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
