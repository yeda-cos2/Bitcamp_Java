public class Prob16 {
	public static void printGugudan(int no) {

		if (no < 1 || no > 9) {
			System.out.println("1이상 9이하의 값을 입력하셔야 합니다.");
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
		System.out.println("주어진 숫자까지의 구구단을 찍습니다.");
		System.out.println("--------Sample 1----------");
		Prob16.printGugudan(4); // 위 클래스랑 분리되어도 public이라 class.으로 호출 가능

		System.out.println("--------Sample 2----------");
		printGugudan(9);

		System.out.println("--------Sample 3----------");
		printGugudan(-1);

		System.out.println("--------Sample 4----------");
		printGugudan(10);

	}// end of main
}// end of class
