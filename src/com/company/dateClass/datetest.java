package com.company.dateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: datetest
 * @Author: YL
 * @Date: 2021/4/22 21:20
 * @Description: TODO
 */
public class datetest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();//获取系统时间
        System.out.println(date);//打印的老美的时间习惯
        System.out.println(date.getTime());//获取对应时间毫秒数的时间戳
        System.out.println(date.getTime()/1000);//把他除以1000就得到秒的时间戳


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");//时间格式化的格式
        String format = simpleDateFormat.format(date);//format：将日期转换成上面的指定格式。

            //可以把日期的字符串格式化成 对应的Date
        String s ="1999年01月23日 10:20:30 星期一";
        Date parse = simpleDateFormat.parse(s);//这个需要抛出
        //在输出时，还是按照国外的形式，如果需要指定格式输出，在转换就可以了
        //在把一个String转成date的时候，一定要按照simpleDateFormat指定格式。
        System.out.println(format);

    }
}
