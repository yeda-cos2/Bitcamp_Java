package jb01.part02;

public class Example1 {
	public static void main(String args[]) {

		int i = Integer.parseInt(args[0]);
		String a;

		if (i >= 0 && i <= 100) {
			if (i >= 90) {
				a = "��";
			} else if (i >= 80) {
				a = "��";
			} else if (i >= 70) {
				a = "��";
			} else if (i >= 60) {
				a = "��";
			} else {
				a = "��";
			}
			System.out.printf("�Է��Ͻ� �� %d���� %s�Դϴ�.", i, a);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		}
	}
}