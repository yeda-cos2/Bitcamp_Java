//package jp02.part02;

public class ExceptionTest03{

	private int sum;
	private int avg;

	public ExceptionTest03(){
	}

	public void sum(int x, int y){
		System.out.println("1.==>sum����");
		sum=x+y;
		System.out.println("1.==>��:"+sum);
		System.out.println("1.==>sum��");
	}

	//JVM���� ���� ArithmeticException�� �ٽ� �ڽ��� ȣ���� ������ ������
	public void avg(int z) throws ArithmeticException{
		System.out.println("2.>>avg����");
		//z=0�� ��� �Ҵ�
		avg=sum/z;
		System.out.println("2.==>���:"+avg);
		System.out.println("2.==>avg��");
	}

	public static void main(String[] args){
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int k=Integer.parseInt(args[2]);

		ExceptionTest03 et=new ExceptionTest03();
		et.sum(i,j);
		et.avg(k);

		System.out.println("main Method End...");
	}
}
