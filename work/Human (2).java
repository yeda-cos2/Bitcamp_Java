package day05;

public class Human {

	//Field
	private String name;
	private int age;
	private int id;
	private String s1;
//	private String subject;
//	private String dept;
	
	//Constructor
	public Human() {
		
	}
	public Human(String name, int age, int id) {
	this.name=name;
	this.age=age;
	this.id=id;
	}
	public Human(String name, int age, String s1) {
		this.name=name;
		this.age=age;
		this.s1=s1;
	}
	
	
	//Method
	public void print() {
		if(getId()==0) {
		System.out.println("이름: "+getName()+" 나이: "+getAge()+" 담당과목/부서: "+getS1());
		}else {
			System.out.println("이름: "+getName()+" 나이: "+getAge()+" 학번: "+getId());
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
//	public String subject() {
//		return subject;
//	}
//	public String getDept() {
//		return dept;
//	}
	public String getS1() {
		return s1;
	}
}
