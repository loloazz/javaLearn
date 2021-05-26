package com.company.file.input;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName: inputStream
 * @Author: YL
 * @Date: 2021/5/5 14:23
 * @Description: TODO
 */
public class inputStream {
    public static void main(String[] args) {

    }

    /**
    单字节的读取。效率低
    * */
    @Test
    public void readbyte(){
        String name ="e:\\new1.txt";
        int readdata = 0;
        FileInputStream fileInputStream= null;
        try {
             fileInputStream = new FileInputStream(name);
            //read()读取一个字节的数据，并返回下一个字节数据的位置，如果等于 - 1 那么就代表已经读到文件的末尾。
           while ((readdata = fileInputStream.read())!=-1) {
               System.out.print((char)(readdata));//当出现中文的符号的时候，会出现乱码。一个中文字符，等于 3个字节。
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();//关闭资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    /***
     * 使用read(byte[] b),提高效率！
     */


    @Test
    public void readbytearr() {
        String name = "e:\\new1.txt";
        int readdata = 0;

        //定义一个字符数组

        byte [] buf = new byte[8];

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(name);
            //read()读取buf大小字节的数据，并返回实际读取的字节数。返回-1读到文件末尾
            while ((readdata = fileInputStream.read(buf)) != -1) {//这时readdata的值就相当于读到字节的数目
                System.out.println(new String(buf,0,readdata));//用String的构造方法，将buf传进去。

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();//关闭资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
