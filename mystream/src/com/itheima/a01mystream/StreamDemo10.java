package com.itheima.a01mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        /*
            collect(Collector collector)           把Stream流中的元素，存到集合中（List，Set，Map）
            注意点：
                如果我们要将数据存储到Map集合中时，键不能重复
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-25", "周芷若-女-23", "赵敏-女-24", "张强-男-40",
                "张三丰-男-77", "张翠山-男-45", "张良-男-46", "王二麻子-男-55", "谢广坤-男-58");

        //存储元素到list集合中
        //需求：存储所有的女性
        List<String> collectList = list.stream().filter(s -> "女".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("=============================");

        //存储元素到Set集合中,可以去重,无序
        //需求：存储所有的女性
        Set<String> collectSet = list.stream().filter(s -> "女".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("=============================");

        //存储元素到Map集合中  键：名字 值：年龄  如：周芷若=23
        //需求：存储所有的女性

        /**
         * Collectors的toMap方法的两个参数：
         *
         *      参数一：Map的键
         *
         *      第一个Function的泛型：
         *           泛型一：Stream流中的元素的数据类型
         *           泛型二：Map集合中的键的数据类型
         *
         *           apply方法的形参s:Stream流中每一个元素  "周芷若-女-23"
         *           apply方法的方法体：获取Map集合的键
         *           apply方法的返回值：Map集合中的键
         *
         *      参数二：Map的值
         *
         *      第二个Function的泛型：
         *          泛型一：Stream流中的元素的数据类型
         *          泛型二：Map集合中的值的数据类型
         *
         *          apply方法的形参s:Stream流中每一个元素
         *          apply方法的方法体：获取Map集合的值
         *          apply方法的返回值：Map集合中的值
         *
         */

        Map<String, Integer> collectMap = list.stream().filter(s -> "女".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                String[] str = s.split("-");
                                return str[0]; //周芷若
                            }
                        },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                String[] str = s.split("-");
                                return Integer.parseInt(str[2]);
                            }
                        }
                ));
        System.out.println(collectMap);

        System.out.println("==============================");

        Map<String, Integer> collectMap1 = list.stream().filter(s -> "女".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(collectMap1);


    }
}
