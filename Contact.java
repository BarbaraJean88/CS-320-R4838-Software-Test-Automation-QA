package com.contactservices;


public class Contact {
	// Fields 
 private final String contactId; // Unique identifier for the contact
 private String firstName; // First name of the contact
 private String lastName; // Last name of the contact
 private String phone; // Phone number name of the contact
 private String address; // Address of the contact

 // Constructor 
 public Contact(String contactId, String firstName, String lastName, String phone, String address) {
     this.contactId = contactId; // Initialize the contact ID
     this.firstName = firstName; // Initialize the first name
     this.lastName = lastName;// Initialize the last name
     this.phone = phone; //Initialize the phone number
     this.address = address; // Initialize the adress
 }

 // Getters and setters

 // Getter for contact ID
 public String getContactId() {
     return contactId;
 }

 // Getter and setter for the first name
 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }

//Getter and setter for the last name
 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }
 
//Getter and setter for the phone number 
 public String getPhone() {
     return phone;
 }

 public void setPhone(String phone) {
     this.phone = phone;
 }


//Getter and setter for address 
 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }
}

