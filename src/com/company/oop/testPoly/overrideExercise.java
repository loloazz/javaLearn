package com.company.oop.testPoly;

public class overrideExercise {
            public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.say());
        Student student = new Student("傻逼",20,20, 100);
        System.out.println(student.say());


    }
}

class Person{
    private  String name;
    private  int age;
    public Person(){
        this.name="lala";
        this.age = 18;

    }
    public Person(String name, int age) {
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
    public String say(){
        return "我是"+name+",今年"+age+"岁了!";
    }

}

class  Student extends  Person{
    private int id;
    private  int score;

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }



    @Override
    public String say() {
//        System.out.println("我的名字是"+getName()+"，" +
//                "今年"+getAge()+"了"+"我的id是"+id+"，我考了"+score+"分！");
        return super.say() + "了"+"我的id是"+id+"，我考了"+score+"分！";
    }
}