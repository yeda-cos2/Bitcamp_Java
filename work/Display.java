class BusCharge {

	String section;

	public BusCharge() {

	}

	public BusCharge(String str) {
		section = str;
	}

	public void information() {
		System.out.println("������ݾȳ�");
	}

	public void charge() {
		System.out.println("�л�:300, �Ϲ���:500,���:��¥");
	}

}

class Student extends BusCharge {
	public Student() {
		super("�л�");
	}

	public void charge() {
		System.out.println("::300��\n");
	}
}

class Adult extends BusCharge {
	public Adult() {
		super("�Ϲ���");
	}

	public void charge() {
		System.out.println("::500��\n");
	}
}

class Old extends BusCharge {
	public Old() {
		super("���");
	}

	public void charge() {
		System.out.println("::��¥\n");
	}
}