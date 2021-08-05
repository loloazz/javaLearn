package com.company.re;

import java.util.regex.Pattern;

/**
 * @Author: Yaolong
 * @Date: 2021/7/29 15:16
 * @Pagename: com.company
 * @ProjectName: java复习
 * @Describe:验证QQ邮箱
 *
 **/
public class re {

    public static void main(String[] args) {
        String email = "002345@qq.com";


        String re= "[1-9]{1}[0-9]{5,10}@+qq.com$";

        Pattern compile = Pattern.compile(re);
        System.out.println(compile.matcher(email).find());


    }
}
