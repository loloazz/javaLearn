package com.company.oop.resursion;

public class Monkeys_eat_peaches {
    public static void main(String[] args) {
        peachs peachs = new peachs();
        System.out.println( peachs.eat(1));
    }
}
class peachs{
    public int eat(int day){
        if (day==10){
              return 1;
        } else if (day>=1&&day<=9){

            return ( eat(day+1) +1)*2;

        }else {
            return -1;
        }
    }



}