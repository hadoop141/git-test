package com.itheima.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertDemo {
    public static void main(String[] args) {
         /*
            插入排序：
                将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
                遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
                N的范围：0~最大索引

        */
        //1. 创建一个数组
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = new int[100000]; // 10,000 47ms 100,000 2823ms
//
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt();
//        }
//        long start = System.currentTimeMillis();
//        insertSort(arr);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


        insertSort(arr);

        System.out.println(Arrays.toString(arr));


        /*//2.遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //问题：如何把遍历到的数据，插入到前面有序的这一组当中

            //记录当前要插入数据的索引
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                //交换位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }*/

    }

    private static void insertSort(int[] arr){
        //定义一个索引，作为无序数组的起始索引，即要从此索引开始排序
        int startIndex = -1;
        //定义一个信号变量，判断数组是否无序,默认有序，不进入while循环
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // 数组无序 无序的起始索引是 i+1
                startIndex = i + 1;
                flag = true;//信号变量变为true，数组无序。
                break;
            }
        }
        //数组无序，进入循环，排序
        while (flag) {
            //外层循环，比较多少次
            for (int i = startIndex; i < arr.length; i++) {
                //内层循环，把无序的数据同前面有序的数据 从前往后遍历，
                // 如果当前数据比有序数据中最后一个数据大或者相等，则将当前数据挂在所比较数据的后面，内循环结束
                //如果 当前数据 < 最后一个数据，则继续和它前面的数据比较
                // 以此类推，直到遍历完整个有序数据

                for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
            //退出循环
            flag = false;
        }
    }
}
