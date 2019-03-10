package com.step.arrayList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();
    private static Mobile mobile = new Mobile(contacts);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            int userValue = 0;
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
            }
            switch (userValue) {

                case 0: {
                    printToolOptions();
                    break;
                }
                case 1: {
                    mobile.displayContacts();
                    break;
                }
                case 2: {
                    addContact();
                    break;
                }
                case 3: {
                    modifyContact();
                    break;
                }
                case 4: {
                    deleteContact();
                    break;
                }

                case 5: {
                    doesContactExists();
                    break;
                }

                case 6: {
                    quit = true;
                }

                default:{
                    printToolOptions();
                }
            }

        }
    }

    private static void printToolOptions() {
        System.out.println(
                "0: How to use" + "\n" +
                "1: Display contacts" +"\n"+
                "2: Add contact" + "\n" +
                "3: Modify contact" + "\n" +
                "4: Delete contact" + "\n" +
                "5: Find Contact" + "\n" +
                "6: Quit");
    }

    private static void doesContactExists() {
        System.out.print("Enter the contact name that you want to find: ");
        String name = scanner.next();
        mobile.doesContactExists(name);
    }

    private static void deleteContact() {
        System.out.print("Enter the contact name that you want to remove: ");
        String name = scanner.next();
        mobile.deleteContact(name);
    }

    public static void addContact() {
        System.out.print("Enter new contact name: " );
        String name = scanner.next();
        System.out.print("Enter contact's phone Number: ");
        Long number = scanner.nextLong();
        mobile.addContact(name, number);
    }

    public static void modifyContact() {
        System.out.print("Enter the contact name to modify: ");
        String nameToBeModified = scanner.next();
        scanner.nextLine();
        System.out.print("Enter new contact name: " );
        String name = scanner.next();
        Long number = scanner.nextLong();
        mobile.modifyContact(nameToBeModified, name, number);
    }
}
