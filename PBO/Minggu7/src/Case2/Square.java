package Case2;

public class Square extends Rectangle{
	public Square(){
		super();
	}
	
	public Square(double side){
		super(side, side);
	}
	
	public Square(String color, boolean fill,double side){
		super(color,fill,side,side);
	}
	
	public double getSide() {
		return getLength();
	}
	
	public void setSide(double side) {
		setLength(side);
		setWidth(side);
	}
	
	public String toString() {
		return "A Square with side=" + getSide() + 	", which is a subclass of\n" + super.toString()+"\n";
	}
}