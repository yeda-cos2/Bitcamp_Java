package study;

public class MethodSyntaxTest {
	public static void main(String[] args) {

		MethodSyntax met = new MethodSyntax();

		// System.out.println("이름: "+met.getName());
		// System.out.println("주소: "+met.getAddress());
		// System.out.println("전화번호: "+met.getPhone());
		System.out.println("번호: " + met.getNumber());

		String[] str = met.getInfo();
		for (int i = 0; i < str.length; i++) {
			System.out.println((i + 1) + "정보: " + str[i]);
		}
	}
}