package com.itheima.static_singleinstance;

public class Test2 {
    public static void main(String[] args) {
        //测试 懒汉单例

        //1.创建2个单例对象
        SingleInstanceDemo2 s1 = SingleInstanceDemo2.getInstance();
        SingleInstanceDemo2 s2 = SingleInstanceDemo2.getInstance();

        //比较是否为同一对象
        System.out.println(s1 == s2);//true
    }
}
