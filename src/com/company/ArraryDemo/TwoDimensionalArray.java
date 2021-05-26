package com.company.ArraryDemo;
/*打印出二维数组
        0,0,0,0,0,0
        0,0,1,0,0,0
        0,2,0,3,0,0
        0,0,0,0,0,0
*
*
*
* */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arr = { {0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0},
                        {0, 2, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0}};


        for (int i = 0; i < arr.length; i++) { //遍历二维数组的每个元素！
            for (int j = 0; j < arr[i].length; j++) {  //arr[i].lenth  得到每个一维数组的长度！
                System.out.print(arr[i][j]+"\t");


            }
            System.out.println();
        }

    }

}
