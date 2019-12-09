package referece_value;

import java.util.Arrays;


class Dimension {
	int widht;
	int height;
	
	Dimension(int widht, int height){
		this.widht = widht;
		this.height = height;
	}
}

public class Main {
	
	public static int x = 7;
	public int y = 2;
	

	public static void main(String[] args) {
		
		Main a = new Main();
		Main b = new Main();
		
		
		a.y = 5;
		b.y = 6;
		
		a.x = 2;
		b.x= 1;
		
		System.out.println(a.y); //5
		System.out.println(b.y); //6
		
		System.out.println(a.x); //1
		System.out.println(b.x); //1 
		
		System.out.println(Main.x); //1

	}
	
	public void swap(int d) {
		d += 1;
		System.out.println(d);
	}

}
