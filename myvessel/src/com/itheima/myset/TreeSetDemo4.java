package com.itheima.myset;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        /*需求：创建5个学生对象
            属性：（姓名，年龄，语文成绩，数学成绩，英语成绩），
            按照总分从高到低输出到控制台
            如果总分一样，按照语文成绩排
            如果语文一样，按照数学成绩排
            如果数学成绩一样，按照英语成绩排
            如果英文成绩一样，按照年龄排,年龄小的排前面
            如果年龄一样，按照姓名的字母顺序排
            如果都一样，认为是同一个学生，不存
        */

        Student2 s1 = new Student2("zhangsan",23,100,100,90);
        Student2 s2 = new Student2("lisi",24,100,95,95);
        Student2 s3 = new Student2("wangwu",25,100,95,95);
        Student2 s4 = new Student2("zhangsan",23,100,100,90);
        Student2 s5 = new Student2("zhaoliu",26,100,100,100);

        TreeSet<Student2> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}
