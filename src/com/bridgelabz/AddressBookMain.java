package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("         Welcome to Address Book Program");
        System.out.println("----------------------------------------------------");
        AddressBook addressBook1 = new AddressBook();
        String nameOfAddressBook = "default";
        Map<String, AddressBook> addressBookMap = new HashMap<String, AddressBook>();
        addressBookMap.put(nameOfAddressBook, addressBook1);
        while (true) {
            System.out.println("---Menu(" + nameOfAddressBook + ")---------------");
            System.out.println("| 1. print AddressBook                      |");
            System.out.println("| 2. Add Address Book                       |");
            System.out.println("| 3. Add Contact                            |");
            System.out.println("| 4. Edit Contact                           |");
            System.out.println("| 5. Delete Contact                         |");
            System.out.println("| 6. Select Address Book                    |");
            System.out.println("--------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBook1.print();
                    break;
                case 2:
                    AddressBook addressBook = new AddressBook();
                    String addressBookName = scanner.next();
                    addressBookMap.put(addressBookName, addressBook);
                    break;
                case 3:
                    addressBook1.addContact();
                    break;
                case 4:
                    System.out.println("Enter first-name to edit contact: ");
                    String name = scanner.next();
                    addressBook1.editContact(name);
                    break;
                case 5:
                    System.out.println("Enter first-name to delete contact: ");
                    String nameToDelete = scanner.next();
                    addressBook1.deleteContact(nameToDelete);
                    break;
                case 6:
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        System.out.println(entry.getKey());
                    }
                    nameOfAddressBook = scanner.next();
                    addressBook1 = addressBookMap.get(nameOfAddressBook);
                    break;
            }
        }
    }
}