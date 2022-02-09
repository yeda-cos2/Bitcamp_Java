public class Example3
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		int sum1, sum2;

	if(i>k){
	    System.out.print(k+"~"+i+"의 합은 ");
			for(sum1=0;i>=k;k++){
				sum1=sum1+k;
	}					
	System.out.println(sum1+"입니다.");

	
	}else if(i==k){
		System.out.println("입력값이 같습니다 [usage]:: 서로 다른 두 수를 입력하세요");
	
	}else if(i<k){
	    System.out.print(i+"~"+k+"의 합은 ");
		for(sum2=0;k>=i;i++){
		sum2=sum2+i;
		}
		System.out.println(sum2+"입니다.");
}

}
}
