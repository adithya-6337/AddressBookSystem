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

    Contacts display() {
        return contact;
    }
}
