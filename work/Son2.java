package jb04.part07;
public class Son2 extends Father{

	public Son2() {
		System.out.println(this.name);
		System.out.println(bank);
		System.out.println(branch);
//		System.out.println(password);   =>private�̶� ����


		System.out.println("���� ��й�ȣ: " + this.getPassword(0));
	}
}