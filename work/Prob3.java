import java.util.Scanner;

public class Prob3{

	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");

		int inputInt = keyboard.nextInt();

		int i=1;
		if(inputInt>=2 && inputInt<=9){
			for(int fac=1; i<=inputInt; i++){
				fac *= i;
				System.out.println(i+" ! = "+fac);
		}
		}else{
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			System.exit(0);
		}
	}
}