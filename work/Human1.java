public class Human1 {
	// Field
	private String name;
	private int age;

	// Constructor
	public Human1() {
	}

	public Human1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}

}

class Student extends Human1 {
	// Field
	private int id;

	// constructor
	public Student() {

	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	// Method
	public int getId() {
		return id;
	}

	public void print() {
		System.out.println("이름: " + getName() + " 나이: " + getAge() + " 학번: " + getId());
	}

}

class Teacher extends Human1 {
	// Field
	private String subject;

	// Constructor
	public Teacher() {

	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// Method
	public String getSubject() {
		return subject;
	}

	public void print() {
		System.out.println("이름: " + getName() + " 나이: " + getAge() + " 담당과목: " + this.subject);
	}
}

class Employee extends Human1 {
	// Field
	private String dept;

	// Constructor
	public Employee() {

	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	// Method
	public String getDept() {
		return dept;
	}

	public void print() {
//		super.print();
//		System.out.println("\t 학번:"+getId());
		System.out.println("이름: " + getName() + " 나이: " + getAge() + " 부서: " + getDept());
	}
}
