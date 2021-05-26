package com.company.oop.codeBlock;

public class watchMovie {

    public static void main(String[] args) {
        movie movie = new movie(20);

        System.out.println("==============================");
        movie movie1 = new movie(20, "ddd", "ddddddd");
    }
}
class movie{
    private double price;
    private String name;
    private String role;

    {

        System.out.println("你准备好了吗");
        System.out.println("你真的准备好了吗");
        System.out.println("你已经准备好了吗");

    }

    public movie(double price) {
        System.out.println("movie(double price)被调用了");
        this.price = price;
    }

    public movie(double price, String name, String role) {
        System.out.println("movie(double price, String name, String role)被调用了");
        this.price = price;
        this.name = name;
        this.role = role;
    }

    public movie(String name, String role) {
        System.out.println("movie(String name, String role) 被调用了");
        this.name = name;
        this.role = role;
    }
}