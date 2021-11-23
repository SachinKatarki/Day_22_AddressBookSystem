package com.bridgelabz.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAddressBook {
	Scanner sc = new Scanner(System.in);
	 ContactDetails person = new ContactDetails();
     
	 ArrayList<ContactDetails> contactList = new ArrayList<>();


    public void addContact() {
        ContactDetails person = new ContactDetails();
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your addressCity: ");
        String addressCity = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code : ");
        Long zip = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = sc.nextLine();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddressCity(addressCity);
        person.setState(state);
        person.setZip(zip.intValue());
        person.setPhoneNumber(phoneNumber.intValue());
        person.setEmail(email);
        System.out.println("The Contact Details of " + firstName + " "+lastName +"\n" + person);

       }

	  public void editContact() {
		  ContactDetails person = new ContactDetails();
	        System.out.println("Enter the First Name of person");
	        String editName = sc.nextLine();
	        if (editName.equalsIgnoreCase(person.getFirstName()))
	            addContact();
	        else
	            System.out.println("The Entered First Name Is Not Match");
	        editContact();
	        
	            }

	public void deleteContact() {
		 System.out.println("Enter firstName of the person");
	        String editName = sc.nextLine();
	        if (editName.equals(person.getFirstName())) {
	            System.out.println("Deleted " + person.getFirstName() + " details");
	            person = null;
		
		
	       }
	     }

	public void showContact() {
		 System.out.println("Total Number of Contacts : " + contactList.size());
	        System.out.println("---------------------------------------------------");
	        if (contactList.isEmpty()) {
	            System.out.println("There are no contacts in the contact list");
	        } else {
	            System.out.println(contactList);
	            System.out.println("\n---------------------------------------------");
		}
	  }

	public void getMenu() {
		  boolean exit = false;
	        do {
	            System.out.println("Choose the valid option \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
	            int option = sc.nextInt();
	            sc.nextLine();
	            switch (option) {
	                case 1:
	                    addContact();
	                    System.out.println(person);
	                    System.out.println("Contact added successfully....");
	                    break;
	                case 2:
	                    editContact();
	                    System.out.println(person);
	                    System.out.println("Contact details updated successfully");
	                    break;
	                case 3:
	                    deleteContact();
	                    break;
	                case 4:
	                    showContact();
	                    break;
	                case 5:
	                    exit = true;
	                    break;
	                default:
	                    System.out.print("Enter the valid option!");
	                    break;
	            }
	        } while (!exit);
	
		}
   }
  
	
		
	
    
