class BusCharge {

	String section;

	public BusCharge() {

	}

	public BusCharge(String str) {
		section = str;
	}

	public void information() {
		System.out.println("버스요금안내");
	}

//	public void charge() {
//		System.out.println("학생:300, 일반인:500,어르신:공짜");
//	}
	public abstract void charge();
//=> 실행하면 안쓰임(구체적일 필요는 없으나 지우느냐 건 x
	//밑에 오버라이딩 안하면 쓰레기값??????왜?=>이럴떄 abstract씀
	//오버라이딩 안하는 것은 아래 식 주석
//		public void charge() {
//	System.out.println("300원");
//}
	
}

class Student extends BusCharge {
	public Student() {
		super("학생");
	}

//	public void charge() {
//		System.out.println("::300원\n");
//	}
}

class Adult extends BusCharge {
	public Adult() {
		super("일반인");
	}

//	public void charge() {
//		System.out.println("::500원\n");
//	}
}

class Old extends BusCharge {
	public Old() {
		super("어르신");
	}

//	public void charge() {
//		System.out.println("::공짜\n");
//	}
}