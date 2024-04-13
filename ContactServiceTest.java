package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import statements
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.contactservices.Contact;
import com.contactservices.ContactService;

public class ContactServiceTest {

 @Test
 public void testAddContact() {
     // Test adding a contact
     ContactService contactService = new ContactService();
     Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
     contactService.addContact(contact);
     assertEquals(contact, contactService.getContact("1234567890"));
 }


 
 @Test
 public void testDeleteContact() {
     // Test deleting a contact
     ContactService contactService = new ContactService();
     Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
     contactService.addContact(contact);
     contactService.deleteContact("1234567890");
     assertNull(contactService.getContact("1234567890"));
 }

 @Test
 public void testUpdateContact() {
     // Test updating a contact
     ContactService contactService = new ContactService();
     Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
     contactService.addContact(contact);
     contactService.updateContact("1234567890", "Jane", "Smith", "0987654321", "456 Elm St");
     assertEquals("Jane", contactService.getContact("1234567890").getFirstName());
     assertEquals("Smith", contactService.getContact("1234567890").getLastName());
     assertEquals("0987654321", contactService.getContact("1234567890").getPhone());
     assertEquals("456 Elm St", contactService.getContact("1234567890").getAddress());
     
     
     // Run the test class programmatically and print results
     Result result = JUnitCore.runClasses(ContactServiceTest.class);
		
     for (Failure failure : result.getFailures()) {
        System.out.println(failure.toString());
     }
		
     System.out.println(result.wasSuccessful());
 }
}