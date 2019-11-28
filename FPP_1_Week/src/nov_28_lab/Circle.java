package nov_28_lab;

public final class Circle extends ClosedCurve  {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}

	
	@Override
	public double computerArea() {
		return (Math.PI * radius * radius);
	}
}
