public class Prob11 {
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 15;

		Prob11 prob = new Prob11();
		System.out.println("두 수의 차는 " + prob.abs(num1, num2));
	}

	public int abs(int num1, int num2) {

		if (num1 > num2) {
			return (num1 - num2);

		} else if (num1 < num2) {
			return (num2 - num1);

		} else {
			return 0;
		}
	} //end of main
} //end of class