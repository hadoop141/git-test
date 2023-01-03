package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*
            班级里有N个学生，学生属性：姓名，年龄，性别。
            实现随机点名器。
         */

        //1.创建一个集合，来装学生
        ArrayList<String> list = new ArrayList<>();

        //2.调用Collections的addAll方法，添加数据到集合中。
        Collections.addAll(list, "范建", "范闲", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼滕", "朱益群", "朱穆朗玛峰", "袁明媛");

        //3.随机点名
        //方法一：生成一个随机数，当做集合的索引，再通过索引获取集合的元素。
        /*Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);*/

        //方法二：通过工具类Collections的shuffle方法打乱集合，直接获取0索引位置的元素
        // 或者，再用方法一，获取随机数，这样就更随机了
        Collections.shuffle(list);
        //String name = list.get(0);
        //System.out.println(name);
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);



    }
}
