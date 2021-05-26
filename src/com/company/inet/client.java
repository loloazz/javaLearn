package com.company.inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName: client
 * @Author: YL
 * @Date: 2021/5/12 16:33
 * @Description: TODO
 */
public class client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9999);

        System.out.println("连接成功！！");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("lalal".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();
        byte[] buf=new byte[1024];
        int readline=0;
         while ((readline=inputStream.read(buf))!=-1){
            System.out.println("收到的是："+new String(buf,0,readline));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
//        socket.getOutputStream();

    }
}
