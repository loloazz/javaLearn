package com.company.oop.BigHomework.homework03;

public class test {
    public static void main(String[] args) {
        employee laoba = new worker("老八", 2000, 10);
        manager manager = new manager("天佑", 20000, 5, 1.3);
        laoba.info();
        manager.info();

    }
}
