public class Example3
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);

		if(args.length != 2){
			System.out.println("���ڸ� �� �� �Է����ּ���");
		}

		int sum, temp;

		if(i<k){
			temp = i;
			i=k;
			k=temp;
		} //end of if

		if(i==k){
			System.out.println("�Է°��� �����ϴ� [usage]:: ���� �ٸ� �� ���� �Է��ϼ���");

			}else{
				System.out.print(k+"~"+i+"�� ���� ");
				for(sum=0;i>=k;k++){
					sum+=k;
					} //end of for
			System.out.println(sum+"�Դϴ�.");
			}//end of else


} // end of main
} // end of class