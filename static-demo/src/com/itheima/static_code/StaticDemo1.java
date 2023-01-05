package com.itheima.static_code;

public class StaticDemo1 {

    static String name;
    /**
     * 静态代码块：随着类的加载而加载，且只加载一次，属于类
     * 作用：初始化静态资源
     */
    static {
        System.out.println("--------------静态代码块执行了----------------");
        name = "张三";
    }


    public static void main(String[] args) {
        //目标：先理解静态代码块
        System.out.println("--------------main方法执行了----------------");

    }


}
