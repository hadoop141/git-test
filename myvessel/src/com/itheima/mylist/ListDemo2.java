package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        int result = list.remove(2);
//        System.out.println(result); //3

        Integer i = 2;
        boolean flag = list.remove(i); //true

        System.out.println(list);
    }
}
