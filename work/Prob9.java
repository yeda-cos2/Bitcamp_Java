public class Prob9{

	public static void main(String[] args){

		int input = Integer.parseInt(args[0]);

		if(input<1){
			System.out.println("1 이상의 정수를 입력해주세요");
			return;
		}

		for(int i=1; i<=input; i++){

			for(int j=input-i ; j>=0; j--){
				System.out.print(" ");
			}

			for(int k=0; k<2*i-1  ;k++){
				System.out.print("*");
			}
					System.out.println();

		}

	} //end of main
} //end of class