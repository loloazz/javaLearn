package com.company.oop.BigHomework.homeWork09;

public class Techer extends Person {

    private int work_age;

    public Techer(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我认真教课！");

    }

    @Override
    public String play() {
        return  getName()+"爱玩象棋！";
    }

    @Override
    public String toString() {
        return "老师的信息" +"\n"+
                "姓名：" + name + '\n' +
                "年龄" + super.getAge() +'\n'+
                "性别" + super.getSex() +'\n'+
                "工龄："+getWork_age()+"\n";

    }
}
