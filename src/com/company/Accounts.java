package com.company;

public class Accounts {


    private String userName;
    private String pinNumber;
    private String accountNumber;
    private double accountBalance;

    public Accounts() {
    }

    public Accounts(String userName, String pinNumber, String accountNumber, double accountBalance) {
        this.userName = userName;
        this.pinNumber = pinNumber;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

