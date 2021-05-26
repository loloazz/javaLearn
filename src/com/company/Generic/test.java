package com.company.Generic;

/**
 * @ClassName: test
 * @Author: YL
 * @Date: 2021/5/2 19:40
 * @Description: TODO
 */
public class test {
    public static void main(String[] args) {
        Animal<A> aAnimal = new Animal<A>(new A());
        Animal<A> aAnimal1 = new Animal<A>(new B());

    }
}
class Animal <E>{
    E e;


    public Animal(E a) {


    }
}
class A{}
class B extends A{}