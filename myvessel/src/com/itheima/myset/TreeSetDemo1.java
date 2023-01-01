package com.itheima.myset;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*
            需求: 利用TreeSet存储整数并进行排序
         */

        //1.创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        //2.添加元素
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(1);
        ts.add(5);

        System.out.println(ts);
    }
}
