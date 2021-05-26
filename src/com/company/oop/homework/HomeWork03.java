package com.company.oop.homework;

public class HomeWork03 {
    public static void main(String[] args) {
        Book book = new Book(156.0);
        book.updata();
        Book book1 = new Book(101);
        book1.updata();

    }
}
class Book{
    double price;
    Book(double price){
        this.price=price;
    }
    public void updata(){
        if (this.price>150) {
            this.price=150;
        }else if (this.price>100&&this.price<150){
            this.price=100;
        }
        System.out.println("改后的价格为："+this.price);
    }

}