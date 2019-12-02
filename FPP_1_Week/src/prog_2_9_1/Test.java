package prog_2_9_1;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,4)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(
					String.format("Thea are of this %s\n Number of sides = %s\n Perimeter = %s ", 
							cc.getClass().getSimpleName(),
							cc.getNumberOfSides(),cc.computePerimeter()));
			
		}
    
	}

}