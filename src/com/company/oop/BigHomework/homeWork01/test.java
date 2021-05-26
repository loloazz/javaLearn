package com.company.oop.BigHomework.homeWork01;

public class test {
    public static void main(String[] args) {
        Person[] people = new Person[6];

        people[0] = new Person();
        people[0].setAge(20);
        people[0].setName("垃0圾");

        people[1] = new Person();
        people[1].setAge(40);
        people[1].setName("李...洁");

        people[2] = new Person();
        people[2].setAge(30);
        people[2].setName("突然");

        people[3] = new Person();
        people[3].setAge(90);
        people[3].setName("d然445333");

        people[4] = new Person();
        people[4].setAge(80);
        people[4].setName("rr8然");

        people[5] = new Person();
        people[5].setAge(77);
        people[5].setName("dddd6d");

        new test().ComparetoAge(people);
        System.out.println("-----------------------------");
        new test().ComparetoNamelen(people);

    }


    public void ComparetoAge(Person[] people) {
        Person tmp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    tmp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }


    public void ComparetoNamelen(Person[] people) {
        Person tmp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if ((int) (people[j].getName().length()) > (int) (people[j + 1].getName().length())) {
                    tmp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}