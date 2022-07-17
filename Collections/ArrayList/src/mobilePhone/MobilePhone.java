package mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
   private String myNumber;
   private ArrayList<Contacts> contactsList;

   public MobilePhone(String myNumber) {
      this.myNumber = myNumber;
      this.contactsList = new ArrayList<Contacts>();
   }

   // Private
   private int findContact(Contacts searchContact) {
      return this.contactsList.indexOf(searchContact);
   }

   private int findContact(String contactName) {
      for (int i = 0; i < this.contactsList.size(); i++) {
         Contacts contacts = this.contactsList.get(i);
         if (contacts.getName().equals(contactName)) {
            return i;
         }
      }
      return -1;
   }

   public String queryContact(Contacts contact) {
      if (findContact(contact) >= 0) {
         return contact.getName();
      }
      return null;
   }
   public Contacts queryContact(String name){
      int position = findContact(name);
      if (position >= 0){
         return this.contactsList.get(position);
      }
      return null;
   }

   public boolean addContact(Contacts contact) {
      if (findContact(contact.getName()) >= 0) {
         System.out.println("Contact is already on file");
         return false;
      }
      contactsList.add(contact);
      return true;
   }

   private void removeContact(int position) {
      contactsList.remove(position);
   }

   //Public
   public void printContactList() {
      System.out.println("You have " + contactsList.size() + " contacts in your mobile phone");
      for (int i = 0; i < contactsList.size(); i++) {
         System.out.println((i + 1) + ". Name: " + this.contactsList.get(i).getName() + " / Phone number: " + this.contactsList.get(i).getPhoneNumber());
      }
   }

   public boolean updateContactsList(Contacts currentContact, Contacts newContact) {
      int position = findContact(currentContact);
      if (position < 0) {
         System.out.println(currentContact.getName() + ", was not found");
         return false;
      }
      this.contactsList.set(position, newContact);
      System.out.println(currentContact.getName() + ", was replaced with " + newContact.getName());
      return true;
   }

   public boolean removeContact(Contacts contact) {
      int position = findContact(contact);
      if (position < 0) {
         System.out.println(contact.getName() + ", was not found");
         return false;
      }
      contactsList.remove(contact);
      System.out.println(contact.getName() + " was removed");
      return true;
   }




}
