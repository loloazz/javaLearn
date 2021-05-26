package com.company.if_Switch_for_continue;

import java.util.Scanner;

public class if03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plese input xingtongjifen:");
        int fen = scanner.nextInt();
        if (fen==100){
            System.out.println("great!");
        }else if (fen<100&&fen>=80){
            System.out.println("better!");
        }else if (fen>=60&&fen<80){
            System.out.println("good");
        }else {
            System.out.println("GG");
        }

    }
}
