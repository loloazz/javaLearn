package com.company.file.output;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName: outputStream
 * @Author: YL
 * @Date: 2021/5/5 21:14
 * @Description: TODO
 */
public class outputStream {
    public static void main(String[] args) {

    }


    @Test
    public void outputstream01() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("e:\\new1.txt",true);
        String name = "yaolong";
        fileOutputStream.write('h');
        fileOutputStream.write(name.getBytes(StandardCharsets.UTF_8));
        System.out.println("成功");


    }

@Test
    public  void copy() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("e:\\Anaconda3-5.3.1-Linux-x86_64.sh");
        byte buf[] = new byte[1024];
        int readdata = 0;
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\Anaconda3-5.3.1-Linux-x86_64.sh",true);
        while (( readdata=fileInputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,readdata);//必须是这种！！不能就有一个write(buf)，
                                // 因为再最后一次在读的时候，可能不满1024字节，但是写进去了还是1024字节，会造成文件的损坏!
        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("拷贝成功！！");

    }
}
