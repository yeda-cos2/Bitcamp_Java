public class Prob8 {

		public int abs(int num1, int num2) {
		int result;
		result=num1-num2;

		if(result<0){

			return result*(-1);
		}

		return result;

		}

	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 15;


		Prob8 prob = new Prob8();
		System.out.println("두 수의 차는 " + new Prob8().abs(num1, num2));


	} //end of main
} //end of class