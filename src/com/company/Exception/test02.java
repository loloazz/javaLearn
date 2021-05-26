package com.company.Exception;

/**
 * @ClassName: test02
 * @Author: YL
 * @Date: 2021/4/19 12:38
 * @Description: TODO
 */
public class test02 {

}

class EcmDef {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new mathException("参数的个数不正确");
            }

            int i = Integer.parseInt(args[0]);
            int i1 = Integer.parseInt(args[1]);

            System.out.println(EcmDef.cal(i, i1));
        } catch (mathException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }


    public static double cal(int i, int j) throws ArithmeticException {
        return i / j;
    }
}

class mathException extends RuntimeException {
    public mathException(String name) {
        super(name);
    }
}