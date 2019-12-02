package prog_2_9_1;

public class Rectangle extends ClosedCurve {

	private final double height;
	private final double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	double computeArea() {
		return height * width;
	}

	@Override
	public int getNumberOfSides() {
		return 4 ;
	}

	@Override
	public double computePerimeter() {
		return 2*(height+width);
	}

}
