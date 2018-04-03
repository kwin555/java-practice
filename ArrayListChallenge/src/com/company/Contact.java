package com.company;

public class Contact {

    private String name;
    private String phomeNumber;

    public Contact(String name, String phomeNumber) {
        this.name = name;
        this.phomeNumber = phomeNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhomeNumber() {
        return phomeNumber;
    }

    public static Contact createContact(String name, String phomeNumber) {
        return new Contact(name, phomeNumber);
    }
}
