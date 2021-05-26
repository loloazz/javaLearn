package com.company.oop.Method;

public class Method02 {
    public static void main(String[] args) {
        int [][]map ={{1,2},{2},{3},{4}};
        MyTool Tool = new MyTool();
        Tool.printArr(map);

    }

}
class MyTool{


    public void printArr(int [][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.println(map[i][j]+"\t");
            }
            System.out.println();
        }
    }

}