package com.company.oop.BigHomework.homeWork05;

public class SavingAccount extends BankAccount {
    private double rate = 0.03;
    private int count = 3;


    public SavingAccount(int balance) {
        super(balance);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void earnMonthlyInterest() {
        count=3;
        super.deposit(getBalance()*rate);

    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit((amount - 1));
            count--;
        }

    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw((amount +1));
            count--;
        }

    }
}
