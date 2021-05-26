package com.company.if_Switch_for_continue;
/*
* 求出1-1/2+1/3-1/4.....1/100；
* */
public class homework03{
    public static void main(String[] args) {
        double sum =0.0d;
        int i;
        float f=-1;
        for(i=1;i<=100;i++)
        {
            f=-f;
            sum+= f/i;
        }
        System.out.println("1-1/2+1/3-1/4.....1/100的和为:"+sum);
    }


}
