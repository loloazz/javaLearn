package homework;

import org.junit.jupiter.api.Test;

/**
 * @Author: Yaolong
 * @Date: 2021/7/30 9:37
 * @Pagename: homework
 * @ProjectName: java复习
 * @Describe: 第一三维不平衡数组如下：Int a[][] []= {{{1,2},{3,4,5}},{{6,7},{8,9,10,11}}};
 * 编程实现输出数组a各个元素，并求各元素之和
 **/
public class Sum {
    public static void main(String[] args) {

        int a[][][] = {{{1, 2}, {3, 4, 5}}, {{6, 7}, {8, 9, 10, 11}}};

        int sum = 0;
        for (int[][] ints : a) {
            for (int[] anInt : ints) {

                for (int i : anInt) {
                    sum = i+sum;
                    System.out.println(i);
                }
            }

        }
        System.out.println(sum);

    }

//    试编写程序，从一个给定的字符串中删去某一个给定的字符。
    @Test
   public String   remove(String mon,String son){
       String replace = mon.replace(son, "");
        System.out.println(replace);
       return replace;
   }

}
