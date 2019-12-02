package prog_2_9_2;

public final class Circle extends ClosedCurve implements Polygon {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}

	
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
