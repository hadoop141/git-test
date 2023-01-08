package com.itheima.a01myexception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        /*
            捕获异常：try...catch
                    try ... catch...finally  无论是否捕获异常，都要执行finally里面的代码，就算try里面有return 一样需要执行fianlly


         */
        int[] arr = {1, 2, 3, 4, 5};
        try {
            /*
                try{}里面，放可能会出异常的代码
                出现异常了，就会和catch里面的异常进行比较，如果类型一致，就代表捕获成功，就会执行catch里面的代码
                注意：如果我们捕获异常成功了，程序就会继续执行try...catch下面的代码
                    如果失败了，异常就会抛给JVM处理，也就是直接打印异常信息，程序终止执行
             */
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组索引越界");
        }

        System.out.println("你看我执行了吗");
    }
}
