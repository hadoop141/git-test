package com.itheima.a01myexception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        /*
            问：如果tyr中遇到的问题没有被捕获，怎么执行？
            答：如果异常没有被捕获，异常就会抛给JVM处理，程序终止执行
         */
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(10/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println("程序正常执行");
    }
}
