package com.itheima.myset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        LinkedHashSet<Student> lst = new LinkedHashSet<>();

        System.out.println(lst.add(s1));
        System.out.println(lst.add(s2));
        System.out.println(lst.add(s3));
        System.out.println(lst.add(s4));

        /*
            LinkedHashSet:
                        有序:存入的顺序和取出的顺序一样
                        无重复
                        无索引
         */

        System.out.println(lst);
    }
}
