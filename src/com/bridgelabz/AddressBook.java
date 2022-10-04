package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contacts contact = new Contacts();
    Scanner scan = new Scanner(System.in);

    void addContact() {
        System.out.println("Enter firstName :");
        contact.setFirstName(scan.next());
        System.out.println("Enter lastName :");
        contact.setLastName(scan.next());
        System.out.println("Enter address :");
        contact.setAddress(scan.next());
        System.out.println("Enter city :");
        contact.setCity(scan.next());
        System.out.println("Enter state:");
        contact.setState(scan.next());
        System.out.println("Enter email :");
        contact.setEmail(scan.next());
        System.out.println("Enter zip :");
        contact.setZip(scan.nextInt());
        System.out.println("Enter phoneNumber :");
        contact.setPhoneNumber(scan.nextLong());
    }
    void editContact() {
        System.out.println("Enter first name of person to edit");
        String firstName = scan.next();
        if (firstName.equals(contact.getFirstName())) {
            System.out.println("Enter the details of person");
            System.out.println("Enter first name");
            contact.setFirstName(scan.next());

            System.out.println("Enter lastName");
            contact.setLastName(scan.next());

            System.out.println("Enter city");
            contact.setCity(scan.next());

            System.out.println("Enter state");
            contact.setState(scan.next());

            System.out.println("Enter email");
            contact.setEmail(scan.next());

            System.out.println("Enter zip");
            contact.setZip(scan.nextInt());

            System.out.println("Enter phoneNumber");
            contact.setPhoneNumber(scan.nextLong());
        } else {
            System.out.println("person not found");
        }
    }

    Contacts display() {
        return contact;
    }
}
