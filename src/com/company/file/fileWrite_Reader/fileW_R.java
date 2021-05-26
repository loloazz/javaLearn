package com.company.file.fileWrite_Reader;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: fileW_R
 * @Author: YL
 * @Date: 2021/5/5 23:52
 * @Description: TODO
 */
public class fileW_R {
    public static void main(String[] args) {

    }

    @Test
    public void  r_() throws IOException {
        FileReader fileReader = new FileReader("e:\\new1.txt");
        char[] chars = new char[8];
        int readdata;
        while ((readdata=fileReader.read(chars))!=-1){

            System.out.println(chars);
        }

        fileReader.close();

    }


    @Test
    public void w_() throws IOException {
        String path = "e:\\new3.txt";
        FileWriter fileWriter = null;
        try {

            char[] chars = {'1','2','3','4','1','2','3','4'};
            fileWriter=new FileWriter(path, true);
            fileWriter.write(chars);
            fileWriter.write('姚');
            fileWriter.write("整数也是对象，在比较两个整数时有两个运算符`==`和`is`，它们的区别是：");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileWriter.flush();//一定要刷新，或者要关闭程序。
            fileWriter.close();
        }
        System.out.println("成功！");

    }

}
