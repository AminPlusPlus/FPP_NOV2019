package interface_8;


public interface Interface {

	public static int getUsers = 0;
	
	public static void calculateUser () {
		System.out.println(getUsers);
	}
	
	default void log() {
		System.out.println("Hello from default interface");
	}

}
