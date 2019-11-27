package assignment_2_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Aminjoni", "Abdullozoda", "332-221-4444");
		Customer customer2 = new Customer("Craig", "Shaw", "32-211-4444");
		
		customer1.setBillingAddress(new Address("iowa","Fairfield","1000N"));
		customer1.setShippingAddress(new Address("iowa","Fairfield","1000N"));
		
		customer2.setBillingAddress(new Address("Illinois","Chicago","100N"));
		customer2.setShippingAddress(new Address("Illinois","Chicago","1000N"));
		
		
		ArrayList<Customer> listCustomers = new ArrayList<Customer>();
		listCustomers.add(customer1);
		listCustomers.add(customer2);
		
		for (Customer c : listCustomers) {
			if (c.getBillingAddress().getCity().equals("Chicago"))
				System.out.println(customer1.toString());
		}
		
		

	}

}
