package com.step.arrayList;

public class Mobile {
    private Contacts contacts;
    public Mobile(Contacts contacts) {
        this.contacts = contacts;
    }

    public void addContact(String name, Long number){
        Contact contact = new Contact(name, number);
        this.contacts.addContact(contact);
    }

    public void deleteContact(String name){
        this.contacts.removeContact(name);
    }

    public boolean doesContactExists(String name){
        System.out.println(this.contacts.doesContactExists(name));
        return this.contacts.doesContactExists(name);
    }

    public void modifyContact(String existingName, String newName, long newNumber){
        Contact newContact = new Contact(newName,newNumber);
        this.contacts.modifyContact(existingName, newContact);
    }

    public void displayContacts() {
        if(this.contacts.getContacts().size() > 0) {
            for (Contact contact : this.contacts.getContacts()) {
                System.out.println("Name : " + contact.getName() + ", Phone number : " + contact.getPhoneNumber());
            }
        }else {
            System.out.println("You have no contacts to display");
        }

    }
}
