public class Manager2 extends Employee {

	int salary;

	public Manager2() {
		System.out.println("Manager�� defualt Constructor");
	}

	public Manager2(String name) {
		super(name);
		System.out.println("Manager�� name�� �޴� Constructor");
	}

	public Manager2(String name, String part) {
		this(name);
		this.part = part;
		System.out.println("Manager�� name,part�� �޴� Constructor");
	}

	public Manager2(String name, String part, int age) {
		super(name, part);
		this.age = age;
		System.out.println("Manager�� name,part,age�� �޴� Constructor");
	}

	public Manager2(String name, String part, int age, int salary) {
		this(name,part,age);
		this.salary = salary;
		System.out.println("Manager�� name,part,age,salary�� �޴� Constructor");
	}

	public int salary() {
		System.out.println("Manager�� salary method");
		baseSalary = 200;
		return baseSalary;
	}

	public void callSalary() {
		System.out.println("Employee�� �⺻����:" + super.salary());
		System.out.println("Manager�� �⺻���� 1: " + this.salary());
		System.out.println("Manager�� �⺻���� 2: " + salary());

	}

	public static void main(String[] args) {
		Manager2 m1 = new Manager2("ȫ�浿");
		// Manager m4=new Manager("ȫ�浿"."EJB",25,300);
		// System.out.println("overriding�� salary ȣ��:"+m4.salary());
		// m4.callSalary();

	}
}
