package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");

		String fromDbId = null;
		String fromDbPwd = null;

		try {
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbuser = "scott";
			String dbpwd = "tiger";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			PreparedStatement pStmt = con.prepareStatement("SELECT id,pwd FROM users WHERE id=?");
			pStmt.setString(1, id);

			ResultSet rs = pStmt.executeQuery();

			if (rs.next()) {
				fromDbId = rs.getString("id");
				fromDbPwd = rs.getString("pwd");
				System.out.println("db���� Ȯ���� id,pwd==>" + fromDbId + " : " + fromDbPwd);
			} else {
				System.out.println("db�� client���� �Է��� <" + id + ">�� <" + pwd + ">�� �����ϴ�");
			}

			rs.close();
			pStmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("JDBC���� Exception �߻�");
			e.printStackTrace();
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login ȭ��</h2>");

		if (fromDbId != null && fromDbPwd != null && fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
			out.print(id + "�� ȯ���մϴ�");
		} else {
			out.print("id,pwd�� Ȯ���ϼ���");
		}

		out.println("<p><p><a href='/edu/jw04/login.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");

	}// end of service
}
// end of class
