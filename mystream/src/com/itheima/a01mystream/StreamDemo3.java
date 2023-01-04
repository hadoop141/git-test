package com.itheima.a01mystream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //数组   public static<T> Stream<T> stream(T[] array)   Arrays工具类中的静态方法
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        String[] arr2 = {"a","b","c"};

        //创建Stream流
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        System.out.println("======================");

        Arrays.stream(arr2).forEach(s -> System.out.println(s));

        //Stream接口的静态方法of 可以传一堆零散的数据，也可以传数组
        //但是数组必须是引用类型的数组，不能是基本类型的数组
        //如果传的是基本类型的数组，那么静态方法of会把数组当作一个元素
        Stream.of(arr1).forEach(s -> System.out.println(s));// [I@448139f0



    }
}
