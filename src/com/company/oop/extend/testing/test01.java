package com.company.oop.extend.testing;

public class test01 {
    public static void main(String[] args) {
        b b = new b();

    }
}

class a {
    a() {
        System.out.println("a");
    }
    a(String name) {
        System.out.println("a name");
    }

}

class b extends a {

    b() {
        this("abc");
        System.out.println("b");
    }

    b(String name) {
        System.out.println("b name");
    }
}
