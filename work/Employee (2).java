public class Employee {
		private String name;
		private int age;
		private String dept;

		public Employee() {

		}

		public Employee(String name, int age, String dept) {
			this.name = name;
			this.age = age;
			this.dept = dept;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getDept() {
			return dept;
		}

		public void setName(){
		this.name=name;
	}

	public void setAge(){
		this.age=age;
	}
	
	public void setDept(){
		this.dept=dept;
	}

		public void print() {
			System.out.println("이름: " + getName() + " 나이: " + getAge() + " 부서: " + getDept());
		}
	}

