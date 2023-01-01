package com.itheima.myset;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",28);
        Student s2 = new Student("张三",28);

        //2.1如果没有重写hashCode()方法，不同对象计算的哈希值是不同的。
       /* System.out.println(s1.hashCode()); //460141958
        System.out.println(s2.hashCode()); //1163157884*/

        //2.2如果重写了hashCode()方法，不同对象，如果属性值相同，计算的哈希值也是相同的。
        System.out.println(s1.hashCode()); //24022548
        System.out.println(s2.hashCode()); //24022548

        //2.3 但是在小部分情况下，不同的属性值或者不同的地址值，计算出来的哈希值也有可能一样。（哈希碰撞）
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354

    }
}
