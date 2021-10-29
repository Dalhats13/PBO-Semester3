package Case2;

public class Main {

	public static void main(String[] args) {
	
		//Shape Test
		Shape sh1 = new Shape();
		Shape sh2 = new Shape("Blue", false);
		
		//Circle Test
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle("Purple",false,2.0);
		
		//Rectangle Test
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2.0,3.0);
		Rectangle r3 = new Rectangle("Green",false,2.0,3.0);
		
		//Square Test
		Square s1 = new Square();
		Square s2 = new Square(2.0);
		Square s3 = new Square("Orange",false, 2.0);
		
		System.out.println("Shape : ");
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println("===========================");
		System.out.println("Circle : ");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("===========================");
		System.out.println("Rectangle : ");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println("============================");
		System.out.println("Square : ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("============================");
 	
	}
}