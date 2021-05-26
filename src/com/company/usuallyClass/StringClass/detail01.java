package com.company.usuallyClass.StringClass;

/**
 * @ClassName: detail01
 * @Author: YL
 * @Date: 2021/4/19 20:29
 * @Description: TODO
 */
public class detail01 {
        public static void main(String[] args) {
//            final char[] value  = {'g','h','r'};
//            char [] la =  {'g','h','r'};
//            String b = "";
//
//            String a = "11.2202 235";
//            String[] as = a.split("a");
//            for (String s : as) {
//                s= s+",";
//                System.out.println(s);
//            }
           int g = 20;
            double j = 20.2354D;
            char sex = '男';
            String dec = "sbsbss";

            String format1 = String.format("年龄%d,成绩%.2f,性别 %c,描述 %s", g, j, sex, dec);
            System.out.println(format1);

        }

        public void dd(){

        }
}
