package com.itheima.a01mystream;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        /*
            filter      过滤
            limit       获取前几个元素
            skip        跳过前几个元素

            注意：1. 中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
                 2. 修改Stream流中的数据，不会影响原来的集合或者数组中的数据
         */


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        //filter  过滤  留下：姓张的，三个字
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //s:依次表示集合中每一个元素
                //返回值：true 元素留在集合中
                //返回值：false 元素过滤掉
                return s.startsWith("张");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3;
            }
        }).forEach(s -> System.out.println(s));*/

        System.out.println("==============filter==================");

        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

        System.out.println("==============limit==================");

        //limit     获取前几个元素
        // "张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤"
        //获取前三个 打印
        list.stream().limit(3)
                .forEach(s -> System.out.println(s));

        System.out.println("==============skip==================");

        //skip      跳过前几个元素
        //跳过前5个
        list.stream().skip(5)
                .forEach(s -> System.out.println(s));

        System.out.println("==============skip + limit 混合使用1==================");

        //需求：打印  "张三丰","张翠山"
        // "张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤"
        //第一种思路：先获取前6个元素  "张无忌","周芷若","赵敏","张强","张三丰","张翠山"
        //          然后跳过前4个    "张三丰","张翠山"
        list.stream().limit(6)
                .skip(4)
                .forEach(s -> System.out.println(s));

        System.out.println("==============skip + limit 混合使用2==================");

        //第二种思路：先跳过前4个，"张三丰","张翠山","张良","王二麻子","谢广坤"
        //          然后再获取前2个，"张三丰","张翠山"
        list.stream().skip(4)
                .limit(2)
                .forEach(s -> System.out.println(s));


    }
}
