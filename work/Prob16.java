public class Prob16 {
	public static void printGugudan(int no) {

		if (no < 1 || no > 9) {
			System.out.println("1�̻� 9������ ���� �Է��ϼž� �մϴ�.");
			return;
		}
		for (int j = 1; j < 10; j++) {
			for (int i = 1; i <= no; i++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		System.out.println("�־��� ���ڱ����� �������� ����ϴ�.");
		System.out.println("--------Sample 1----------");
		Prob16.printGugudan(4); // �� Ŭ������ �и��Ǿ public�̶� class.���� ȣ�� ����

		System.out.println("--------Sample 2----------");
		printGugudan(9);

		System.out.println("--------Sample 3----------");
		printGugudan(-1);

		System.out.println("--------Sample 4----------");
		printGugudan(10);

	}// end of main
}// end of class
