package prog_2_9;

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

}
