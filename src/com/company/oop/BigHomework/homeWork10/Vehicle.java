package com.company.oop.BigHomework.homeWork10;

public interface Vehicle {
    void work();
}

class Horse implements Vehicle{

    @Override
    public void work() {
        System.out.println("用马走");
    }
}
class Boat implements Vehicle{

    @Override
    public  void work() {
        System.out.println("坐船走的");
    }
}


class Factory{

     private static  Horse   horse =new Horse();
    private static  Boat   boat =new Boat();

    private Factory(){}
    public static Horse getHorse(){

        return horse ;
    }
    public static Boat getBoat(){
        return boat;
    }
}

class Person{
    private String name;
    private Vehicle Vehicles;

    public Person(String name, Vehicle vehicles) {
        this.name = name;
        Vehicles = vehicles;

    }

    public void passRiver(){
        if (!(Vehicles instanceof Boat)){
            Vehicles = Factory.getBoat();
        }
            Vehicles.work();
    }
    public void comment(){
        if (!(Vehicles instanceof Horse)) {
            Vehicles =Factory.getHorse();
        }
        Vehicles.work();
    }

    public void fly(){
        new Vehicle() {
            @Override
            public void work() {
                System.out.println("坐飞机！！！！");
            }
        }.work();

    }
}

class  Test{
    public static void main(String[] args) {

        Vehicle boat =Factory.getBoat();
        Vehicle horse =Factory.getHorse();

        Person tangseng = new Person("唐僧", boat );
        tangseng.comment();
        tangseng.passRiver();
        tangseng.fly();


    }
}