public class Example3
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		int sum1, sum2;

	if(i>k){
	    System.out.print(k+"~"+i+"�� ���� ");
			for(sum1=0;i>=k;k++){
				sum1=sum1+k;
	}					
	System.out.println(sum1+"�Դϴ�.");

	
	}else if(i==k){
		System.out.println("�Է°��� �����ϴ� [usage]:: ���� �ٸ� �� ���� �Է��ϼ���");
	
	}else if(i<k){
	    System.out.print(i+"~"+k+"�� ���� ");
		for(sum2=0;k>=i;i++){
		sum2=sum2+i;
		}
		System.out.println(sum2+"�Դϴ�.");
}

}
}
