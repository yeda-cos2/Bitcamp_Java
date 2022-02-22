public class Rectangle {
	// Field
	private String color = "";
	private int length;
	private int width;

	// Constructor
	public Rectangle() {
	}

	// Method
	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public int area() {
		return width * length;
	}

	public int perimeter() {
		return 2 * (width + length);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}