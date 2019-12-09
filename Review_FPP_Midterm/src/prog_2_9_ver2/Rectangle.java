package prog_2_9_ver2;

public final class Rectangle extends ClosedCurve implements Polygon {

	private final double width;
	private final double length;
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	
	public int getNumberOfSides() {
		return 4;
	}
	
	public double computePerimeter() {
		return 2*width + 2* length;
	}

}
