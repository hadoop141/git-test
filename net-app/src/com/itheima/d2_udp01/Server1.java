package com.itheima.d2_udp01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server1 {
    public static void main(String[] args) throws Exception {
        //服务端：接收数据，先启动服务端，等待接收客户端发送的数据
         /*
            服务端接收数据的步骤：
                步骤1：创建接收端对象（套接字：用于发送和接收数据报包对象），指定端口号开放    人
                步骤2：创建数据包对象（韭菜盒子）,封装接受的数据报
                步骤3：等待接收数据
                步骤4：取出数据，接多少，取多少
                步骤5：释放资源

            举例子来说：
                就像一个人（DatagramSocket）拿着装着韭菜（byte[]）的韭菜盒子（DatagramPacket）,
                等待别人（DatagramSocket）把装着韭菜（byte[]）的韭菜盒子DatagramPacket）给我，
                就像收礼，我收的其实是礼盒里面的礼品，但是我不能把礼品直接暴露在外面，
                我要拿着一个我专门收藏珍贵礼品的礼品盒，来装这个礼品。
         */

        System.out.println("-------服务端启动-------");

        //1.创建接收端对象（套接字：用于发送和接收数据报包对象），指定服务端端口号     人
        DatagramSocket socket = new DatagramSocket(8888);
        //2.创建数据报包对象,接收数据 (韭菜盒子)，指定数据包长度
        byte[] buffer = new byte[1024 * 60];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        //3.等待接收数据
        socket.receive(packet);
        //4.取出数据，收多少，取多少
        int len = packet.getLength();//返回发送数据或接收数据的长度
        String data = new String(buffer,0,len);
        System.out.println(data);

        //获取发送端的ip，端口
        InetAddress ip = packet.getAddress();
        int port = packet.getPort();
        System.out.println(ip + " " + port);

        //5.释放资源
        socket.close();
    }
}
