package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public final String name;
    private List<Contact> contactList;

    public Group(String name) {
        this.name = name;
        this.contactList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(int index) {
        contactList.remove(index);
    }

    public int contactCount() {
        return contactList.size();
    }

    public Contact getContact(int index) {
        return contactList.get(index);
    }
}
