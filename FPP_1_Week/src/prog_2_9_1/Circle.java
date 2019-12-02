package prog_2_9_1;

public final class Circle extends ClosedCurve {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
