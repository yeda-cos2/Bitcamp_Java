abstract class Shape {
	//Field
	private String name = "";
	protected double area;

	//Constructor
	public Shape() {
	}

	public Shape(String name) {
		this.name = name;
	}

	//Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public abstract void calculationArea();

	public void print() {
		System.out.println(name + "의 면적은 " + area);
	} 
}//end of class