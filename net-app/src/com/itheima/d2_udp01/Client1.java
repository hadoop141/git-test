package com.itheima.d2_udp01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class Client1 {
    public static void main(String[] args) throws Exception {
        //客户端：发送数据
        /*
            客户端发送数据的步骤：
                步骤1：创建发送端对象（套接字：用于发送和接收数据报包对象），可以省略端口号，由java虚拟机自动分配    人
                步骤2：封装要发送的数据（韭菜）
                步骤3：创建数据包对象（韭菜盒子）,封装数据报
                步骤4：发送数据
                步骤5：释放资源

            举例子来说：
                就像一个人（DatagramSocket）拿着装着韭菜（byte[]）的韭菜盒子（DatagramPacket）,
                准备把韭菜盘子（DatagramPacket）送出去，
                就像送礼，我送的其实是礼盒里面的礼品，但我不能单送礼品，这样礼品看着太简陋了，
                只要我们包装一下，就看着高级多了，多有面子。
         */

        System.out.println("-------客户端启动-------");

        //1.创建发送端对象（套接字：用于发送和接收数据报包对象），可以省略端口号，由java虚拟机自动分配
        DatagramSocket socket = new DatagramSocket();
        //2.创建数据报包对象，指定数据包长度，服务端ip，端口
        String msg = "你好啊，服务器，我来发消息了";
        byte[] buffer = msg.getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, ip, 8888);

        //3.发送数据
        socket.send(packet);

        //4.释放资源
        socket.close();
    }
}
