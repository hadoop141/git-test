package mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式：键值对对象entry

        //三个课堂练习：
        //练习一：利用键值对对象的方武遍历map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
        //练习二：利用键值对对象的方式遍历map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
        //练习三：利用键值对对象的方式遍历map集合，要求：装着键值对对象的单列集合使用lambda表达式的形式进行遍历

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加数据
        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("杨过", "小龙女");

        //3.遍历Map集合的第二种方式：通过键值对对象entry找key 和 value
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //练习一：利用键值对对象的方武遍历map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
        //3.1遍历Set集合，获取每一个entry对象
        for (Map.Entry<String, String> entry : entries) {
            //3.2 调用getKey，getValue方法获取entry对象的key 和 value
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        //练习二：利用键值对对象的方式遍历map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
        /*Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }*/

        //练习三：利用键值对对象的方式遍历map集合，要求：装着键值对对象的单列集合使用lambda表达式的形式进行遍历
        /*entries.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        });*/


    }
}
