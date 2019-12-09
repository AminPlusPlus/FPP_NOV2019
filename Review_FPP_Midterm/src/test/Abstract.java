package test;

public abstract class Abstract {
	

	
	static {
		System.out.println("Abstract Static");
	}
	
	{
		System.out.println("I'm Abstract");
	}
	
	
	
	
	
	public abstract void implementMe();
	
	public void print() {
		System.out.println("Hello Abstract");
	}
}
