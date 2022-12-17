package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/*
 * Collection遍历集合的三种方式，
 * 1.迭代器遍历
 * 2.增强for遍历
 * 3.lambda表达式遍历
 */
public class CollectionDemo6 {
    public static void main(String[] args) {
       /*
          lambda表达式遍历：
                default void forEach(consumer<? super T> action);

        */
        //1.创建集合，添加元素
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");

        //利用匿名内部类的形式
        //底层原理：
        //其实也会自己遍历集合，依次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //s依次表示集合中的每一个数据
        /*collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //lambda表达式
        /*collection.forEach((s) -> {
            System.out.println(s);
        });*/
        //lambda表达式，简化版
        collection.forEach(s -> System.out.println(s));


    }
}
