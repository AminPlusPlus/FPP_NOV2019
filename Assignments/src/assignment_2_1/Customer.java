package assignment_2_1;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String firstName, String lastName, String socSecurityNum) {
		this.setFirstName(firstName);
		this.lastName = lastName;
		this.setSocSecurityNum(socSecurityNum);
	}

	
	
	//Getter setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}



	public Address getBillingAddress() {
		return billingAddress;
	}



	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}



	public Address getShippingAddress() {
		return shippingAddress;
	}

	
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
	public String toString() {
		return String.format("[%s,%s,ssn:%s]",this.firstName,this.lastName,this.socSecurityNum);
	}
	

}
