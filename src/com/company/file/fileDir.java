package com.company.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: fileDir
 * @Author: YL
 * @Date: 2021/5/5 13:03
 * @Description: TODO
 */
public class fileDir {
    public static void main(String[] args) {

    }
    @Test
    public void m1() throws IOException {
        File file = new File("e:\\new.txt");
        if (!(file.exists())){
            file.createNewFile();
            System.out.println("文件创建成功");
        }else {
            file.delete();
            System.out.println("文件删除成功！");
        }


    }


}
