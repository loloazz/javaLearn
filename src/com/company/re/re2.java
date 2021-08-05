package com.company.re;

import java.util.regex.Pattern;

/**
 * @Author: Yaolong
 * @Date: 2021/7/29 15:26
 * @Pagename: com.company.re
 * @ProjectName: java复习
 * @Describe:匹配手机号
 **/
public class re2 {
    public static void main(String[] args) {
        String phoneNum = "03341241111";
        String reg = "[1][3-9][0-9]{9}$";

        Pattern compile = Pattern.compile(reg);
        boolean b = compile.matcher(phoneNum).find();
        System.out.println(b);


    }

}
