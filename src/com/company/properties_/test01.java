package com.company.properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName: test01
 * @Author: YL
 * @Date: 2021/5/7 23:29
 * @Description: TODO
 */
public class test01 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileReader("D:\\java复习\\src\\com\\company\\properties_\\test.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        properties.list(System.out);
        System.out.println(user);
        System.out.println(password);
    }
}
