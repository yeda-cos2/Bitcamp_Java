public class Prob2 {

	public static void main(String[] args) {

		int limit = 50;
		boolean prime = false;

		for (int i = 2; i <= limit; i++) {
			for (int k = 2; k < i; k++) {
				prime = (i % k == 0);
				if (prime) {
					break;
				}
			}
			if (!prime) {
				System.out.println(i);
			}
		}

	}
}