public class Example2
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);

		if(i>0 && i<10){
			System.out.println(i+"단을 출력합니다.");
			for(int k=1;k<10;k++){
			System.out.println(k+"*"+i+"="+k*i);
			
		}
		}else{
			System.out.println("1~9 사이의 수를 입력하세요");
		}
	}
}
