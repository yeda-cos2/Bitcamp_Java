public class Example5 {
	public static void main(String[] args) {
		int[][] text = new int[9][9];

		for (int i = 0; i < 9; i++) {
			System.out.println((i + 1) + "단을 출력합니다.");

			for (int k = 0; k < 9; k++) {
				text[i][k] = (i + 1) + "*" + (k + 1) + "=" + (i + 1) * (k + 1);
				System.out.println("text[" + i + "][" + k + "]:" + text[i][k]);
			}

		}
	}
}
