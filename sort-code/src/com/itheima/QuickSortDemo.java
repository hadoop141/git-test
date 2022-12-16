package com.itheima;

import java.util.Arrays;

/**
 * 算法步骤：
 * 1. 从数列中挑出一个元素，一般都是左边第一个数字，称为 "基准数";
 * 2. 创建两个指针，一个从前往后走，一个从后往前走。
 * 3. 先执行后面的指针，找出第一个比基准数小的数字
 * 4. 再执行前面的指针，找出第一个比基准数大的数字
 * 5. 交换两个指针指向的数字
 * 6. 直到两个指针相遇
 * 7. 将基准数跟指针指向位置的数字交换位置，称之为：基准数归位。
 * 8. 第一轮结束之后，基准数左边的数字都是比基准数小的，基准数右边的数字都是比基准数大的。
 * 9. 把基准数左边看做一个序列，把基准数右边看做一个序列，按照刚刚的规则递归排序
 */

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 6, 2, 7, 9, 3, 4, 5, 1, 10, 8};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    /*
     *   参数一：我们要排序的数组
     *   参数二：要排序数组的起始索引
     *   参数三：要排序数组的结束索引
     *   返回值： void
     */
    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量，记录要查找的范围
        int start = i;
        int end = j;

        //递归出口，当start指针在end指针后面的时候，递归结束
        if(start > end){
            return;
        }
        //记录基准数
        int baseNumber = arr[i];
        //利用循环找到要交换的数字
        while (start != end) {
            //一定要从end指针开始，不能从start开始

            //end从后往前遍历，遇到比基准数baseNumber 小的 停下来
            //或者当两个指针相遇的时候，就停下来
            while (true) {
                if (end == start || arr[end] < baseNumber) {
                    break;
                }
                end--;//end指针向前移动
            }

            while (true) {
                //start从前往后开始遍历，遇到比基准数大的停下来
                if (end == start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            //两个指针都停下来了，交换数据
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        //循环结束，start 和 end 指向同一个数
        //让基准数baseNumber和 start指针指向的数 交换
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        //这样 基准数baseNumber左边的 就是比 他小的数， 右边，就是 比它大的数
        //再让左边的数据重复上面的步骤，也就是调用自己本身的方法 ，递归
        quickSort(arr, i , start - 1);
        //右边同样
        quickSort(arr, start + 1, j);


    }


}
