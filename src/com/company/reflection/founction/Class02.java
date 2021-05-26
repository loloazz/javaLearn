package com.company.reflection.founction;

import com.company.reflection.Car;

/**
 * @Author: Yaolong
 * @Date: 2021/7/28 15:36
 * @Pagename: com.company.reflection.founction
 * @ProjectName: java复习
 * @Describe: 获取Class对象的各种方式
 **/
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO: 2021/7/28 前提：已知一个类的全类名，且在该类的路径下，可以通过Class类的静态方法 forName() 获取，可能会抛出ClassNotFoundException 、
        //例如Class cls1= Class.forName("java.lang.Cat")
        //使用场景：多用于配置文件，获取全路径，加载类
        String classAllPath = "com.company.reflection.Car";  //JDBC 就是这种
        Class<?> aClass = Class.forName(classAllPath);
        System.out.println(aClass);  //class com.company.reflection.Car

        // TODO: 2021/7/28 前提：若已知具体的类，通过类的class获取，该方式最为安全可靠，程序性能最高
        // 例如：Class cls2 = Cat.class;
        //使用场景：多用于参数的传递，比如通过反射得到对应的构造器对象
        Class<Car> carClass = Car.class;  // 得到Class 对象

        System.out.println(carClass);//class com.company.reflection.Car

        // TODO: 2021/7/28 前提：如果已知某个对象实例，调用该实例的getClass() 方法获取Class对象.
        //  实例：Class clazz  = 对象.getClass();
        //  使用场景：通过创建好的对象，获取Class对象
        Car car = new Car();
        Class aClass1 = car.getClass();
        System.out.println(aClass1); //class com.company.reflection.Car

        // TODO: 2021/7/28  通过类加载器【4种】 来获取Class对象
        //  （1）先得到类加载器car
        ClassLoader classLoader = car.getClass().getClassLoader();

        //  （2）通过类加载器得到Class对象
        Class aClass2 = classLoader.loadClass(classAllPath);
        System.out.println(aClass2);//class com.company.reflection.Car

        //上面的几种方法得到的都是同一个对象


        // TODO: 2021/7/28 基本数据类型（int  char  boolean float  byte  long  shot)按照如下方式得到Class对象

        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);  // int
        System.out.println(characterClass);  // char
        System.out.println(booleanClass);  //boolean

        // TODO: 2021/7/28 基本数据类型对应的包装类。可以通过 .TYPE 得到Class类对象

        Class<Integer> type = Integer.TYPE;
        System.out.println(type);  // int


    }
}
