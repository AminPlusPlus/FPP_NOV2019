package prog_12_1;

public class IllegalClosedCurveException extends Exception {

	public IllegalClosedCurveException(){
		super();
	}
	
	public IllegalClosedCurveException (String message) {
		super(message);
	}
	
	public IllegalClosedCurveException (Throwable cause) {
		super(cause);
	}
	
}
