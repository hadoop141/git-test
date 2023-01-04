package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * stream流的使用步骤：
 * 1.先得到一条Stream流（流水线），并把数据放上去
 * 2.利用Stream流中的API进行各种操作
 * 中间方法：过滤，转换  方法调用完毕之后，还可以调用其他方法.
 * 终结方法：统计，打印   最后一步，调用完毕之后，不能调用其他方法.
 * 2.1 使用中间方法，对流水线上的数据进行操作
 * 2.2 使用终结方法，对流水线上的数据进行操作
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        /*
        单列集合      default Stream<E> stream()                            Collection中的默认方法
        双列集合      无                                                   无法直接使用stream流
        数组          public static<T> Stream<T> stream(T[] array)          Arrays工具类中的静态方法
        一堆零散数据     public static<T> Stream<T> of(T...values)            Stream接口中的静态方法
         */

        //单列集合
        //1.创建单列集合
        ArrayList<String> list = new ArrayList<>();
        //1.2添加数据
        Collections.addAll(list, "a", "bbb", "ccc", "d");

        //2.获取stream流,一般用的是链式编程
        //Stream<String> stream = list.stream();

        //3，调用stream流的api，对集合进行操作
        /*stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s:集合中每一个元素
                //函数式接口，可以用lambda表达式
                System.out.println(s);
            }
        });*/
        list.stream().filter(s -> s.length() == 3).forEach(s -> System.out.println(s));


    }
}
