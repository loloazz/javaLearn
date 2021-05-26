package com.company.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: Yaolong
 * @Date: 2021/7/18 21:23
 * @Pagename: com.company.reflection
 * @ProjectName: java复习
 * @Describe:
 **/
public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();

        properties.load(new FileInputStream("src/com/company/reflection/cat.properties"));
        String classpath = properties.getProperty("classpath");
        String method = properties.getProperty("method");


        // 加载类，返回Class类型对象
        Class aClass = Class.forName(classpath);

        // 通过aClass 得到类的加载的类，com.company.reflection.Cat的对象实例
        Object interfaces = aClass.newInstance();

        Method methods = aClass.getMethod(method);
        // 在反射中，可以把方法是为对象（万物皆对象）

        // 通过method调用方法：即通过方法对象来实现调用方法

        methods.invoke(interfaces); // 传统方法  对象.方法（）      反射机制： 方法.invoke(对象)



//        System.out.println(invoke);


    }

}
