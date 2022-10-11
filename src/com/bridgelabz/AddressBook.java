package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    Map<String, Contact> contactMap = new HashMap<>();
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    public void addContact() {
        // Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        contact.askDetailsToUser();
        contacts.add(contact);
    }
    public void print() {
        for (Contact contact : contacts) {
            contact.viewData();
        }
    }
    public void editContact(String contactName) {
        for (Contact contact : contacts) {
            if (contact.firstName.equals(contactName)) {
                contact.viewData();
                contact.askDetailsToUser();
            }
        }
    }
    public void deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.firstName.equals(name)) {
                contacts.remove(contact);
            }
        }
    }
}