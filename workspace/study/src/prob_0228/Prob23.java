package prob_0228;

public class Prob23 {

	public String toEncoding(String str) {

		String newstr = "";

		for (int i = 0; i < str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			byte[] temp = s.getBytes();

			if (temp.length == s.length()) {
				newstr += s;
			}

			for (int j = 0; j < temp.length; j++) {
				String h = Integer.toHexString(temp[j]);
				if (h.charAt(0) == 'f') {
					newstr += '%' + h.toUpperCase().substring(6, 8);
				}
			}
		}
		return newstr;
	}

	public static void main(String[] args) {
		Prob23 p1 = new Prob23();
		System.out.println("�Է�: Korea ");
		System.out.println("���: " + p1.toEncoding("Korea"));
		System.out.println("�Է�: ȫ�浿");
		System.out.println("���: " + p1.toEncoding("ȫ�浿"));
		System.out.println("�Է�: ȫ �� ��");
		System.out.println("���: " + p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է�: Hong �� ��");
		System.out.println("���: " + p1.toEncoding("Hong �� ��"));
		System.out.println("�Է�: 0319 ");
		System.out.println("���: " + p1.toEncoding("0319"));
	}

}