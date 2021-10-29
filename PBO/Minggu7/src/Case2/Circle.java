package Case2;

public class Circle extends Shape{
	private double radius;
	
	public Circle(){
		super();
		this.radius = 1.0;
	}
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	public Circle(String color, boolean fill, double radius) {
		super(color, fill);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return Math.PI*Math.PI*radius;
	}
	
	public String toString() {
		return "A Circle with radius=" + getRadius() + ", which is subclass of \n" + super.toString() +"\n";
	}
}