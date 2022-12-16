package com.itheima.lambda_demo;

import com.sun.javafx.runtime.async.AbstractRemoteResource;

import java.util.Arrays;
import java.util.Comparator;

//初识lambda表达式
public class LambdaDemo1 {
    public static void main(String[] args) {

        Integer[] arr = {2, 3, 1, 5, 6, 8, 7};      
//        Arrays.sort(arr, new Comparator<Integer>() { //匿名内部类
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;           // 升序
//            }
//        });

        //lambda表达式 
        Arrays.sort(arr,(Integer o1, Integer o2) -> {
            return o1 - o2;
        });
        
        //lambda表达式 简化版
        //小括号：形参的数据类型可以省略不写，如果只有一个参数，可以省略括号
        //大括号：如果方法体只有一行，可以省略大括号（方法体），return 和分号 （注意：如果省略，必须三者同时省略）
        Arrays.sort(arr,(o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));

    }
}
