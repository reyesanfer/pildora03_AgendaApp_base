package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private final String name;
    private List<Contact> contacts;

    public Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(int index) {
        contacts.remove(index);
    }

    public int contactCount() {
        return contacts.size();
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

}