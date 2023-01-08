package com.itheima.a01myexception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        /*
            问：如果tyr里面的代码没有出现异常，程序怎么执行？
            答：先执行完try里面的代码，再执行try...catch后面的，不会执行catch里面的
         */
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");

        }

        System.out.println("程序正常执行");
    }
}
