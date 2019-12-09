package prog_2_9_ver2;

public final class Square extends ClosedCurve implements Polygon {
	final double side;
	public static final int NUM_SIDES = 4; 
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}
	public int getNumberOfSides() {
		return 4;
	}
	
	public double computePerimeter() {
		return NUM_SIDES * side;
	}	
}
