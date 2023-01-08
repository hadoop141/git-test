package com.itheima.a01myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        /*
            JVM虚拟机默认处理方式:
                1.将异常信息、异常原因、异常代码的位置打印在控制台
                2.程序终止运行：异常代码之后的代码不会执行

         */

        System.out.println("张三");
        System.out.println(10/0);
        System.out.println("李四");
        System.out.println("王五");
    }
}
