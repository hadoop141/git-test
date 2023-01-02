package myhashmap;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //需求
        //某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D)
        //每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。

        //1.需要先让同学们投票
        //定义一个数组，存储景点
        String[] arr = {"A", "B", "C", "D"};
        //创建一个List集合，存储同学们投票的结果
        List<String> list = new ArrayList<>();
        //定义一个随机变量
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            //得到一个随机数，作为数组的索引，再获得索引对应的数据，添加到List集合中
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //2.如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义map集合，利用集合进行统计。
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            //如果Map集合包含key，也就是集合中有人投了这个景点
            //获取这个景点的票数count，把票数count加一，再存入集合
            if (map.containsKey(s)) {
                int count = map.get(s);
                count++;
                map.put(s, count);
            } else { //第一次投这个景点，直接存入
                map.put(s, 1);
            }
        }
        System.out.println(map);

        //3.获取最多的景点票数
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max){
                max = count;
            }
            //max = count > max ? count : max;
            //max = Math.max(max,count);


        }
        //4.用max比较，得出哪个景点的票数最多
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                String key = entry.getKey();
                System.out.println(key + " = " + count);

            }
        }


    }
}
