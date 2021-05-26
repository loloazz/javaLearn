package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName: drawCircle
 * @Author: YL
 * @Date: 2021/5/3 16:23
 * @Description: TODO
 */
public class drawCircle extends Frame {

    //定义一个面板
    private Mypanel mp=null;
    public static void main(String[] args) {
        new drawCircle();

    }

    public drawCircle() {
        mp=new Mypanel();
        this.add(mp);
        this.setSize(400,300);

//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

class Mypanel extends JPanel{


    //mypanel对手就是一个面板
    //Graphics有多种方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画椭圆
        g.drawOval(10,10,100,100);
        //画直线
        g.drawLine(1,2,100,100);
        //花直线
        g.drawRect(20,20,200,300);
        //设置画笔颜色
        g.setColor(Color.green);
        //使用颜色填充
        g.fillOval(100,100,100,100);


        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("src/com/company/img.png"));
        g.drawImage(image,500,500,175,221,this);

    }
}