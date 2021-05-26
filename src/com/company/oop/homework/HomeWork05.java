package com.company.oop.homework;

public class HomeWork05 {
    public static void main(String[] args) {
        Circle circle = new Circle(35);
        System.out.println("面积为："+circle.area());

        System.out.println("周长为："+circle.Perimeter());
    }
}
class Circle{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public float Perimeter(){//周长

        return (float) (2*radius*3.14);
    }
    public float area(){//周长

        return (float) (radius*radius*3.14);
    }
}