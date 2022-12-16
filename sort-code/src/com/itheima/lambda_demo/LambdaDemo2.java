package com.itheima.lambda_demo;


public class LambdaDemo2 {
    public static void main(String[] args) {
        /*
           lambda表达式的特点：
                1.lambda表达式可以简化匿名内部类的书写
                2.lambda表达式只能简化函数式接口的匿名内部类的写法
                3.函数式接口：
                    1）有且只有一个抽象方法的接口
                    2）接口上方可以加@FunctionalInterface注解
         */
        //匿名内部类
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类，实现抽象方法");
            }
        });
        //lambda表达式 完整
        method(() -> {
                    System.out.println("lambda表达式，完整版");
                }
        );
        //lambda表达式  简化版
        method(() -> System.out.println("lambda表达式，简化版"));


    }

    public static void method(Swim s) {
        s.swimming();
    }


}

interface Swim {
    void swimming();
}
