public class Example1 {
	public static void main(String args[]) {

		int i = Integer.parseInt(args[0]);
		// 1. �Է°��� 0���� ��� ���� �ʱ�
		// if(args.length ==0){
		// System.out.println("0~100���̰� �Է� ���: ");
		// return;
		// }

		// 2. �Է°��� 1���� �ƴ� ��� ���� �� ���� �ʱ�
		if (args.length != 1) {
			System.out.println("0~100���̰� �Է� ���: ");
			return;
		}

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
			System.out.println("�Է��Ͻ� �� " + i + "���� " + a + " �Դϴ�.");

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		}
	}
}