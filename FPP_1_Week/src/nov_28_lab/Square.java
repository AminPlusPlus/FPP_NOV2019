package nov_28_lab;

public final class Square extends ClosedCurve {
	
	
	private final double side;
	
	public Square(double side){
		
		this.side = side;
		
		
	}

	@Override
	public double computerArea() {

		 return side * side;
	}


}
