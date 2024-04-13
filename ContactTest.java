package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.contactservices.Contact;

public class ContactTest {

  @Test
  public void testContactInitialization() {
	  // Test Contact initialization 
      Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
      assertEquals("1234567890", contact.getContactId());
      assertEquals("John", contact.getFirstName());
      assertEquals("Doe", contact.getLastName());
      assertEquals("1234567890", contact.getPhone());
      assertEquals("123 Main St", contact.getAddress());
  }

  // Test Methods for setters
  
  @Test
  public void testSetters() {
      Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
      contact.setFirstName("Jane");
      assertEquals("Jane", contact.getFirstName());
      contact.setLastName("Smith");
      assertEquals("Smith", contact.getLastName());
      contact.setPhone("0987654321");
      assertEquals("0987654321", contact.getPhone());
      contact.setAddress("456 Elm St");
      assertEquals("456 Elm St", contact.getAddress());
     
       		// Run Test class programmatically and print results
            Result result = JUnitCore.runClasses(ContactTest.class);
      		
            for (Failure failure : result.getFailures()) {
               System.out.println(failure.toString());
            }
      		
            System.out.println(result.wasSuccessful());
         }
      
  }


