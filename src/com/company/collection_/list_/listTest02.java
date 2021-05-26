package com.company.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: listTest02
 * @Author: YL
 * @Date: 2021/4/24 11:31
 * @Description: TODO
 */
public class listTest02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List arrayList = new ArrayList(10);
        arrayList.add(new Book("三国演义", "罗贯中", 100.0d));
        arrayList.add(new Book("西游记", "吴承恩", 58.99));
        arrayList.add(new Book("红楼梦", "曹雪芹", 88.9));
        arrayList.add(new Book("水浒", "施耐庵", 66.6));



        System.out.println("=====================");


        sort(arrayList);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);

        }





    }


    public static void sort(List list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book o = (Book)list.get(j);
                Book o1 = (Book)list.get(j+1);
                if (o.getPrice()>o1.getPrice()){//交换
                    list.set(j,o1);
                    list.set(j+1,o);
                }



            }
        }


    }
}
class Book {

    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compare(Book o) {
        if (this.getPrice() > o.getPrice() ) {
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "name='" + name  + ", author='" + author +  ", price=" + price ;

    }


}