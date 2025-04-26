package addressbooksystem;

import java.util.ArrayList;
import java.util.List;

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

	

}
