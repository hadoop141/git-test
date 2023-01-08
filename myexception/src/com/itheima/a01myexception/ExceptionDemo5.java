package com.itheima.a01myexception;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        /*
            问：如果tyr中可能会遇到多个异常，怎么执行？
            答：当遇到第一个异常时，就会抛给catch，
               如果catch捕获成功，就执行catch中的代码，程序正常执行，否则，就抛给JVM处理，程序终止。


           注意：不管，catch是否捕获成功，try中的代码只要遇到异常，try中第一个异常后面的代码，就不会执行.
           注意：catch可以写多个，但是如果这些异常中存在父子关系，也就是继承关系，那么父类的异常，一定要写在后面
         */
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(10 / 0);
            System.out.println("-------------------");
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        } catch (ArithmeticException e) {
            System.out.println("算数异常");
        } catch (Exception e) {
            System.out.println("Exception");

        }

        System.out.println("程序正常执行");
    }
}