package nov_27;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(10.0);
		Rectangle r = new Rectangle(22.0,20.0);
		
		System.out.println(String.format("Circle Area :%.2f  \nRectangle Area : %.2f",c.getArea(),r.getArea()));
		

	}

}
