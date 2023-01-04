package com.itheima.a01mystream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo2 {
    public static void main(String[] args) {
        //双列集合      无     无法直接使用stream流
        HashMap<String, Integer> hm = new HashMap<>();
        //添加数据
        hm.put("aaa",1);
        hm.put("bb",2);
        hm.put("cc",3);
        hm.put("dddd",4);

        //双列集合，无法直接使用Stream流
        //第一种方式：调用keySet方法，变为单列Set集合，存储所有的键key，
        //          Set<String> keys = hm.keySet();
        //          再获得Stream流，对数据进行操作
        hm.keySet().stream().forEach(key -> System.out.println(key + "=" + hm.get(key)));

        System.out.println("------------------------------");

        //第二种方式：调用entrySet方法，变为单列Set集合，存储所有的键值对对象entry
        //          Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        //          再获得Stream流，对数据进行操作
       hm.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }
}
