
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Work extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		String job = req.getParameter("job");
		String job2 = req.getParameter("job2");
		String tel1 = req.getParameter("tel1");
		String tel2 = req.getParameter("tel2");
		String tel3 = req.getParameter("tel3");
		String tel11 = req.getParameter("tel11");
		String tel12 = req.getParameter("tel12");
		String tel13 = req.getParameter("tel13");
		String cal = req.getParameter("cal");
		String fyear=req.getParameter("fyear");
		String grad=req.getParameter("grad");
		String marraige=req.getParameter("marraige");
		String nation=req.getParameter("nation");
		String addr=req.getParameter("addr");
		String telecom=req.getParameter("telecom");
		String baby=req.getParameter("baby");
		String movable=req.getParameter("movable");

		out.println("<html>");
		out.println("<head><title>hello Sevlet</title></head>");
		out.println("<h2>개인정보</h2>");
		out.println("<body>");
		out.println("<li>이름: "+name);
		out.println("<li>성별: "+sex);
		out.println("<li>생년월일: "+year+"년 "+cal+" "+month+" "+day);
		if(fyear.equals("on")){
		out.println("(윤달)");
		}
		out.println("<li>직업: "+job+", 소속: "+job2); 
		out.println("<li>결혼여부: "+marraige);
		out.println("<li>자녀수: "+baby);
		
		if(tel1.length()!=0){
			out.println("<li>연락처: "+"("+telecom+")"+tel1+"-"+tel2+"-"+tel3);
		}
		if(tel11.length()!=0){
			out.println("<li>연락처: "+"("+movable+")"+tel11+"-"+tel12+"-"+tel13);

		}
		out.println("<li>최종학력: "+grad);
		out.println("<li>거주지: "+"("+nation+") "+addr);
	
		out.println("<p>");
		out.println("<p><p><a href='/edu/Work.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

	}// end of service
}// end of class