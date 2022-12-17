package com.itheima.test;

public class MonkeyEatPeach {

    public static void main(String[] args) {
        System.out.println(eat(10));
    }


    /*
      猴子每天吃一堆香蕉的一半，加一根，吃到第十天（第十天还没吃）只剩一根，求这堆香蕉原来有多少
     * 从后往前推
      x:前一天的香蕉数，y：当天的香蕉数
      x - （x/2 + 1）= y
      --》 x = ( y +1 ) * 2
          x = 2 * y + 2
     * 第十天 ： 1 根香蕉
     * 第九天 ： 4 根香蕉
     *
     * 规律：（ 当天剩的香蕉数 + 1 ）* 2 = 前一天的香蕉数
     */
    //到第i天的的时候，猴子吃的只剩一根香蕉
    private static int eat(int i) {
        if (i == 1) {
            return 1;
        }
        return 2 * eat(i - 1) + 2;

    }

}
