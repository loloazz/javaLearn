package com.company.if_Switch_for_continue;



public class continue02 {
    public static void main(String[] args) {
        label1:
        for (int j=0;j<2;j++){

            label2:
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                   // continue label1;
                    continue label2;
                }
                System.out.println("i="+i);
            }

        }
    }

}
