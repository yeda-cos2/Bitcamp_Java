public class Rectangular extends Shape {
	//Field
	private double width;
	private double height;

	//Constructor
	public Rectangular() {
	}

	public Rectangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	//Method
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void calculationArea() {
		area = width * height;
	}
}