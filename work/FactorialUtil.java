package homework;

import java.util.Scanner;

public class FactorialUtil {
	int sum = 1;

	public int factorial(int n) {
		sum *= n;

		if (n > 1) {
			factorial(n - 1);
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input = ");

		FactorialUtil util = new FactorialUtil();
		System.out.print("Result = " + util.factorial(keyboard.nextInt()));

	}// end of main
}// end of class
