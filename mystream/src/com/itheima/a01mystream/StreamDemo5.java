package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo5 {
    public static void main(String[] args) {
        /*
        Stream<T> filter(Predicate<?super T>predicate)   过滤
        Stream<T> limit(long maxSize)                    获取前几个元素
        Stream<T> skip (long n)                           跳过前几个元素
        Stream<T> distinct()                             元素去重，依赖(hashCode和equals:方法)
        static<T> Stream<T> concat(Stream a,Stream b)    合并a和b两个流为一个流
        Stream<R> map(Function<T,R>mapper)               转换流中的数据类型

        注意：1. 中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
             2. 修改Stream流中的数据，不会影响原来的集合或者数组中的数据
         */

        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据    "张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤"
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        //filter    过滤
        //需要：姓张的,三个字，其他的数据过滤不要
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

    }
}
