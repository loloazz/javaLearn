package com.company.Exception;

/**
 * @ClassName: try_catch
 * @Author: YL
 * @Date: 2021/4/18 13:19
 * @Description: TODO
 */
public class try_catch {
    public static void main(String[] args) {
        int i =1;
        int j =0;
        try {
            int result = i/j;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("slslsllsls");
        }
    }



}
