package com.company.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName: homework01
 * @Author: YL
 * @Date: 2021/5/1 13:46
 * @Description: TODO
 */
public class homework01 {
    public static void main(String[] args) {
        news new1 = new news("震惊！！！印度新冠确诊病例超过了千万，数百信众去恒河泡澡。");
        new1.setDetail("d8a7da8da8da78d7a8d7a7da8sa87sa87d8asd8ad78asd7a8d78as7d8ada8d8a7d");
        news new2 = new news("震惊！！！马鞍山学院一男子偷亏其他人洗澡，最大恶集，真的恶心!");
        new2.setDetail("d5a4d5as4da6d8sadas4dasda1xadascc ");
        ArrayList<news> news = new ArrayList<>();
        news.add(new1);
        news.add(new2);
        Iterator<com.company.collection_.list_.news> iterator = news.iterator();
        while (iterator.hasNext()) {
            com.company.collection_.list_.news next = iterator.next();
            String title = next.getTitle();
            String substring = title.substring(0, 15);
            substring=substring+"...";
            System.out.println(substring);
        }
    }
}

class news{
    private String title;
    private String detail;

    public news(String title) {
        this.title = title;
    }

    public news() {
    }

    @Override
    public String toString() {
        return  title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
