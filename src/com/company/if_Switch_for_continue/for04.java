package com.company.if_Switch_for_continue;

public class for04 {
    public static void main(String[] args) {
        for (int i = 1; i<= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   "+j + " * " + i + " = " + (i * j));
            }

            System.out.println("\n");
        }
    }
}