package com.company.Thread_;

import static java.lang.Thread.sleep;

/**
 * @ClassName: moreThread
 * @Author: YL
 * @Date: 2021/5/4 11:54
 * @Description: TODO
 */
public class moreThread {
    public static void main(String[] args) throws InterruptedException {

        Sellman sellman1 = new Sellman("小王");
        Thread thread = new Thread(sellman1);
        thread.start();
//        thread.interrupt();//中断线程，常用于唤醒正在休眠的线程。
//        thread.setName("lalal");//设置线程名
//        thread.getName();//得到线程名
//        thread.setPriority(Thread.NORM_PRIORITY);//设置线程的优先级，MIN_PRIORITY =1
//                                                 // MAX_PRIORITY= 10   NORM_PRIORITY = 5
//
//        thread.getPriority();//得到线程的优先级
//
//
        Sellman sellman2 = new Sellman("老王");
        Thread thread1 = new Thread(sellman2);
        thread1.start();

    }
}

class Sellman implements Runnable{
    private String name;
    private Boolean loop =true;
    public Sellman(String name) {
        this.name = name;
    }


    public synchronized void sell(){
        if (tickets <= 0) {
            System.out.println("票已经卖完了！");
            loop = false;
            return;
        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tickets--;
        System.out.println("正在买票的人是：" + name + "当前票数为" + tickets);


    }

    static int tickets=100;
    @Override
    public void run() {
        while (loop) {
           sell();

        }
    }
}