package jb04.part07.outer;

public class Son1 extends jb04.part07.Father {
public class Son1 extends Father{

	public Son1() {
		System.out.println(this.name);
		System.out.println(bank);
//		System.out.println(branch);  =>���� ��Ű�� �ƴ϶� ����
//		System.out.println(password); =>private�̶� ����

		System.out.println(this.getBranch());
		System.out.println(getPassword(0));
	}
}
}