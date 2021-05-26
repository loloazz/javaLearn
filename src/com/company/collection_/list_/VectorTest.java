package com.company.collection_.list_;

import java.util.Vector;

/**
 * @ClassName: VectorTest
 * @Author: YL
 * @Date: 2021/4/24 20:17
 * @Description: TODO
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add("ssss");

    }
}
