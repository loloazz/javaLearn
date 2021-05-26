package com.company.oop.testPoly;

public class polytest {
    public static void main(String[] args) {
        BB bb = new BB();
        Object obj2 = null;
        System.out.println(bb instanceof  BB);
        System.out.println(bb instanceof  AA);
        System.out.println(obj2 instanceof  BB);
    }
}
class AA{}

class BB extends AA{

}