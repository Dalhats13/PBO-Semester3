package Case2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(){
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	

	public Rectangle(double width, double lenght){
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(String color, boolean fill, double width, double lenght){
		super(color, fill);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return width+width+length+length;
	}
	
	public String toString() {
		return "A Rectangle with width=" + getWidth() + " and length=" + getLength() + ", which is subclass of \n" + super.toString()+"\n";
	}
}
