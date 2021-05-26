package com.company.oop.BigHomework.homeWork04;

public class test {
    public static void main(String[] args) {
        Peasant peasant = new Peasant(2000, "农民伯伯");
        Scientist scientist = new Scientist(20000, "钟南山", 200000);
        Teacher teacher = new Teacher(2000, "苍老师", 1000, 100);
        Waiter waiter = new Waiter(1500, "凄美服务生");
        Worker worker = new Worker(5000, "打工人");
        peasant.getInfo();
        scientist.getInfo();
        teacher.getInfo();

        waiter.getInfo();
        worker.getInfo();



    }
}
