package com.company.if_Switch_for_continue;

public class for08 {
    public static void main(String[] args) {


      for (int i = 1; i <= 3; i++) {
        for (int k = 1; k <= 3 - i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i) - 1; j++) {
            System.out.print("*");
        }

        System.out.println("");
    }
}
}