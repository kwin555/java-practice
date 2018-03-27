package com.company;

public class BankAccount {
    private int accountNumber;
    private double balanace;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;



    public BankAccount() {
        this(56789, 0, "default name", "default@example.com", 713434);
        System.out.println("Empty Constructor called");

    }
    public BankAccount(int accountNumber, double balanace, String customerName, String customerEmail, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balanace = balanace;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, int phoneNumber) {
        this(99999, 100.55, customerName, customerEmail, phoneNumber);
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalanace(double balanace) {
        this.balanace = balanace;
    }

    public double getBalanace() {
        return this.balanace;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balanace += depositAmount;
        System.out.println("Your current balance is: " + this.balanace);
    }
    public void withdrawFunds(double withdrawAmount) {
        if (withdrawAmount <= this.balanace) {
            this.balanace -= withdrawAmount;
            System.out.println("Your current balance is " + this.balanace);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
