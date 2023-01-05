package com.itheima.static_singleinstance;

public class Test1 {
    public static void main(String[] args) {
        //测试 饿汉单例

        //创建2个单例对象
        SingleInstanceDemo1 s1 = SingleInstanceDemo1.instance;
        SingleInstanceDemo1 s2 = SingleInstanceDemo1.instance;

        //比较它们的地址值是否相同
        System.out.println(s1 == s2);//true
    }
}
