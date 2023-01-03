package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
            班级里有N个学生
            要求：
            被点到的学生不会再被点到。
            但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
         */

        //1.创建集合，存储学生姓名
        ArrayList<String> list1 = new ArrayList<>();
        //5.定义一个集合，存储被删除的元素，这样whlie循环后，就可以获得原集合中所有的元素
        ArrayList<String> list2 = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list1, "范建", "范闲", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼滕", "朱益群", "朱穆朗玛峰", "袁明媛");

        //4.1生成一个随机数，获取集合中的元素
        Random r = new Random();
        //外循环：总共需要点几轮名
        for (int i = 1; i <= 10; i++) {
            System.out.println("=============第" + i + "轮点名==================");
            //3.打乱集合
            Collections.shuffle(list1);
            //4.定义一个循环，用来点名，因为，被点到的学生不会再被点到，所以，还要从集合中删除此元素

            //当集合中还有元素时，说明，还有学生没被点到
            while (list1.size() != 0) {
                int index = r.nextInt(list1.size());
                //4,2删除元素，并获取被删除的元素。
                String name = list1.remove(index);
                //5.1把删除的元素，添加到list2中
                list2.add(name);
                System.out.println(name);
            }
            //whlie循环结束后，把list2中的数据存入到list1中，重新点名
            list1.addAll(list2);
            //把list2集合中的数据清空，方便重新添加
            list2.clear();
        }

    }
}
