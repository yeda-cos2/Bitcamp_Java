//package jb01.part03;
/*
FileName: Hi.java
*/

public class Hi
{
public static void main(String[] args)
{
	System.out.println("1��° ����: " +args[0]);
	System.out.println("2��° �Ʊ���Ʈ: "+args[1]);
	System.out.println("3���� ����: " +args[2]);
}//end of main
}
/*
1.compile���(Console����)
c:\work>javac Hi.java

==>bytecode���� Hi.class Ȯ���� ��

2. ������
java Hi ȫ�浿 1234 �Ѿ� 5678

==> Hi.class�� ����� java Hi �Ĵܿ� �߰��� ������ �Է��ϸ�
==> main method ���ο���
==> 1��° �߰���������: args[0]
==> 2��° �߰���������: args[1]
==> 3��° �߰���������: args[2]
==> �� �޾� ó���� �� �ִ�.

3. +(������): ���ڿ� +�� ����ϸ� append�� �ȴ�

4. editplus���� ���ڰ� �ޱ� ����
����/����������/����ڵ���/�μ����빯�� check
*/