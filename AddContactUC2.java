package com.bridgelabz.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContactUC2 {

	Scanner scanner = new Scanner(System.in);
	ArrayList<ContactUC2> newContact = new ArrayList<>();

	public static void main(String[] args) {

		AddContactUC2 addressBook = new AddContactUC2();
		addressBook.Menu();
	}

	public void Menu() {

		boolean flag = false;
		int choice = 0;
		printDetails();

		while (!flag) {
			System.out.println("Enter Your Choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				printDetails();
				break;
			case 2:
				addContacts();
				break;
			case 3:
				System.out.println(newContact);
				break;
			case 4:
				flag = true;
				System.out.println("EXIT ADDRESS BOOK");
				break;
			}
		}
	}

	public void printDetails() {
		System.out.println("Welcome to Address Book.");
		System.out.println("\t  1. Print Menu Options for Address Book : ");
		System.out.println("\t  2. Add the contact details : ");
		System.out.println("\t  3. Print Newly Added Contact  : ");
		System.out.println("\t  4. Exit the Address Book : ");
	}

	public void addContacts() {

		System.out.println("Enter First Name : ");
		String firstName = scanner.nextLine();
		System.out.println("Enter Last Name : ");
		String lastName = scanner.nextLine();
		System.out.println("Enter your City : ");
		String city = scanner.nextLine();
		System.out.println("Enter your State : ");
		String state = scanner.nextLine();
		System.out.println("Enter your Email-ID : ");
		String email = scanner.nextLine();
		System.out.println("Enter your Zip code : ");
		int zip = scanner.nextInt();
		System.out.println("Enter your Mobile Number : ");
		long phoneNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println();

		newContact.add(new ContactUC2(firstName, lastName, city, state, email, zip, phoneNumber));
	}
}
