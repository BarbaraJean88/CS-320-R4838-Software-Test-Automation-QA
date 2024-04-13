package com.contactservices;

//Import Statements
import java.util.HashMap;
import java.util.Map;

public class ContactService {
private final Map<String, Contact> contacts; // Map to stroe contacts

public ContactService() {
   contacts = new HashMap<>(); // Initialize the map 
}

// Add a contact to the mmap 
public void addContact(Contact contact) {
   contacts.put(contact.getContactId(), contact);
}

//Delete a contact fromm the map 
public void deleteContact(String contactId) {
   contacts.remove(contactId);
}

// Update an existing contact in the map 
public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
   Contact contact = contacts.get(contactId); // Get the contact from the map 
   if (contact != null) { // Check if the contact exists 
  	 // Update the contact details
       contact.setFirstName(firstName);
       contact.setLastName(lastName);
       contact.setPhone(phone);
       contact.setAddress(address);
   }
}

// Get a contact from  from the map by contact ID
public Contact getContact(String contactId) {
   return contacts.get(contactId);
}
}