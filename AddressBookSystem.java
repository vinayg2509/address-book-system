package addressbooksystem;

class AddressBookSystem {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");

		Contact contact = new Contact(
				"Vinay", "G", "1836 Hosmane Main Road", "Bhadravathi", 
				"Karnataka", "577301", "8123804221", "gvinay240@gmail.com");
//		Display Contact Details
		System.out.println(contact);
		
		
		
	}
}


