package com.itheima;


import java.util.Arrays;
import java.util.Random;

public class BubbleSortDemo {
    public static void main(String[] args) {
         /*
            冒泡排序：
            核心思想：
            1，相邻的元素两两比较，大的放右边，小的放左边。
            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
        */
        int[] arr = {2, 4, 5, 3, 1};
//        int[] arr = new int[100000]; //10,000  234ms  100,000  28813ms
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt();
//        }
//        long start = System.currentTimeMillis();
//        bubbleSort(arr);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        //外循环 总共要比较 arr.length-1 趟
        for (int i = 1; i <= arr.length - 1; i++) {

            // 一开始 {2, 4, 5, 3, 1} 两两比较要比较 四次
            //内循环 第一次要比较 arr.leng -1次   经过一次循环变成了  {2, 4, 3, 1, 5}
            //内循环 第二次要比较 arr.leng -2次   比较3次 前四个数比较，最后一个数不比较
            // ..... 最后一次要比较 arr.length - (arr.length-1)
            //也就是剩下两个数 比较一次

            for (int j = 0; j < arr.length - i; j++) {
                //-1 : 为了防止索引越界 arr[j] arr[j+1]
                //如果前一个数 > 后一个数 就交换位置
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }


        }
    }


}
