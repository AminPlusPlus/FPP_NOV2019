package prog_12_1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException {
		
		validateSides(width,length);
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	
	private void validateSides(double w, double l) throws IllegalClosedCurveException {
		//implement
		if (w<0 || l <0) 
			LOG.warning("Non - Positive side");
			throw new IllegalClosedCurveException(ClosedCurve.LOG.toString());
	}
	


}

