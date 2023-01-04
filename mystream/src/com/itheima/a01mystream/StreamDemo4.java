package com.itheima.a01mystream;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //一堆零散数据   public static<T> Stream<T> of(T...values)   Stream接口中的静态方法
        Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));

        System.out.println("=============================");

        //Stream.of(1,"a",'b',1l).forEach(s -> System.out.println(s));

        Stream.of("a","bb","cc").forEach(s -> System.out.println(s));
    }
}
