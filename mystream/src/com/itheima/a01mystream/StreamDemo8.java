package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        /*
            map     转换流中的数据类型

            注意：1. 中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
                 2. 修改Stream流中的数据，不会影响原来的集合或者数组中的数据

                  "张无忌-28","周芷若-25","赵敏-26","张强-36","张三丰-78","张翠山-48","张良-55"
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-28","周芷若-25","赵敏-26","张强-36","张三丰-78","张翠山-48","张良-55");

        //map     转换流中的数据类型
        //需求：把"张无忌-28"，转化为 28（int） 输出
        //Function<String, Object>
        // 第1个泛型类型：集合中存储的数据类型       第2个泛型类型：你要转换成的数据类型 （默认是Object)
        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //参数s ：集合中每一个数据
                String[] str = s.split("-");
                String ageStr = str[1];
                int age = Integer.parseInt(ageStr);
                //返回值：转换成的数据.
                return age;
            }
        }).forEach(s -> System.out.println(s));*/

        list.stream().map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));

    }
}
