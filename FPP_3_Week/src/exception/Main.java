package exception;


class Client {
	
	public void byTheName (String name) throws CheckedException  {
		
		if ("".equals(name))
			throw new CheckedException("Name not found");
		
	}
}

class CustomerService {
	
	public void searchUserById(int id) {
//		if (id<1)
//			throw new CheckedException("Id cant be zero or negative");
	}
}

public class Main {

	public static void main(String[] args)  {
		
		Client newClient = new Client();
		
		try {
			newClient.byTheName("");
		} catch (CheckedException e) {
			e.printStackTrace();
		}
		
	//	finally {
			CustomerService ser = new CustomerService();
			ser.searchUserById(0);
	//	}
		
			
		   

	}

}
