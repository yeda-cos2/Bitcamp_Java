public class Rectangle{
	//Field
	private String color;
	private int length;
	private int width;
	
	//Constructor
	public Rectangle(){
		length=0;
		width=0;
		length=0;
	}

	//Method
	public void setLength(int i){
		length=i;
	}

	public int getLength(){
		return length;
	}

	public void setWidth(int j){
		width=j;
	}
	public int getWidth(){
		return width;
	}

	public int area(){
	return width*length;
}

public int perimeter( ){
	return 2*(width+length);
}

public void setColor(String c1){
	color=c1;
}

public String getColor(){
	return color;
}
}