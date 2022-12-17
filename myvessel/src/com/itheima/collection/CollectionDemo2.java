package com.itheima.collection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<Student> collection = new ArrayList<>();
        //创建几个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wangwu",25);

        //添加到集合中
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);

        Student s4 = new Student("zhangsan",23);
        //contains方法底层依赖的是equals方法
        //如果contains中比较的是自定义对象，且javabean中没有重写equals方法，那么collection调用的是Object类中的equals方法
        //而Object类中的equals方法比较的是地址值，

        //需求：如果学生的姓名和年龄都相同，那么我们认为是同一个人。
        //方法：重写Student类的equals方法
        System.out.println(collection.contains(s4)); // true

    }
}
