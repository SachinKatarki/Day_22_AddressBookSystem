package com.bridgelabz.collections;

public class AddressBookMain {
	 public static void main(String[] args) {
	        System.out.println("Welcome into the Program of Address Book System !!");
	        ContactDetails newContact = new ContactDetails();
	        newContact.setFirstName("Sachin\n");
	        newContact.setLastName("Kumar\n");
	        newContact.setAddressCity("Bagalkot\n");
	        newContact.setState("Karanatka\n");
	        newContact.setEmail("Sachinkumar@gmail.com");
	        newContact.setZip(414501);
	        newContact.setPhoneNumber( 9604312330L);
	        System.out.println("The Contact is :\n" +newContact);

	    }

}
