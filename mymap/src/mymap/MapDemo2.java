package mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的遍历方式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加数据
        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("杨过", "小龙女");

        //3.遍历Map集合的第一种方式：通过键找值

        //3.1获取Map集合中所有的key，存入到一个单列Set集合中
        Set<String> keys = map.keySet();
        //3.2遍历Set集合，获取单列集合中所有的value  get
        for (String key : keys) {
            //System.out.println(key);
            String value = map.get(key);
            System.out.println(key + "=" + value);

        }

        /*
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }*/

        /*keys.forEach(key -> {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        });*/
    }
}
