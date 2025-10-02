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

    public addContact(Contact contact) {
        contacts.add(contact);
    }

    public removeContact(Contact contact) {
        contacts.remove(contact);
    }

}