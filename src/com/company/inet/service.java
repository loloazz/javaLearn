package com.company.inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName: service
 * @Author: YL
 * @Date: 2021/5/12 16:24
 * @Description: TODO
 */
public class service {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("wait connection!");


        Socket accept = serverSocket.accept();
        //等待连接

        System.out.println(accept.getClass());;
        InputStream inputStream = accept.getInputStream();


        byte[] bufs = new byte[1024];
        int  readline=0;
        while ((readline=inputStream.read(bufs))!=-1){

            System.out.println(new String(bufs,0,readline));
        }


        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("shabi".getBytes(StandardCharsets.UTF_8));
        accept.shutdownOutput();
        outputStream.flush();

        System.out.println("发送成功！");


        outputStream.close();



        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
