package com.company.ArraryDemo;
/*
* 使用二维数组打印出杨辉三角！
*
* 1
* 1 1
* 1 2 1
* 1 3 3 1
* 1 4 6 4 1
* 1 5 10 10 5
*
* */
/*规律   1、第一行有1个元素，第n行有n个数据
        2、第一行的第一个元素和最后一个元素都是1
        3、从第三行开始，对于非第一个元素和最后一个元素的值
        4、 a[i][j]=a[i-1][j-1]+a[i-1][j]
      */
public class yanghuisanjiao {
    public static void main(String[] args) {
        int [][] yangHui=new int[100][];
        for (int i = 0; i < yangHui.length; i++) { // 遍历yangHui的每一个元素
            yangHui[i]=new int[i+1];//给每一个一维数组开辟空间
            for (int j = 0; j < yangHui[i].length; j++) {
                if (j==0||j==yangHui[i].length-1){//第一行的第一个元素和最后一个元素都是1  直接用判断语句
                    yangHui[i][j]=1;
                }else {
                    yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
                }
            }
        }
            //遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j]+"\t");
            }

            System.out.println();
        }

    }
}
