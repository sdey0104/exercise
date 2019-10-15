package Mobile;

import javax.jws.Oneway;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0633714308");

    public static void main(String[] arg) {

        boolean quit = false;
        startPhone();
        printInstructions();
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    System.out.println("\nShutting down....");
                    quit = true;
                    break;

                case 6:
                    queryContact();
                    break;
            }


        }

    }

    public static void startPhone() {
        System.out.println("Starting phone......");
    }

    public static void printContactList() {
        mobilePhone.printContact();
    }

    public static void addContact() {
        System.out.println("\nEnter name : ");
        String name = scanner.next();
        System.out.println("\nEnter number :");
        String number = scanner.next();
        Contacts newContact = Contacts.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("new Contact added =" + name + "phone :- " + number);

        } else
            System.out.println("cannot add the contact" + name + "already on file");

    }

    public static void modifyContacts() {
        System.out.println("Enter Existing contact name");
        String name = scanner.next();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("not found");
            return;
        }
        System.out.println("Enter new Contact name: ");
        String newName = scanner.next();
        System.out.println("Enter new number");
        String newNumber = scanner.next();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Success");
        } else System.out.println("\nerror");


    }


    public static void removeContacts() {
        System.out.println("Enter Existing contact name");
        String name = scanner.next();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("not found");
            return;
        }

        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Success");
        }
    }


    public static void queryContact() {


        System.out.println("Enter Existing contact name");
        String name = scanner.next();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("not found");
            return;
        }

        System.out.println("Name " + existingContact.getName() + "phone" + existingContact.getNumber());


    }


    public static void printInstructions() {
        System.out.println("\nPress you choice ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify a modify a contact to  the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
}
