package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //列表迭代器
        ListIterator<String> lt = list.listIterator();
        while (lt.hasNext()){
            String s = lt.next();
            if ("bbb".equals(s)){
                lt.add("qqq");
            }
            //System.out.println(s);
        }
        System.out.println(list);
    }
}
