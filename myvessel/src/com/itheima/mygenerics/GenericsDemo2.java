package com.itheima.mygenerics;

import java.util.ArrayList;

/*
        定义一个工具类：ListUtil
        类中定义一个静态方法addAll，用来添加多个集合的元素。
     */
public class GenericsDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbb");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2,2,23,25,485);
        System.out.println(list2);



    }
}
