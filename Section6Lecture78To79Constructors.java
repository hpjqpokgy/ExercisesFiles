package com.s4ve;

import java.awt.font.GlyphJustificationInfo;

public class Main {

    public static void main(String[] args) {
        Account justinAccount = new Account(); // "101798", 0.00, "Justin", "watata@gmail.com", "000999");
        System.out.println(justinAccount.getNumber());
        System.out.println(justinAccount.getBalance());

        justinAccount.withdrawal(100);

        justinAccount.deposit(10000);
        justinAccount.withdrawal(500);

        justinAccount.deposit(20000);
        justinAccount.withdrawal(3000);

        Account roblesAccount = new Account("robles", "rob@gmail.com", "101798" );
        System.out.println(roblesAccount.getNumber() + " name " + roblesAccount.getCustomerName());

        
    }
}





//ACCOUNT.JAVA NEW CLASS

package com.s4ve;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("101798", 1.50, "Default Name", "Default Address", "Default phone");
        System.out.println("Empty constructor called");

    }

    public Account(String number, double balance,String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called ");

        setNumber(number);
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.5, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("You deposited " + depositAmount + " Your new balance is " + balance + " on your bank account ");

    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount <= 0 ) {
            System.out.println("Only " + balance + " available. withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining bal  = " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}


