package com.company.oop.BigHomework.homeWork05;

public class test {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());

        savingAccount.withdraw(1000);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(10);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(10);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(10);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(10);
        System.out.println(savingAccount.getBalance());
    }
}
