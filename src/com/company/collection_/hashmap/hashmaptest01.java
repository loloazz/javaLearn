package com.company.collection_.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: hashmaptest01
 * @Author: YL
 * @Date: 2021/4/30 16:00
 * @Description: TODO
 */

public class hashmaptest01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        employee dazhuang = new employee(1, "大壮", 20000);
        employee xiaozhuang = new employee(2, "小壮", 20022);
        employee erzhuang = new employee(3, "er壮", 15000);

        Map employeeHashMap = new HashMap();
        employeeHashMap.put(dazhuang.getId(),dazhuang);
        employeeHashMap.put(xiaozhuang.getId(),xiaozhuang);
        employeeHashMap.put(erzhuang.getId(),erzhuang);

        Set set = employeeHashMap.keySet();
        for (Object o : set) {
            Object o1 = employeeHashMap.get(o);
            employee o2=(employee)o1;
            if (o2.getSal()>18000){
                System.out.println(o2);
            }
        }
        System.out.println("--------------------");


        Set set1 = employeeHashMap.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry  next = (Map.Entry)iterator.next();
            employee value =(employee) next.getValue();
            if (value.getSal()>18000){
                System.out.println(value);
            }


        }


    }
}


class employee {
    private String name;
    private double sal;
    private int id;

    public employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
