package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contact> contactList;
    private List<Group> groupList;

    public Agenda() {
        this.contactList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName, String phone, String email, String street, int number, int floor, String city) {
        Person newPerson = new Person(firstName, lastName, phone, email, street, number, floor, city);
        if (!contactList.contains(newPerson)) {
            contactList.add(newPerson);
        }
    }

    public void addCompany(String name, String description, String telephone, String email, String street, int number, int floor, String city) {
        Company newCompany = new Company(name, description, telephone, email, street, number, floor, city);
        if (!contactList.contains(newCompany)) {
            contactList.add(newCompany);
        }
    }

    public void addGroup(String name) {
        Group newGroup = new Group(name);
        if (!groupList.contains(newGroup)) {
            groupList.add(newGroup);
        }
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public int contactCount() {
        return contactList.size();
    }

}