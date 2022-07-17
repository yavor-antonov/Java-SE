package mobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("999999999");
    

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;


        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){
        System.out.println("Enter the contact name to add: ");
        String name = scanner.nextLine();
        System.out.println("Enter the contact number to add: ");
        String number = scanner.nextLine();
        Contacts addContact = Contacts.createContact(name,number);
        if (mobilePhone.addContact(addContact)){
            System.out.println("New contact added: " + name + ", phone = " + number);
        }else{
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    public static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContactsList(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record");
        }
//        System.out.println("Enter current contact name & number: ");
//        Contacts oldContact = Contacts.createContact(scanner.nextLine(),scanner.nextLine());
//        System.out.println("Please enter the new contact name & phone number: ");
//        Contacts newContact = Contacts.createContact(scanner.nextLine(),scanner.nextLine());
//        mobilePhone.updateContactsList(oldContact, newContact);

    }

    public static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting");
        }
//        System.out.println("Enter contact name & number: ");
//        Contacts contact = Contacts.createContact(scanner.nextLine(),scanner.nextLine());
//        mobilePhone.removeContact(contact);
    }

    public static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

//        System.out.println("Enter the contact name to search for: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter the contact number to search for: ");
//        String number = scanner.nextLine();
//        Contacts contact = Contacts.createContact(name,number);
//        System.out.println(mobilePhone.queryContact(contact));
    }

    //   public String queryContact(Contacts contact) {
    //      if (findContact(contact) >= 0) {
    //         return contact.getName();
    //      }
    //      return null;
    //   }
}
