package org.ulpgc.is1.model;

public abstract class Contact {

    private String telephone;
    private String email;

    public Contact(String email, String telephone) {
        this.email = email;
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Abstract method
    public abstract String getName();
}
