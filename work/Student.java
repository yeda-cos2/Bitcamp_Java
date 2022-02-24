public class Student {
	// Field
	private String name;
	private int age;
	private int id;

	// Constructor
	public Student() {

	}

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	// Method
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void setName(){
		this.name=name;
	}
	public void setAge(){
		this.age=age;
	}
	public void setId(){
		this.id=id;
	}
	public void print() {
		System.out.println("이름: " + getName() + " 나이: " + getAge() + " 학번: " + getId());
	}
}

