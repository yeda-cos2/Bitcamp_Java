package study;

//continue문을 활용해 짝수만 더하기

public class Continue {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int sum = 0;

		for (int j = 0; j <= i; j++) {
			if (j % 2 == 1) {
				continue;
			} // 짝수면 if문 빠져나와서 sum에 합산
			sum += j;
			
		} 
		System.out.println(i + "까지 짝수의 합은 " + sum);
	}
}
