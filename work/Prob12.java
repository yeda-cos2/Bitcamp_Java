package homework;

public class Prob12 {

	public void calc(int[] ix) {
		int odd = 0;
		int even = 0;

		for (int i = 0; i < ix.length; i++) {
			if (ix[i] % 2 == 1) {
				odd += ix[i];
			} else {
				even += ix[i];
			}
		}
		System.out.println("Ȧ���� �� : " + odd);
		System.out.println("¦���� �� : " + even);
	}

	public static void main(String[] args) {

		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };

		Prob12 p = new Prob12();
		System.out.println("(�迭 ia)");
		p.calc(ia);
		System.out.println("(�迭 ib)");
		p.calc(ib);

	}// end of main
}// end of class
