package com.itheima.a01myexception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        /*
          Exception在代码的两个作用：
                1.异常是用来查询bug的关键参考信息
                2.异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
         */

        Student s = new Student("张三,23");
        System.out.println(s.getName());

    }
}
