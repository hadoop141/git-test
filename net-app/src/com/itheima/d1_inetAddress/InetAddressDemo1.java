package com.itheima.d1_inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：了解InetAddress类的一些API

        //1.获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();// 本机名/局域网ip地址
        //1.1获取主机名，主机ip（局域网ip）
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2.通过域名，获取ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //3.通过公网ip,获取ip对象
        InetAddress ip3 = InetAddress.getByName("14.215.177.38");
        System.out.println(ip3.getHostAddress());
        System.out.println(ip3.getHostName());

        //3.判断与该ip地址是否对象ping通  5s之内是否ping通
        System.out.println(ip2.isReachable(5000));
    }
}
