public class Circle extends Shape {
	//Field
	private double radius;

	//Constructor
	public Circle() {
	}

	public Circle(String name){
		super(name);
	}

	public Circle(double radius){
		this.radius=radius;
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	//Method
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calculationArea() {
		area = Math.PI * radius * radius;
	}
}