package com.bridgelabz.addressBook;

public class ContactsUC1 {
	private String firstName, lastName, city, state, email;
	private int zip;
	private String phoneNumber;
	//creating constructor
	public ContactsUC1(String firstName, String lastName, String city, String state, int zip, String email,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	//Display method 
	public void display()
	{
		System.out.println("First Name : "+firstName+", \nLast Name : "+lastName+", \nCity : "+city+",\nState : "+state+", \nZip code : "+zip+", \nEmail-ID : "+email+", \nPhone Number : "+phoneNumber);
	}

}
class AddressBook
{
	//create object to call constructor
	public static void main(String[] args)
	{
		ContactsUC1 addressBook=new ContactsUC1("Dimple","Avhad","Pune","Maharashtra",411038,"pooja.sd3@gmail.com","8144414383");
		addressBook.display();

	}

}