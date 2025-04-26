package addressbooksystem;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {
	private static Map<String, AddressBook> addressBookMap = new HashMap<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Address Book program");
		boolean continueProgram = true;
		while (continueProgram) {
			System.out.println("Enter Address Book Name: ");
			String bookName = scanner.nextLine();
			AddressBook addressBook = new AddressBook();
			boolean addMoreContacts = true;
			while (addMoreContacts) {
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
				System.out.println();
				// Create ContactPerson object
				Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

				// Add to AddressBook
				addressBook.addContact(newContact);

				System.out.print("\nDo you want to add another contact? (Y/N): ");
				String choice = scanner.nextLine();
				if (!choice.equalsIgnoreCase("y")) {
					addMoreContacts = false;
				}
			}
			addressBookMap.put(bookName, addressBook);
			System.out.println("Do you want to add another Address Book? (y/n): ");
			String continueChoice = scanner.nextLine();
			if (!continueChoice.equalsIgnoreCase("y")) {
				continueProgram = false;
			}
		}
		System.out.println();
		// printing that contacts has been successfully added
		System.out.println("\n Here's your Address Books:");
		for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
			System.out.println("\nAddress Book Name: " + entry.getKey());
			entry.getValue().displayContacts();
		}

		System.out.println("\nEnter Address Book NAme to Edit/Delete Contact: ");
		String bookNameToModify = scanner.nextLine();
		AddressBook addressBook = addressBookMap.get(bookNameToModify);
		if (addressBook != null) {
			// Ask if user wants to edit any contact
			System.out.print("\nEnter the first or last name of the contact you want to edit: ");
			String nameToEdit = scanner.nextLine();
			// Edit contact based on name
			addressBook.editContact(nameToEdit);

			// Delete a contact based on a name
			System.out.println("Do you want to delete the contact? Y/N");
			String deleteChoice = scanner.nextLine();

			if (deleteChoice.equalsIgnoreCase("y")) {
				System.out.println("Enter the first or last name of the contact that you want to delete");
				String nameToDelete = scanner.nextLine();
				addressBook.deleteContact(nameToDelete);

				System.out.println("\n Updated Address Book: ");
				addressBook.displayContacts();
			}

		}
		scanner.close();
	}
}