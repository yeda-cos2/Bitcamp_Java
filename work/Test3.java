public class Test3 {
    public static void main(String args[]) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        String isodd1, isodd2; 
        String three1, three2;
        
        if(i%2==1){
            isodd1="Ȧ��";
        }else{
            isodd1="¦��";
        }
        
        if(i%3==0){
            three1="3�� ����Դϴ�.";
        }else{
            three1="3�� ����� �ƴմϴ�.";
        }
        
        if(j%2==1){
            isodd2="Ȧ��";
        }else{
            isodd2="¦��";
        }
        
        if(j%3==0){
            three2="3�� ����Դϴ�.";
        }else{
            three2="3�� ����� �ƴմϴ�.";
        }
        
        System.out.printf("�Է��Ͻ� 1��° ���ڰ� %d�� %s�̸� %s \n",i,isodd1,three1);
        System.out.printf("�Է��Ͻ� 2��° ���ڰ� %d�� %s�̸� %s \n",j,isodd2,three2);

    }
}