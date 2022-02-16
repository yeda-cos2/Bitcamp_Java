public class Employee2 {

	String part;
	String name;
	int age;
	int baseSalary;

	public Employee2() {
		System.out.println("Emp의 defualt Constructor");
	}

	public Employee2(String name) {
		this.name = name;
		System.out.println("Emp의 name을 받는 Constructor");
	}

	public Employee2(String name, String part) {
		this(name);
		this.part = part;
		System.out.println("Emp의 name,part을 받는 Constructor");
	}

	public Employee2(String name, String part, int age) {
		this(name, part);
		this.age = age;
		System.out.println("Emp의 name,part,age을 받는 Constructor");
	}

	public int salary() {
		System.out.println("Emp의 salary() method");
		baseSalary = 100;
		return baseSalary;
	}
}
