package com.company.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: Yaolong
 * @Date: 2021/7/29 14:15
 * @Pagename: com.company.reflection
 * @ProjectName: java复习
 * @Describe: 通过反射绕过安全检测
 **/
public class classtest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
//        ArrayList<String> list = new ArrayList<>();
//
//        System.out.println(list.getClass());


       Class forName = Class.forName("java.util.ArrayList");

//        System.out.println(forName);


        Object o = forName.newInstance();

        Method add = forName.getMethod("add", Object.class);

        add.invoke(o, 20);

        System.out.println(o);


    }
}
