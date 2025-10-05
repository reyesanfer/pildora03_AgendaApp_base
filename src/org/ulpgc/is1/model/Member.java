package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {

    private Contact contact;
    private LocalDateTime date;

    public Member(Contact contact, LocalDateTime date) {
        this.contact = contact;
        this.date = date;
    }

    public Contact getContact() {
        return contact;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
