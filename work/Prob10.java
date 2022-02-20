public class Prob10{

public void printSeason(int month){
	
	String season="봄";

	switch(month){
		case 3:
		case 4:
		case 5:
			//System.out.println("봄에 태어나셨네요");
			break;
		
		case 6:
		case 7:
		case 8:
			//System.out.println("여름에 태어나셨네요");
			season="여름";
			break;

		case 9:
		case 10:
		case 11: 
			//System.out.println("가을에 태어나셨네요");
			season="가을";
			break;
		
		default:
			//System.out.println("겨울에 태어나셨네요");
			season="겨울";
			break;
}
System.out.println(season+"에 태어나셨네요");
}

	public static void main(String[] args){
		int month=Integer.parseInt(args[0]);
		new Prob10().printSeason(month);

			if(month<1 || month>12){
				System.out.println("1~12사이의 숫자만 입력하셔야 합니다.");
				return;
			}

} //end of main
} //end of clas