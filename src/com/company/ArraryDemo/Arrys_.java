package com.company.ArraryDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName: Arrys_
 * @Author: YL
 * @Date: 2021/4/22 15:01
 * @Description: TODO
 */
public class Arrys_ {

}


class Book {
    public String name;
    public double price;


    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {


        Book[] a = new Book[4];
        a[0] = new Book("红楼梦···", 25.5);
        a[1] = new Book("金瓶梅", 23.5);
        a[2] = new Book("青年文摘", 40.5);
        a[3] = new Book("java系列", 250.3);

        Arrays.sort(a, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double tmp =0.0d;
                tmp = o1.price-o2.price;
                if (tmp>0){
                    return 1;
                }else if (tmp<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });

//
//        Arrays.sort(a, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//
//
//
//
//                return o1.name.length()-o2.name.length();
//            }
//        });
        String s = Arrays.toString(a);
        System.out.println(s);

//        public void sort(Book[] a, Comparable c){
//
//
//        }

//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 0; j < a.length - i; j++) {
//                if (a[i].price > a[j].price) {
//                    Book tmp = a[i];
//                    a[i] = a[j];
//                    a[j] = tmp;
//                }


            }
        }




