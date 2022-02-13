public class Example1 {
	public static void main(String args[]) {

		int i = Integer.parseInt(args[0]);
		// 1. 입력값이 0개일 경우 받지 않기
		// if(args.length ==0){
		// System.out.println("0~100사이값 입력 요망: ");
		// return;
		// }

		// 2. 입력값이 1개가 아닐 경우 전부 다 받지 않기
		if (args.length != 1) {
			System.out.println("0~100사이값 입력 요망: ");
			return;
		}

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
			System.out.println("입력하신 값 " + i + "점은 " + a + " 입니다.");

		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
	}
}