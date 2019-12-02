package prog_2_9_2;

public interface Polygon {
	public double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		
		double sumArray = 0.0;
		for (double i : arr)
			sumArray+=i;
		
		return sumArray ;
	}
	default double computePerimeter() {
		return sum(getArrayOfSides()) ;

	}
}
