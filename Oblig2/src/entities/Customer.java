package entities;

public class Customer {

	private String surname;
	private String lastName;
	private Address address;
	private String phoneNumber;

	public Customer(String surname, String lastName, Address address, String phoneNumber) {
		this.surname = surname;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
}
