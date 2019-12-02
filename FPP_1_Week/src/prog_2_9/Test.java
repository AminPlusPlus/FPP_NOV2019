package prog_2_9;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3),
								 new Rectangle(3,7)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(
					String.format("Thea are of this %s is %s", 
							cc.getClass().getSimpleName(),
							cc.computeArea()));
			
		}
    
	}

}