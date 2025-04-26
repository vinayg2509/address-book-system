package addressbooksystem;

import java.util.Scanner;

class AddressBookSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome to Address Book program");
		System.out.print("Enter First Name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter Address: ");
		String address = scanner.nextLine();

		System.out.print("Enter City: ");
		String city = scanner.nextLine();

		System.out.print("Enter State: ");
		String state = scanner.nextLine();

		System.out.print("Enter ZIP: ");
		String zip = scanner.nextLine();

		System.out.print("Enter Phone Number: ");
		String phoneNumber = scanner.nextLine();

		System.out.print("Enter Email: ");
		String email = scanner.nextLine();

		// Create ContactPerson object
		Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);


		// Add to AddressBook
		addressBook.addContact(newContact);
		System.out.println();
		// printing that contacts has been successfully added
		System.out.println("\nContact added successfully! Here's your Address Book:");
		addressBook.displayContacts();

		// Ask if user wants to edit any contact
		System.out.print("\nEnter the first or last name of the contact you want to edit: ");
		String nameToEdit = scanner.nextLine();

		// Edit contact based on name
		addressBook.editContact(nameToEdit);

		scanner.close();
	}

}



