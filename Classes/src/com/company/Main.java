package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car toyota = new Car();
        Car honda = new Car();
        honda.setModel("Civit");
        System.out.println("Model is a " + toyota.getModel());
        toyota.setModel("4runner");
        System.out.println("Model is " + toyota.getModel());
        BankAccount kevinNguyen = new BankAccount();//(135343234, 20000, "Kevin Nguyen", "kevin@example.com",71334567);
        System.out.println(kevinNguyen.getAccountNumber());
        System.out.println(kevinNguyen.getCustomerEmail());
        System.out.println("Account Number is " + kevinNguyen.getAccountNumber());
        kevinNguyen.depositFunds(100);
        kevinNguyen.withdrawFunds(100.1);
        BankAccount timsAccount = new BankAccount("Tim","tim@wxample.com", 12345);
        System.out.println(timsAccount.getAccountNumber() + " tim's account number");
        VipCustomer kevin = new VipCustomer("Kevin Nguyen", 2000, "kev.ftw595@gmail.com");
        System.out.println("name : " + kevin.getName() + " \nCredit limit: " + kevin.getCreditLimit() + " \nemail: " + kevin.getEmail());

    }
}
