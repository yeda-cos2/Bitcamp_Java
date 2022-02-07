package jb01.part02;

public class Example1 {
	public static void main(String args[]) {

		int i = Integer.parseInt(args[0]);
		String a;

		if (i >= 0 && i <= 100) {
			if (i >= 90) {
				a = "수";
			} else if (i >= 80) {
				a = "우";
			} else if (i >= 70) {
				a = "미";
			} else if (i >= 60) {
				a = "양";
			} else {
				a = "가";
			}
			System.out.printf("입력하신 값 %d점은 %s입니다.", i, a);
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
	}
}