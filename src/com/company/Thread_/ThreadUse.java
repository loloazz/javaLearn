package com.company.Thread_;

import static java.lang.Thread.sleep;

/**
 * @ClassName: ThreadUse
 * @Author: YL
 * @Date: 2021/5/3 19:09
 * @Description: TODO
 */
public class ThreadUse extends Thread{

    public static void main(String[] args) throws InterruptedException {
        ThreadUse threadUse = new ThreadUse();
        threadUse.start();
        for (int i = 0; i <1000; i++) {
            sleep(1000);
            System.out.println("kkkkk");
        }


    }
    @Override
    public void run() {
        int i=0;
        while (true){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("我是傻逼！"+i);
            i++;
        }

    }
}

class ThreadUse2 implements Runnable{
    public static void main(String[] args) {

        ThreadUse2 threadUse2 = new ThreadUse2();

        Thread thread = new Thread(threadUse2);
        thread.start();

    }
    @Override
    public void run() {
        int i=0;
        while (true){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("我是傻逼！"+i);
            i++;
        }

    }
}

