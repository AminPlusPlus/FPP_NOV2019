package abstract_interface;

public abstract class Car {
	  public static final int wheels = 4;
	 
	  String turn( String direction ){
	    return "Turning" + direction ; 
	  }
	  public abstract void startWithSound( String sound );
	  public abstract void shutdown( );
}
