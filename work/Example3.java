public class Example3
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);

		if(args.length != 2){
			System.out.println("숫자를 두 개 입력해주세요");
		}

		int sum, temp;

		if(i<k){
			temp = i;
			i=k;
			k=temp;
		} //end of if

		if(i==k){
			System.out.println("입력값이 같습니다 [usage]:: 서로 다른 두 수를 입력하세요");

			}else{
				System.out.print(k+"~"+i+"의 합은 ");
				for(sum=0;i>=k;k++){
					sum+=k;
					} //end of for
			System.out.println(sum+"입니다.");
			}//end of else


} // end of main
} // end of class
