package protect;

public class Protect {
	
	

	public static int cointer  = 0;
	protected String name;
	
	static {
		System.out.println("PS");
	}
	
	{
		System.out.println("PI");
	}
	
	public Protect(){
		this.name = "I'm Protected";
		System.out.println("Protect: " + name);
		
		Protect.cointer++;
		
	
	}
	
	
}
