package jb01.part02;

public class Test2 {
	public static void main(String args[]) {

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		if (i > j) {
			System.out.printf("ù��°�μ�:%d,�ι�°�μ�:%d,%d-%d=%d�Դϴ�.", i, j, i, j, i - j);
		} else if (i < j) {
			System.out.printf("ù��°�μ�:%d,�ι�°�μ�:%d,%d+%d=%d�Դϴ�.", i, j, i, j, i + j);

		}

	}
}