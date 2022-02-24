public class Teacher {
	private String name;
	private int age;
	private String subject;

	public Teacher() {

	}

	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setName(){
		this.name=name;
	}

	public void setAge(){
		this.age=age;
	}

	public String getSubject() {
		return subject;
	}
	
	public void setSubject(){
		this.subject=subject;
	}

	public void print() {
		System.out.println("이름: " + getName() + " 나이: " + getAge() + " 담당과목: " + getSubject());
	}
}

