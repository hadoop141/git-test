package com.itheima.a01myexception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
            测试自定义异常
         */
        //1.创建一个女朋友对象
        GirlFriend girlFriend = new GirlFriend();
        //2.定义一个Scanner对象，接收键盘录入的东西
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("请输入你女朋友的姓名：");
                String name = sc.nextLine();
                girlFriend.setName(name);

                System.out.println("请输入你女朋友的年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                girlFriend.setAge(age);

                //当执行到这一步时，说明name 和 age都符合规范，可以退出循环
                break;
            } catch (NumberFormatException | AgeOutOfBoundsException | NameFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println(girlFriend);


    }
}
