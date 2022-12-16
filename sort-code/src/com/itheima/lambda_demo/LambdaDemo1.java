package com.itheima.lambda_demo;

import com.sun.javafx.runtime.async.AbstractRemoteResource;

import java.util.Arrays;
import java.util.Comparator;

//初始lambda表达式
public class LambdaDemo1 {
    public static void main(String[] args) {

        Integer[] arr = {2, 3, 1, 5, 6, 8, 7};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        Arrays.sort(arr,(Integer o1, Integer o2) -> {
            return o1 - o2;
        });

        System.out.println(Arrays.toString(arr));

    }
}
