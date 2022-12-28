package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        /*
            List系列集合独有方法
                void add(int index, E element)          在此集合中的指定位置插入指定的元素
                E remove(int index)                     删除指定索引出的元素，返回被删除的元素
                E set(int index,E element)              修改指定索引出的元素，返回被修改的元素
                E get(int index)                        返回指定索引出的元素

         */
        //1.创建一个List集合对象
        List<String> list = new ArrayList<>();

        //2. 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //3.在指定索引添加元素,原来的元素依次向后移动
        //void add(int index, E element)
        list.add(1,"QQQ");

        //4.E set(int index,E element)
        //修改指定索引出的元素，返回被修改的元素
        String s1 = list.set(0, "AAAA");
        System.out.println(s1); //aaa

        System.out.println(list);
    }
}
