abstract class BusCharge {
	String section;

	public BusCharge() {

	}

	public BusCharge(String section) {
		this.section = section;
	}

	public void information() {
		System.out.println("������ݾȳ�");
	}

}

class Student extends BusCharge {
	public Student() {
		super("�л�");
	}

	public void charge() {
		System.out.println("300��");
	}
}

class Adult extends BusCharge {
	public Adult() {
		super("�Ϲ���");
	}

	public void charge() {
		System.out.println("500��");
	}
}

class Old extends BusCharge {
	public Old() {
		super("���");
	}

	public void charge() {
		System.out.println("��¥");
	}
}

public class Display2{
	public static void main(String[] args) {
		BusCharge bc1 =new Student();
		BusCharge bc2 =new Adult();
		BusCharge bc3 =new Old();

		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();
		
		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();
		
		bc3.information();
		System.out.print(bc3.section);
		bc3.charge();
	}
}
		