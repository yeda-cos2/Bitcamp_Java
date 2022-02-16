public class Manager2 extends Employee {

	int salary;

	public Manager2() {
		System.out.println("Manager의 defualt Constructor");
	}

	public Manager2(String name) {
		super(name);
		System.out.println("Manager의 name을 받는 Constructor");
	}

	public Manager2(String name, String part) {
		this(name);
		this.part = part;
		System.out.println("Manager의 name,part을 받는 Constructor");
	}

	public Manager2(String name, String part, int age) {
		super(name, part);
		this.age = age;
		System.out.println("Manager의 name,part,age을 받는 Constructor");
	}

	public Manager2(String name, String part, int age, int salary) {
		this(name,part,age);
		this.salary = salary;
		System.out.println("Manager의 name,part,age,salary을 받는 Constructor");
	}

	public int salary() {
		System.out.println("Manager의 salary method");
		baseSalary = 200;
		return baseSalary;
	}

	public void callSalary() {
		System.out.println("Employee의 기본급은:" + super.salary());
		System.out.println("Manager의 기본급은 1: " + this.salary());
		System.out.println("Manager의 기본급은 2: " + salary());

	}

	public static void main(String[] args) {
		Manager2 m1 = new Manager2("홍길동");
		// Manager m4=new Manager("홍길동"."EJB",25,300);
		// System.out.println("overriding된 salary 호출:"+m4.salary());
		// m4.callSalary();

	}
}
