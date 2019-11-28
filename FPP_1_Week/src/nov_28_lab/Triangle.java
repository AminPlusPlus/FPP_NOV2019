package nov_28_lab;

final class Triangle extends ClosedCurve{  

/** base and height variables are defined so that height <= base */
	private final double base;
	private final double height;
	
	public Triangle(double base, double height){
		if (height <= base) {
			this.base = base;
			this.height = height;
		} 
		else {
			this.base = height;
			this.height = base;
		}
	}

	@Override
	public double computerArea() {
		return (0.5 * base * height);
	}
	


}