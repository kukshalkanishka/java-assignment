package com.step.arrayList;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<Contact> contacts= new ArrayList<Contact>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }

    public void removeContact(String name) {
        int contactPosition =getPosition(name);
        if(contactPosition >= 0){
            this.contacts.remove(contactPosition);
        }
    }

    private int getPosition(String name) {
        for (int contactPosition = 0; contactPosition < this.contacts.size(); contactPosition++) {
            boolean isNameEqual = this.contacts.get(contactPosition).getName().equals(name);
            if(isNameEqual){
                return contactPosition;
            }
        }
        return -1;
    }

    public boolean doesContactExists(String name) {
        if(this.getPosition(name) >= 0){
            return true;
        }
        return false;
    }

    public void modifyContact(String name, Contact newContact) {
        int position = this.getPosition(name);
        if(this.doesContactExists(name)){
            this.contacts.set(position, newContact);
        }
    }
}
