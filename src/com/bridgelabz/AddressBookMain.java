package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Contacts contact = new Contacts();
        contact.setFirstName("Adithya");
        System.out.println(contact.getFirstName());
        contact.setLastName("veldandi");
        System.out.println(contact.getLastName());
        contact.setAddress("12-10-264/2");
        System.out.println(contact.getAddress());
        contact.setCity("hyderabad");
        System.out.println(contact.getCity());
        contact.setState("Telangana");
        System.out.println(contact.getState());
        contact.setZip(50061);
        System.out.println(contact.getZip());
        contact.setPhoneNumber(1234567890);
        System.out.println(contact.getPhoneNumber());
        contact.setEmail("123@gmail.com");
        System.out.println(contact.getEmail());
    }
}
