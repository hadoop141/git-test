package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
        /*
           void forEach()       遍历
           long count()         统计Stream流中的元素的个数
           toArray()            收集流中的数据，存到数组中
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        //void forEach()       遍历
        //返回值 void      Stream流的终结方法

        //Consumer中的泛型：Stream流中元素的数据类型
        //accept方法：参数s、Stream流中每一个元素
        /*list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //list.stream().forEach(s -> System.out.println(s));

        //long count()      统计Stream流中的元素的个数

        //toArray()     收集流中的数据，存到数组中
        //不传参，返回一个Object类型的数组

        //Object[] arr1 = list.stream().toArray();
        //System.out.println(Arrays.toString(arr1));

        //IntFunction接口中的泛型：具体类型的数组
        //apply方法的形参：Stream流中的数据的个数，要和数组的长度保持一致
        //apply方法的返回值：你要创建什么类型的数组，
        //方法体：创建数组

        //toArray方法的参数的作用：负责创建一个指定类型的数组
        //toArray方法的底层：会依次得到Stream流里面的每一个元素，并把元素存到创建的数组中
        //toArray方法的返回值：是一个存着Stream流里所有元素的数组
       /* String[] str = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            //value：Stream流中所有元素的个数
            public String[] apply(int value) {
                return new String[value];
            }
        });*/
        //System.out.println(Arrays.toString(str));

        String[] str = list.stream().toArray(count -> new String[count]);
        System.out.println(Arrays.toString(str));

    }
}
