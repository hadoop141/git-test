package com.itheima.myset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        /*
            需求：请自行选择比较器排序和自然排序两种方式：
            要求：存入四个字符串，“c”,“ab”,“df”,“qwer”
            按照长度排序，如果一样长则按照首字母排序

            采取第二种排序方法: 比较器排序
         */

        //o1:表示当前要添加的元素
        //o2:表示已经在红黑树存在的元素
        //返回值规则跟之前是一样的
        /*TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照长度排序
                int i = o1.length() - o2.length();
                // 如果一样长则按照首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;

            }
        });*/

        //Comparator接口是函数式接口，可以用Lambda表达式
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
                //按照长度排序
                int i = o1.length() - o2.length();
                // 如果一样长则按照首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}