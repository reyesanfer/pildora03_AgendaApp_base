package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {

    public final String name;
    private List<Member> memberList;

    public Group(String name) {
        this.name = name;
        this.memberList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        memberList.add(new Member(contact));
    }

    public void removeContact(int index) {
        memberList.remove(index);
    }

    public int contactCount() {
        return memberList.size();
    }

    public Member getMember(int index) {
        return memberList.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}