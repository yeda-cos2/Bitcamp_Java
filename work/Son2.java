package jb04.part07;
public class Son2 extends Father{

	public Son2() {
		System.out.println(this.name);
		System.out.println(bank);
		System.out.println(branch);
//		System.out.println(password);   =>private이라 오류


		System.out.println("은행 비밀번호: " + this.getPassword(0));
	}
}