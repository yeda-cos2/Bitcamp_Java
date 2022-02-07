package jb01.part02;
/*
FileName: CastingTest.java

1. primitive data type�� ����ȯ: ������ ����ȯ/����� ����ȯ
2. reference data type�� ����ȯ: ������ ����ȯ/����� ����ȯ===>����
*/
public class CastingTest {
	/// main method
	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = 20;

		// ==>compile error�߻�(Ȯ�ο��)
		// ==>�������� ����� int return
		// byte b3=b1+b2;

		// casting�����ڸ� �̿��� ����ȯ==>����� ����ȯ
		byte b4 = (byte) (b1 + b2);
		System.out.println("b4(b1+b2):" + b4);

		byte b5 = (byte) (b1 + b4);
		// �����Ⱚ ���(==>����� ��°�� Ȯ���� ��)
		System.out.println("b5(b1+b4):" + b5);

		// ==>������ ����ȯ
		int i1 = b1 + b2;
		System.out.println(i1);
		int i2 = b1 + b4;
		System.out.println(i2);

		// �ٸ� data type����==>data type�� ū ������ ������ ����ȯ
		double test01 = 100 + 0.5;
		System.out.println(test01);
		// ==>compile error �߻�(Ȯ�ο��)
		// int test02=100+0.5;

		// �Ǽ��� �������� �����ϸ� �����?
		int i3 = 201 / 2;
		System.out.println("i3(201/2):" + i3);

		// ������ ����� �Ǽ����� ���Խ� �����?
		double d1 = 201 / 2;
		System.out.println("d1(201/2):" + d1);

		// ���� int DataType 201�� �Ǽ� double Data Type���� ����� ����ȯ ��
		// ������� double Data Type���� ������ ��°����?
		double d2 = (double) 201 / 2;
		System.out.println("d2(201/2): " + d2);

	}// end of main

}

