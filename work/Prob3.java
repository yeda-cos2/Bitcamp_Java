import java.util.Scanner;

public class Prob3 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");

		int inputInt = keyboard.nextInt();

		if (inputInt < 2 || inputInt > 9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}

		int fac = 1;

		for (int i = 1; i <= inputInt; i++) {
			fac *= i;
			System.out.println(i + " ! = " + fac);
		}

	} // end of main
} // end of class
