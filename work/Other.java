public class Other {

	String name = "ȫ�浿";
	String job = new String("������");

	Father owner = new Father();

	public Other() {
		System.out.println(this.owner.name);
		System.out.println(owner.bank);
		System.out.println(owner.branch);

		System.out.println("���� ��й�ȣ: " + this.owner.getPassword(0));
	}
}