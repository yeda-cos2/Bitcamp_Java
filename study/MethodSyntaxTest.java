package study;

public class MethodSyntaxTest {
	public static void main(String[] args) {

		MethodSyntax met = new MethodSyntax();

		// System.out.println("�̸�: "+met.getName());
		// System.out.println("�ּ�: "+met.getAddress());
		// System.out.println("��ȭ��ȣ: "+met.getPhone());
		System.out.println("��ȣ: " + met.getNumber());

		String[] str = met.getInfo();
		for (int i = 0; i < str.length; i++) {
			System.out.println((i + 1) + "����: " + str[i]);
		}
	}
}