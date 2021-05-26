package com.company.reflection.founction;

import com.company.reflection.Car;

import java.lang.reflect.Field;

/**
 * @Author: Yaolong
 * @Date: 2021/7/28 15:04
 * @Pagename: com.company.reflection.founction
 * @ProjectName: java复习
 * @Describe:演示class类的常用方法
 **/
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {


        String classAllPath = "com.company.reflection.Car";


        // 获取Car类，对象的Class对象
        // <?> 表示不确定java类型
        Class<?> cls = Class.forName(classAllPath);

        System.out.println(cls);  // 显示cls对象，是哪一个类的Class对象 class com.company.reflection.Cat


        System.out.println(cls.getClass());//输出cls的运行类型   class java.lang.Class





        //得到包对象
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);  //package com.company.reflection
        // 获取包名
        String name = aPackage.getName(); //com.company.reflection

        System.out.println(name);



        // 通过cls创建对象实例             Instance: 实例
        Object o = cls.newInstance();

        //还可以对使用下转型
        Car car = (Car) o;   // 重写了toString方法
        System.out.println(car);  //Car{brand='BMW', price=5000, color='白色'}


        // 通过反射获取属性

        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//BMW

        //通过反射给属性赋值
        brand.set(car,"大奔");
        System.out.println(brand.get(car));//大奔

        //通过遍历获取所有的属性


        Field[] fields = cls.getFields();//得到字段的数组
        for (Field field : fields) {

            /**
             *
             * brand
             * price
             * color
             *
             * */
            System.out.println(field.getName());
        }



    }
}
