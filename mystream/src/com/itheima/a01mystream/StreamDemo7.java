package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        /*
            distinct        元素去重，依赖(hashCode和equals方法)
            concat         合并a和b两个流为一个流,Stream流的静态方法

              注意：1. 中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
                   2. 修改Stream流中的数据，不会影响原来的集合或者数组中的数据
         */

        //1.创建集合，添加元素
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","张无忌","张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","张良","张良","王二麻子","谢广坤");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张三","李四");

        System.out.println("==================distinct=====================");

        //distinct        元素去重，依赖(hashCode和equals方法)
        //如果是自定义对象，调用此方法，一定要重写hashCode和equals方法
        list1.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("==================concat=====================");

        //concat         合并a和b两个流为一个流,Stream流的静态方法
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));

    }
}
