import java.util.Scanner;

public class Prob3{

	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");

		int inputInt = keyboard.nextInt();

		int i=1;
		if(inputInt>=2 && inputInt<=9){
			for(int fac=1; i<=inputInt; i++){
				fac *= i;
				System.out.println(i+" ! = "+fac);
		}
		}else{
			System.out.println("잘못된 숫자가 입력되었습니다.");
			System.exit(0);
		}
	}
}