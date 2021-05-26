package com.company.oop.encapsulation;

public class encap01 {
    public static void main(String[] args) {
        persion p = new persion();
        p.setName("ddd");
        p.setAge(130);
        p.setJob("傻逼顶顶顶");
        p.setSalary(5555555);
        System.out.println( p.toString());
        persion persion = new persion("傻逼顶顶顶顶顶顶", 29, 90000, "开发");
        System.out.println(persion.toString());
    }
}


class persion {
    public String name;
    private int age;
    private double salary;
    private String job;

   public persion(){

    }
    public persion(String name, int age, double salary, String job) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setJob(job);
    }

    public void setName(String name) {
        if ((int) (name.length())> 2 && (int)(name.length()) < 4) {
            System.out.println("请重新输入姓名2-4个字符");
            this.name ="傻逼";
        } else {
            this.name = name;
        }
    }

    public void getName() {
        System.out.println("name" + name);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 120 && age >= 2) {
            this.age = age;
        } else {
            this.age = 18;
            System.out.println("年龄有误，请核对！");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }
}