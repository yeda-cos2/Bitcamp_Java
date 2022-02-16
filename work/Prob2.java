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
			} // end of inner

			if (!prime) {
				System.out.println(i);
			}

		} // end of outer
	}// end of main
}// end of class



//			for(int i=2; i<=limit; i++){
//			prime=true;
//			for(int j=2;j<i;j++){
//				if(i%j==0){
//					prime=false;
//					break;
//				}
//			}
//			if(prime){
//				System.out.println(i);
//			}
//		}
