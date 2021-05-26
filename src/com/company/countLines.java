package com.company;

import java.io.*;

/**
 * @Author: Yaolong
 * @Date: 2021/7/19 18:45
 * @Pagename: com.company
 * @ProjectName: java复习
 * @Describe:
 **/
public class countLines {
    public static void main(String[] args) throws Exception {

        File file = new File("D:\\java复习\\src");
        countline(file);
        System.out.println(sum);


    }

    public static int sum = 0;

    public static void countline(File file) throws Exception {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                String absolutePath = file1.getAbsolutePath();
                BufferedReader bufferedReader1 = new BufferedReader(new FileReader(absolutePath));
                String str = null;
                while ((str = bufferedReader1.readLine()) != null) {
                    sum += 1;
                    System.out.println(str);
                }
            } else {
                countline(file1);
            }
        }
    }
}
