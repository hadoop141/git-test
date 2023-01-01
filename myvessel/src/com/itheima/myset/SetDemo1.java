package com.itheima.myset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        /*
            利用Set系列的集合，添加字符串，并用多种方式遍历。
            迭代器
            增强for
            Lambda表达式
         */

        //1.创建一个Set对象
        Set<String> set = new HashSet<>();

        //2.添加元素
        //如果当前元素第一次添加，返回值为 true
        //如果当前元素不是第一次添加，返回值为 false

//        boolean r1 = set.add("aaa");
//        boolean r2 = set.add("aaa");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");


//        System.out.println(r1);//true
//        System.out.println(r2);//false

        //无序，不重复，无索引
        System.out.println(set);//[aaa, ccc, bbb]

        //迭代器遍历
        /*Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/

        //增强for遍历
       /* for (String s : set) {
            System.out.println(s);
        }*/

        //Lambda表达式
        set.forEach(s -> System.out.println(s));

    }
}
