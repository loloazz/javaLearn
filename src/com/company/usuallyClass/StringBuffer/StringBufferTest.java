package com.company.usuallyClass.StringBuffer;

import java.util.Date;

/**
 * @ClassName: StringBufferTest
 * @Author: YL
 * @Date: 2021/4/21 18:56
 * @Description: TODO
 */
public class StringBufferTest {
    public static void main(String[] args) {
        Date date = new Date();

        long startTime = date.getTime();
        //1. 创建一个  大小 为16的chhr[ ] ,用来存放字符内容。
        StringBuffer stringBuffer = new StringBuffer();
        //2. 通过构造器来指定大小
        StringBuffer stringBuffer1 = new StringBuffer(20);
        //3. 通过给一个String类型的字符来创建StringBuffer
        String A= "";
        StringBuffer stringBuffer2 = new StringBuffer(A);

        //4.还可以使用append方法
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer append = stringBuffer3.append(A);

        String s = stringBuffer3.toString();
        String s1 = new String(stringBuffer3);

        String s3 ="k";




    }

}
