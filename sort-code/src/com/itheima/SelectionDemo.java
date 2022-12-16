package com.itheima;

import java.util.Arrays;
import java.util.Random;

public class SelectionDemo {
    public static void main(String[] args) {
         /*
            选择排序：
                1，从0索引开始，跟后面的元素一一比较。
                2，小的放前面，大的放后面。
                3，第一次循环结束后，最小的数据已经确定。
                4，第二次循环从1索引开始以此类推。

         */
        int[] arr = {2, 4, 5, 3, 1, 6};

//        int[] arr = new int[100000]; // 10,000 190ms 100,000 24342ms
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt();
//        }
//        long start = System.currentTimeMillis();
//        selectSort(arr);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


        selectSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void selectSort(int[] arr){

        //外循环 循环 arr.length-1 次
        //i ： 每次拿着数组中那个数据 arr[i] 和 后面的数据作比较
        for (int i = 0; i < arr.length-1; i++) {
            //内循环：每一轮我要干什么事情？
            //内循环 ：每次把数组中i索引的值arr[i]和后面的值比较，把小的放在前面
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){ //如果后面的值 比arr[i] 小 就让他们交换位置，再继续和后面的值比较
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
