package com.company.if_Switch_for_continue;

public class for02 {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i = 0; i < 99; i++) {
            if (i%9==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("count:"+count+'\t'+"sum:"+sum);
    }
}
