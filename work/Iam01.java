//package jb04.part03;

/*
	FileName : Iam01.java
	1. ���(�Ϲ�ȭ����)�� �����ڿ��� ����
	2. �����ڸ� ��������� ȣ���ϴ� this(), super() method ����
*/
public class Iam01 extends Human01{
	
	///Field
	String job;
	
	///Constructor
	public Iam01(){
		super();
        System.out.println("Iam class default Constructor");
	}
	public Iam01(String str){
		super();
		System.out.println("Iam class�� String ���ڸ� �޴� Constructor");
		job = str;
	}
  
	///main method
	public static void main(String args[]){
		Iam01 iam = new Iam01();
  }//end of main
}//end of class

/*
	1. �����ڰ� �����ڸ� 1���� ����� �����ڴ� ������ å��
		�� Human01()�� �ּ�ó���ϰ� compile
		   ==> default �����ڸ� �׻� ����� �ִ� ������ ������.
		
		2. �����ڸ� ��������� ȣ�� �� �� �ִ� method 
			�� this() ==> �ڽ��� default ������ ��������� ȣ��
			�� super() ==>������ default ������ ����� ȣ��

			this(1) ==> �ڽ��� �������� int ���ڰ��� 1�� �޴� ������ ����� ȣ��
			super(1) ==> ������ �������� int ���ڰ��� 1�� �޴� ������ ����� ȣ��

		3. ���������� �������� 1��° line  super()�� �����Ǿ� �ִ� �����̴�.
			public Iam1(){
				//super() <==�����ȱ���
			}
		
		4. �����ڸ� ȣ���ϴ� super(), this()�� ��Ģ
			�� �����ڳ��ο��� �� , 1��° line �� �� ��� �� �� ������.
			�� 1���� ��� �� �� �ִ�.
*/