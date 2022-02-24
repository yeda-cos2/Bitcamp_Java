//package jp02.part02;

/*
*	 FileName : ExceptionTest05.java
*
*       ==>  java ExceptionTest 10 20 0 ����� 3��° ���ڰ��� 0�̸� ����� �����߻�
*       ==> ��°��(����� ����)�а� ��°�� Ȯ��
*       ==> �ذ�1. try{}catch()�� ����(Exception::����)�߻���Ȳ ó��, ���� ����
*  		==> �ذ� 2. throws �� JVM���� ������ ȣ����(������ �߻���Ų)������ �߻���
*                          Exception �� ������(? , ����). (����  : ȣ���� ��(���� ������ ��))
*      ==> �ذ� 3. JVM���� ���� ��, program ���ο��� throws �ϴ� Exception(����ó��)��
*                          �ذ�å�� try-catch
* ============================================
*     ==> main()���� throws �� ����ߴ� �ǹ̰� �ִ°�? 
*     ==> main �� ���� ȣ���Ͽ� java application �� ���� ��Ű�°� ? 
*/
public class ExceptionTest05{	
	
	///Field
	private int sum;
	private int avg;
	
	///Constructor	
	public ExceptionTest05(){
	}
	
	///Method
	public void sum(int x,int y){
		System.out.println("1.==> sum ����");
		sum = x + y;
		System.out.println("1.==> �� : "+sum);
		System.out.println("1.==>  sum ��");
	}
	//JVM���� ���� ArithmethicException�� �ٽ� �ڽ��� ȣ���� ������ ����(?, ����)��
	 public void avg(int z) throws ArithmeticException{
		System.out.println("2.==> avg ����");
		avg = sum / z;  		//z = 0 �ΰ�� �Ҵ�
		System.out.println("2.==>�� : "+avg);
		System.out.println("2.==> avg ��");
	  }
	
	///main method
	// main method ���� try-catch ó�� �ʰ� JVM������ ���� throws Exception
	// �� ������ �ִ� ����� ???? ó�����ѰŶ��Ȱ�
	public static void main(String[] args) throws Exception{
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		
		ExceptionTest05 et = new ExceptionTest05();
		et.sum(i,j);
		et.avg(k);

		System.out.println("main Method End....");
		
  }//end of main
	
}//end of class