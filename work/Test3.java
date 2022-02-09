public class Test3 {
    public static void main(String args[]) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        
        if(i%2==1){
            System.out.print("입력하신 1번째 인자값 "+i+"는 홀수이며 ");
			if(i%3==0){
				System.out.println("3의 배수입니다.");
			}else{
				System.out.println("3의 배수가 아닙니다.");
			}
		}else{
			System.out.print("입력하신 1번째 인자값 "+i+"는 짝수이며 ");
			if(i%3==0){
				System.out.println("3의 배수입니다.");
			}else{
				System.out.println("3의 배수가 아닙니다.");
			}
		}

		if(j%2==1){
            System.out.print("입력하신 2번째 인자값 "+j+"는 홀수이며 ");
			if(j%3==0){
				System.out.println("3의 배수입니다.");
			}else{
				System.out.println("3의 배수가 아닙니다.");
			}
		}else{
			System.out.print("입력하신 2번째 인자값 "+j+"는 짝수이며 ");
			if(j%3==0){
				System.out.println("3의 배수입니다.");
			}else{
				System.out.println("3의 배수가 아닙니다.");
			}
		}

    }
}