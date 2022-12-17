package com.itheima.test;

public class Test2 {

    public static void main(String[] args) {
        System.out.println(test(20));
    }


    private static int test(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return test(n - 1) + test(n - 2) + test(n - 3);
    }

}
