public class Prob8 {

	public int abs(int num1, int num2) {

		if (num1 >= num2) {
			return (num1 - num2);
		} else {
			return (num2 - num1);
		}
	}

	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 15;

		Prob8 prob = new Prob8();
		System.out.println("두 수의 차는 " + new Prob8().abs(num1, num2));

	} // end of main
} // end of class