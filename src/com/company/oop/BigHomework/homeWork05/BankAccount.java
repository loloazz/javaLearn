package com.company.oop.BigHomework.homeWork05;

public class BankAccount {
    private int balance;


    public BankAccount(){

    }
    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance -=amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
