package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型，集合如何存储数据
        //结论：
        //如果没有为集合指定泛型，默认为Object,此时可以往集合中添加任意类型的数据
        //但是，注意：如果我们获取到的数据无法调用它本身独有的方法，只能调用Object有的，
        //而且，我们即使想要强转也因为数据类型太多，导致一个一个转换，太麻烦了

        //此时推出了泛型，可以在添加数据的时候就把类型统一
        //这样我们获取的数据类型，就是确定的，方便操作
        ArrayList<String> list = new ArrayList();

        //2.添加数据,没规定泛型，可以加任意类型的数据 Object
        list.add("aaa");
        list.add("bbb");
        //list.add(222);

        /*for (Object o : list) {
            //多态的弊端：不能调用子类特有的方法
            System.out.println(o);
        }*/
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list);

    }
}
