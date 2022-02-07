package jb01.part02;

public class Test2 {
	public static void main(String args[]) {

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		if (i > j) {
			System.out.printf("첫번째인수:%d,두번째인수:%d,%d-%d=%d입니다.", i, j, i, j, i - j);
		} else if (i < j) {
			System.out.printf("첫번째인수:%d,두번째인수:%d,%d+%d=%d입니다.", i, j, i, j, i + j);

		}

	}
}