package org.ulpgc.is1.model;

public class Company extends Contact {

    private String name;
    private String description;

    public Company(String email, String telephone, String name, String description) {
        super(email, telephone);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
