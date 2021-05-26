package com.company.collection_.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @ClassName: collectiontest
 * @Author: YL
 * @Date: 2021/4/23 19:24
 * @Description: TODO
 */
public class collectiontest {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List arr= new ArrayList();
        arr.add(new dog("shabi", 100));
        arr.add(new dog("dada",20));

        for (Object o : arr) {
            System.out.println(o);
        }

        System.out.println(arr);
        System.out.println("===============");
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
class dog  {

    private String name;
    private int age;


    public dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}