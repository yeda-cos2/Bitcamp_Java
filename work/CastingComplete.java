class Super {
	public void a() {
		System.out.println("Super:a()");

	}
}

class Sub extends Super {
	public void a() {
		System.out.println("overriding�� Sub:a()");
	}

	public void b() {
		System.out.println("sub:b()");
	}
}

public class CastingComplete {
	public static void main(String[] args) {
		System.out.println("\n ����� Super s1=new Super()�κ�");
		Super s1 = new Super();
		s1.a();

		System.out.println("\n ����� Super s2=new Super()�κ�");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		System.out.println("\n ����� Super s3=new Super()�κ�");
		Super s3 = new Sub();
		s3.a();

		System.out.println("\n s3�� b()�� ���� �Ұ��ϴ�");
		System.out.println("casting �����ڸ� �̿� Sub sub=(Sub)s3 ����� ����ȯ");
		Sub sub = (Sub) s3;
		sub.b();

	}
}