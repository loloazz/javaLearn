package com.company.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: arraryListTest
 * @Author: YL
 * @Date: 2021/4/24 10:55
 * @Description: TODO
 */
public class arraryListTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("张一丰");
        arrayList.add("张二丰");
        arrayList.add("张三丰");
        arrayList.add("张四丰");
        arrayList.add("张五丰");
        arrayList.add("张六丰");
        arrayList.add("张七丰");
        arrayList.add("张八丰");
        arrayList.add("张九丰");
        arrayList.add("张十丰");
        arrayList.add(2,"小姚");
        System.out.println(arrayList.get(5));
        arrayList.remove(6);
        arrayList.set(7,"lala");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }


    }
}
