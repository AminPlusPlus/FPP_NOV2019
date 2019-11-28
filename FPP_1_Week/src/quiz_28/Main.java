package quiz_28;

public class Main {

	public static void main(String[] args) {
		int x = 9;
		int[] y =  {1,2,3};
		
		m(x,y);
		
		System.out.println(x); //9
		System.out.println(y[0]); //1
		
		Main s = new Main();
		s.update(x,y);
		
		System.out.println(x); // 9
		System.out.println(y[0]); //3323
		

	}
	
	public static void m (int x,int[] y) {
		x = 1000;
		y[0] = 5555;
		
	}
	
	public void update(int v, int[] g) {
		v = 1222;
		g[0] = 3323;
	}

}
