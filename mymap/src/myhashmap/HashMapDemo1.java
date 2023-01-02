package myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo1 {
    public static void main(String[] args) {
        //需求:
        //创建一个HashMap集合，键是学生对象(Student),值是籍贯(String)。
        //存储三个键值对元素，并遍历
        //要求：同姓名，同年龄认为是同一个学生

        //1.创建HashMap集合对象
        HashMap<Student, String> map = new HashMap<>();


        //2创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("王五", 25);

        //3.添加元素
        map.put(s1, "北京");
        map.put(s2, "上海");
        map.put(s3, "武汉");
        map.put(s4, "南京");

        //4.遍历
        //通过lambda表达式遍历
        /*map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String address) {
                System.out.println(student + " = " + address);
            }
        });*/
        map.forEach((student, address) -> System.out.println(student + " = " + address));

        System.out.println("----------------");

        //通过键找值遍历
        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("----------------");

        //通过键值对对象entry遍历
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}
