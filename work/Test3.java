public class Test3 {
    public static void main(String args[]) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        String isodd1, isodd2; 
        String three1, three2;
        
        if(i%2==1){
            isodd1="홀수";
        }else{
            isodd1="짝수";
        }
        
        if(i%3==0){
            three1="3의 배수입니다.";
        }else{
            three1="3의 배수가 아닙니다.";
        }
        
        if(j%2==1){
            isodd2="홀수";
        }else{
            isodd2="짝수";
        }
        
        if(j%3==0){
            three2="3의 배수입니다.";
        }else{
            three2="3의 배수가 아닙니다.";
        }
        
        System.out.printf("입력하신 1번째 인자값 %d는 %s이며 %s \n",i,isodd1,three1);
        System.out.printf("입력하신 2번째 인자값 %d는 %s이며 %s \n",j,isodd2,three2);

    }
}