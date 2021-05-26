package com.company.Generic;

import java.util.*;

/**
 * @ClassName: Generic_test
 * @Author: YL
 * @Date: 2021/5/2 16:36
 * @Description: TODO
 */
public class Generic_test {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("你好"));
        students.add(new Student("lala"));

        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("lala",new Student("lala"));
        stringStudentHashMap.put("sha",new Student("sha"));

        for (Student student : students) {
            System.out.println(student);
        }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next);
        }


        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println( entry.getKey()+"     "+entry.getValue());
        }

        Set<String> strings = stringStudentHashMap.keySet();
        for (String string : strings) {
            System.out.println(string);
        }
        Collection<Student> values = stringStudentHashMap.values();
        for (Student value : values) {
            System.out.println(value);
        }
    }
}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}