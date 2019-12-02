package prog_2_9_2;

public class Rectangle extends ClosedCurve implements Polygon {

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
	public double[] getArrayOfSides() {
		
		double[] sides = new double[] {width,width,height,height};
		
		return sides;
	}

}
