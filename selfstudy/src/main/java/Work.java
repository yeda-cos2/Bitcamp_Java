
import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class Work extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>hello Sevlet</title></head>");
		out.println("<h2>��������</h2>");
		out.println("<body>");
		
		Enumeration<String> en=req.getParameterNames();
		
		while(en.hasMoreElements()) {
			String name=en.nextElement();
			String[] values=req.getParameterValues(name);
			
			
			for(int i=0;i<values.length;i++) {
//			for(String value:values) {
				if(name.equals("year")||name.equals("month")||name.equals("day")) {
					if(name.equals("year")) {
						out.print("<li> �������: ");
					}else {
						out.print("/");
					}
					out.print(values[i]);
					break;
				}
				
				if(name.equals("tel1")||name.equals("tel2")) {
					out.print("<li> ��ȭ��ȣ: ");
				}else {
					out.print("-");
				}
				
				out.println("<li>"+name+":"+values[i]);
			}
			
		}

//		String year = req.getParameter("year");
//		String month = req.getParameter("month");
//		String day = req.getParameter("day");

//		String tel1 = req.getParameter("tel1");
//		String tel2 = req.getParameter("tel2");
//		String tel3 = req.getParameter("tel3");
//		String tel11 = req.getParameter("tel11");
//		String tel12 = req.getParameter("tel12");
//		String tel13 = req.getParameter("tel13");
//		String cal = req.getParameter("cal");
//		String fyear=req.getParameter("fyear");
//		String grad=req.getParameter("grad");
//		String nation=req.getParameter("nation");
//		String telecom=req.getParameter("telecom");
//		String baby=req.getParameter("baby");
//		String movable=req.getParameter("movable");


//		out.println("<li>�������: "+year+"�� "+cal+" "+month+" "+day);
//		out.println("<li>����: "+job+", �Ҽ�: "+job2); 
//		out.println("<li>��ȥ����: "+marraige);
//		out.println("<li>�ڳ��: "+baby);
//		out.println("<li>����ó: "+"("+telecom+")"+tel1+"-"+tel2+"-"+tel3);
//		out.println("<li>����ó: "+"("+movable+")"+tel11+"-"+tel12+"-"+tel13);
//		out.println("<li>�����з�: "+grad);
//		out.println("<li>������: "+"("+nation+") "+addr);
	
		out.println("<p>");
		out.println("<p><p><a href='/selfstudy/work.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

	}// end of service
}// end of class