package com.company.Exception;

/**
 * @ClassName: CoustomException
 * @Author: YL
 * @Date: 2021/4/19 10:59
 * @Description: TODO
 */
public class CoustomException {
    public static void main(String[] args) {
        int age = 800;
        if (!(age>=80&&age<=120)){
           throw  new AgeExcption("那么大！");
        }
    }
}
class AgeExcption extends RuntimeException{
    public AgeExcption(String message){
        super(message);
    }


}