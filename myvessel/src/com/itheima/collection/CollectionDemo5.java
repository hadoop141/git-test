package com.itheima.collection;

/*
 * Collection遍历集合的三种方式，
 * 1.迭代器遍历
 * 2.增强for遍历
 * 3.lambda表达式遍历
 */


import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo5 {
    public static void main(String[] args) {
        /*
         * 增强for格式 ：
         *    for(数据类型 变量名: 集合/数组){
         *
            }

         */
        //创建集合，添加数据
        Collection<String> collection = new ArrayList<>();
        collection.add("zhangsan");
        collection.add("lisi");
        collection.add("wangwu");

        //增强for遍历
        for (String s : collection) {
            //注意：修改增强for中的变量的值，不会影响集合或数组中的数据
            s = "qqq";
        }

        System.out.println(collection);



    }
}
