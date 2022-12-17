package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    //目标：学习collection接口的一些方法
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        //1.添加 add（）
        //细节：如果我们要往list系列集合中添加元素，那么返回值一定是true 因为list系列集合是 有序，有索引，可重复
        //如果是set集合，那么不一定，因为set是无序，无索引，不重复
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println(collection);

        //3.删除 remove（）
        //注意：因为这里演示的是Collection接口的共性方法，所以不能通过索引删除
        //返回值：boolean类型，
        collection.remove("aaa");

        //4.判断集合是否包含元素 contains（）,返回值 boolean
        //细节：底层是依赖equals方法来判断是否存在
        //注意：如果集合中存储的是自定义对象，要调用contains方法判断是否包含元素时，一定要重写javabean的equals方法
        boolean result = collection.contains("bbb");
        System.out.println(result);


        //2.清空 clear（）
        //collection.clear();
        System.out.println(collection);


        //5.判断集合是否为空isEmpty()
        System.out.println(collection.isEmpty());

        //6.获取集合中的长度 size()
        System.out.println(collection.size());

    }
}
