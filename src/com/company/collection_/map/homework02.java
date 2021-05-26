package com.company.collection_.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: homework02
 * @Author: YL
 * @Date: 2021/5/1 16:11
 * @Description: TODO
 */
public class homework02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        hashMap.put("jack",2600);
        Set entrySet = hashMap.entrySet();
        for (Object o : entrySet) {
            Map.Entry o1 = ( Map.Entry) o;
            hashMap.put(o1.getKey(),(int)(o1.getValue())+100);
        }

        System.out.println(hashMap);

    }
}

class sell{

}
