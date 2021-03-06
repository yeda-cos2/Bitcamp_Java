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
		System.out.println("입력: Korea ");
		System.out.println("출력: " + p1.toEncoding("Korea"));
		System.out.println("입력: 홍길동");
		System.out.println("출력: " + p1.toEncoding("홍길동"));
		System.out.println("입력: 홍 길 동");
		System.out.println("출력: " + p1.toEncoding("홍 길 동"));
		System.out.println("입력: Hong 길 동");
		System.out.println("출력: " + p1.toEncoding("Hong 길 동"));
		System.out.println("입력: 0319 ");
		System.out.println("출력: " + p1.toEncoding("0319"));
	}

}
