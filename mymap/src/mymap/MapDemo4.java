package mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        //Map集合遍历的第三种方式：lambda表达式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加数据
        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("杨过", "小龙女");

        //方式三：利用lambda表达式遍历
        //forEach
        //底层：其实就是利用第二种方式遍历，依次得到每一个entry对象
        //再获取键和值，调用accept方法，传递key和value
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });
        System.out.println("---------------");

        map.forEach((key, value) -> System.out.println(key + " = " + value));
        System.out.println("---------------");


    }
}
