package assignment_2_1;

public class Address {

	private String state;
	private String city;
	private String street;
	
	
	public Address (String state,String city,String street) {
		this.setState(state);
		this.setCity(city);
		this.setStreet(street);
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}
}
