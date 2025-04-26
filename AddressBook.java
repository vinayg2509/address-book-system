package addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	  private List<Contact> contactList;

	    public AddressBook() { 	
	        contactList = new ArrayList<>();
	    }

	    // Method to add a new contact
	    public void addContact(Contact contact) {
	        contactList.add(contact);
	    }
	    
	    // Method to display all contacts
	    public void displayContacts() {
	        for (Contact contact : contactList) {
	            System.out.println("---------------------------------");
	            contact.displayContact();
	            System.out.println("---------------------------------");
	        }
	    }

	    // Method to edit an existing contact
	    public void editContact(String name) {
	        for (Contact contact : contactList) {
	            if (contact.getFirstName().equalsIgnoreCase(name) || contact.getLastName().equalsIgnoreCase(name)) {
	                Scanner scanner = new Scanner(System.in);
	                System.out.println("Editing contact: " + name);

	                // Allow user to edit details
	                System.out.print("Enter new First Name (Leave blank to keep current): ");
	                String newFirstName = scanner.nextLine();
	                if (!newFirstName.isEmpty())
	                    contact.setFirstName(newFirstName);

	                System.out.print("Enter new Last Name (Leave blank to keep current): ");
	                String newLastName = scanner.nextLine();
	                if (!newLastName.isEmpty()) {
	                    contact.setLastName(newLastName);
	                }
	                ;

	                System.out.print("Enter new Address (Leave blank to keep current): ");
	                String newAddress = scanner.nextLine();
	                if (!newAddress.isEmpty())
	                    contact.setAddress(newAddress);

	                System.out.print("Enter new City (Leave blank to keep current): ");
	                String newCity = scanner.nextLine();
	                if (!newCity.isEmpty())
	                    contact.setCity(newCity);

	                System.out.print("Enter new State (Leave blank to keep current): ");
	                String newState = scanner.nextLine();
	                if (!newState.isEmpty())
	                    contact.setState(newState);

	                System.out.print("Enter new ZIP (Leave blank to keep current): ");
	                String newZip = scanner.nextLine();
	                if (!newZip.isEmpty())
	                    contact.setZip(newZip);

	                System.out.print("Enter new Phone Number (Leave blank to keep current): ");
	                String newPhoneNumber = scanner.nextLine();
	                if (!newPhoneNumber.isEmpty())
	                    contact.setPhoneNumber(newPhoneNumber);

	                System.out.print("Enter new Email (Leave blank to keep current): ");
	                String newEmail = scanner.nextLine();
	                if (!newEmail.isEmpty())
	                    contact.setEmail(newEmail);

	                System.out.println("\nContact updated successfully!");
	                contact.displayContact();
	                return; // Exit after editing
	            }
	            
	        }
	        
	        System.out.println("No contact found with the name: " + name);
	        

	    }
	

}
