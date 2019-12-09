package protect;

import src.Singelton;

public class SubProtect extends Protect {
	
	
	static {
		System.out.println("SS");
	}
	
	{
		System.out.println("SI");
	}
	
	public SubProtect(){
		name = "da";
		System.out.println("SubProtect:" +name);
		
		
	}

}
