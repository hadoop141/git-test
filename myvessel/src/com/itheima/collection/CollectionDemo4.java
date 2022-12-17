package com.itheima.collection;

/*
 * Collection遍历集合的三种方式，
 * 1.迭代器遍历
 * 2.增强for循环遍历
 * 3.lambda表达式遍历
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
    public static void main(String[] args) {
        /*
          迭代器遍历相关的三种方法：
               Iterator<E> iterator()  :  获取一个迭代器对象
               boolean  hasNext()      :  判断当前指向的位置是否有元素
               E next()                :  获取当前指向的元素，并向后移动指针
          迭代器的细节注意点：
               1.如果当前位置没有元素，还要强行获取，会报错NoSuchElementException
               2.迭代器遍历完毕，指针不会复位
               3.循环只能用一次next方法
               4.迭代器遍历时，不能使用集合的添加和删除方法
                    如果想删除元素，可以使用Iterator迭代器的remove方法

         */


        //1. 创建一个集合对象,添加元素
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");

        //2. 获取迭代器对象
        //迭代器就好像是一个指针，默认指向集合的第一个元素
        Iterator<String> iterator = collection.iterator();

        //利用循环，获取集合中的所有元素
        while (iterator.hasNext()) { //判断集合中是否有元素
            String s = iterator.next();//获取元素，移动指针
            if ("bbb".equals(s)){  //删除bbb
                iterator.remove();
            }
            System.out.println(s);
        }

        System.out.println(collection);

        //当上面的循环结束后，迭代器的指针指向集合的没有元素的位置
        //System.out.println(iterator.next()); //NoSuchElementException





    }
}
