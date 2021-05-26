package com.company.oop.OverLoad;

public class OverLoad02 {
    public static void main(String[] args) {
        test test = new test();
       int i= test.sum(1,2,3,4,5,6,7,8,9);
        System.out.println("i="+i);
    }
}

class test{
    public int sum(int i,int j){
        return i+j;
    }
    public int sum(int i,int j,int k){
        return i+j+k;
    }

    public int sum(int i,int j,int k,int l){
        return i+j+k+l;
    }
    public int sum(int i,int j,int k,int l,int p){
        return i+j+k+l+p;
    }

    public int sum(int... nums){
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        return res;

    }

}