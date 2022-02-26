
package study;

import java.util.Vector;

public class Prob22 {

	public Vector<String> dataChange(String[] strData) {

		Vector<String> v = new Vector<String>();
		String data = "";

		for (int i = strData.length - 1; i >= 0; i--) {
			for (int j = strData[i].length() - 1; j >= 0; j--) {
				data += strData[i].charAt(j);
			}

			v.add(data);
			data = "";
		}

		return v;
	}

	public static void main(String[] args) {

		Prob22 st = new Prob22();
		String[] strData = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
		Vector<String> v = st.dataChange(strData);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
	}
}
