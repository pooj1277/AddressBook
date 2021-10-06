package com.bridgelabz.addressBook;

public class ContactUC2 {
	private String firstName, lastName, city, state, email;
	private int zip;
	private long phoneNumber;

	public ContactUC2(String firstName, String lastName, String city, String state, String email, int zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Address Book Contact [First Name = " + firstName + ", Last Name = " + lastName + ", City = " + city + ", State = " + state
				+ ", Email Id = " + email + ", Zip = " + zip + ", Phone Number = " + phoneNumber + "]";
	}
}
