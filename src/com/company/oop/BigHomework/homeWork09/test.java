package com.company.oop.BigHomework.homeWork09;

public class test {
    public static void main(String[] args) {
        Person [] people = new Person[4];
        people[0] = new Techer("苍井空", "女", 30, 10);
        people[1] = new Techer("小泽玛利亚", "女", 28, 8);
        people[2]=new Student("lala","男",18,1840222);
        people[3] = new Student("las1ao","男",40,1840299);


        comparetoAge(people);
        for (int i = 0; i < people.length ; i++) {
            System.out.println(people[i]);

            if (people[i] instanceof Techer ) {
                System.out.println(people[i].play());
            }else if (people[i] instanceof  Student)
            {
                System.out.println(people[i].play());
            }
            System.out.println();
            System.out.println("===================");
            System.out.println();

        }

    }


    public static void comparetoAge(Person [] people){
        Person t =null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i; j++) {
                if (people[i].getAge() > people[i + 1].getAge()) {
                    t = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = t;
                }
            }

        }
    }
}
