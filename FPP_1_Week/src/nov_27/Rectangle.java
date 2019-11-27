package nov_27;

public class Rectangle {

	private double height;
	private double width;
	
	public Rectangle(double height,double widht) {
		this.height = height;
		this.width = widht;
	}
	
	
	public double getArea() {
		return Math.PI * width * height;
	}
}
