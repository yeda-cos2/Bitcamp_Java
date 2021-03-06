abstract class BusCharge {
	String section;

	public BusCharge() {

	}

	public BusCharge(String section) {
		this.section = section;
	}

	public void information() {
		System.out.println("버스요금안내");
	}

}

class Student extends BusCharge {
	public Student() {
		super("학생");
	}

	public void charge() {
		System.out.println("300원");
	}
}

class Adult extends BusCharge {
	public Adult() {
		super("일반인");
	}

	public void charge() {
		System.out.println("500원");
	}
}

class Old extends BusCharge {
	public Old() {
		super("어르신");
	}

	public void charge() {
		System.out.println("공짜");
	}
}

public class Display1{
	public static void main(String[] args) {
		Student b1=new Student();
		Adult b2=new Adult();
		Old b3=new Old();
		
		b1.information();
		System.out.println(b1.section);
		b1.charge();
		
		b2.information();
		System.out.println(b2.section);
		b2.charge();
		
		b3.information();
		System.out.println(b3.section);
		b3.charge();
	}
}
