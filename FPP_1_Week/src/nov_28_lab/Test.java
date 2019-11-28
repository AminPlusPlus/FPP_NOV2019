package nov_28_lab;

class Test {
	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(5, 7), new Square(3),
				new Circle(3) };
		// compute areas
		
		for (ClosedCurve e : objects) {
			System.out.println(e.computerArea());
		}
		
	}
}
