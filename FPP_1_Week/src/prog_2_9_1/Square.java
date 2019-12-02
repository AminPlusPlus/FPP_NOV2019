package prog_2_9_1;

public final class Square extends ClosedCurve  {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberOfSides() {
		return 4;
	}
	@Override
	public double computePerimeter() {
		return 4*side;
	}
}
