package prog_12_1;

public class Main {

	public static void main(String[] args) {
		
		try {
			Rectangle obj = new Rectangle(-3.7, 0);
		} catch (IllegalClosedCurveException e ) {
			System.out.println(e.getMessage());
		}

	}

}
