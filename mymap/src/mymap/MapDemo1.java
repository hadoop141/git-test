package mymap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        /*
        V put(K key,V value)                添加元素
        V remove(object key)                根据键别除键值对元素
        void clear()                        移除所有的键值对元素
        boolean containsKey(object key)     判断集合是否包含指定的键
        boolean containsValue(object value) 判断集合是否包含指定的值
        boolean isEmpty()                   判断集合是否为空
        int size()                          集合的长度，也就是集合中键值对的个数
        */

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        //put方法的细节：添加/覆盖
        //在添加数据的时候，如果key不存在，那么直接把键值对对象添加到集合当中,返回值为null
        //如果key存在，那么后面添加的value覆盖前面的value，返回值为原来的value
        //注意：put方法添加数据时，key 和 value都可以为null
        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("杨过", "小龙女");
        //map.put(null,null);

        //String value = map.put("韦小宝", "双儿");
        //System.out.println(value);

        //V remove(object key)                根据键别除键值对元素
        //String result = map.remove("郭靖");//黄蓉
        //System.out.println(result);

        //void clear()                        移除所有的键值对元素
        //map.clear();//{}

        //判断是否包含containsKey,containsValue
        //boolean key = map.containsKey("郭靖");
        //System.out.println(key);

        //boolean v = map.containsValue("小龙女");
        //System.out.println(v);

        //判断集合是否为空isEmpty
        //boolean result = map.isEmpty();
        //System.out.println(result);

        //集合的元素个数size
        int size = map.size();
        System.out.println(size);

        //3.打印集合
        System.out.println(map);

    }
}
