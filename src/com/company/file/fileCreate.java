package com.company.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: fileCreate
 * @Author: YL
 * @Date: 2021/5/5 12:37
 * @Description: TODO
 */
public class fileCreate {

    public static void main(String[] args) {

    }
    @Test
    public void Createfile01() throws IOException {
        File file = new File("e:\\new1.txt");//将文件地址放进去即可。
        file.createNewFile();//用文件对象来调用createNewFile（）方法创建文件。
        System.out.println("创建成功！");
        return;


    }
    @Test
    public void Createfile02() throws IOException {
        File parentfile = new File("e:\\");//父目录！
        String filename="new2.txt";//文件名
        File file = new File(parentfile,filename);
        file.createNewFile();//这执行的意义就是从内存中写入磁盘中。
        System.out.println("文件创建成功！！");

    }
    @Test
    public void Createfile03() throws IOException {
        String parentpath ="e:\\";//父目录地址
        String filename="new3.txt";//文本名
        File file = new File(parentpath, filename);
        file.createNewFile();

        System.out.println("创建成功！！");


    }




}
