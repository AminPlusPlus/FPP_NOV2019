package prog_2_9_2;

public final class Square extends ClosedCurve implements Polygon  {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}

	
	@Override
	public double[] getArrayOfSides() {
		double[] sides = new double[] {side,side,side,side};
		return sides;
	}
}
