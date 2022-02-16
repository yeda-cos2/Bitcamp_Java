public class Employee {

	String part, name;
	int age, baseSalary;

	public Employee() {
		System.out.println("Emp의 defualt Constructor");
	}

	public Employee(String str) {
		name = str;
		System.out.println("Emp의 name을 받는 Constructor");
	}

	public Employee(String str1, String str2) {
		this(str1);
		part = str2;
		System.out.println("Emp의 name,part을 받는 Constructor");
	}

	public Employee(String str1, String str2, int i) {
		this(str1, str2);
		age = i;
		System.out.println("Emp의 name,part,age을 받는 Constructor");
	}

	public int salary() {
		System.out.println("Emp의 salary() method");
		baseSalary = 100;
		return baseSalary;
	}
}
