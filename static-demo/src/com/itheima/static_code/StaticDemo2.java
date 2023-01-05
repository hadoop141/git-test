package com.itheima.static_code;

public class StaticDemo2 {

    /**
     * 实例代码块:创建对象时，执行，（很少使用，了解）
     * 注意:在构造器前面，执行。也就是说，等它执行完后，再调用构造器生成对象
     * 作用:初始化实例资源
     */ {
        System.out.println("--------------实例代码块被执行了----------------");
    }

    public StaticDemo2() {
        System.out.println("--------------无参构造器被执行了----------------");
    }

    public static void main(String[] args) {
        //目标：理解普通代码块，也叫实例代码块
        System.out.println("--------------main方法被执行了----------------");

        //每创建一个对象，实例代码块，就执行一次
        StaticDemo2 s1 = new StaticDemo2();
        System.out.println("------------------");
        StaticDemo2 s2 = new StaticDemo2();

    }


}
