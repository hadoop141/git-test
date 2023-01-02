package mytreemap;

import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*需求：
            字符串“aababcabcdabcde”
            请统计字符串中每一个字符出现的次数，并按照以下格式输出
            输出结果：
            a(5)b(4)c(3)d(2)e(1)

            新的统计思想：利用map集合进行统计
            HashMap:
            TreeMap:
                如果题目中没有要求对结果进行排序，默认使用HashMap
                如果题目中要求对结果进行排序，请使用TreeMap

            键：表示要统计的内容
            值：表示次数
        */

        //1.定义字符串
        String s = "aababcabcdabcde";

        //3.创建一个TreeMap集合对象
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        //2.遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //2.1判断TreeMap集合中是否有此字符串
            //如果存在：字符数量再加一
            //如果不存在：直接添加，且字符数量为一
            if (treeMap.containsKey(c)) {
                //存在：当前字符又出现了一次
                //先把字符对应的原来的数量取出来
                int count = treeMap.get(c);
                //再让count自增
                count++;
                treeMap.put(c, count);
            } else {
                //不存在：当前字符第一次出现
                treeMap.put(c, 1);
            }
        }

        //打印输出结果：a(5)b(4)c(3)d(2)e(1)
        StringBuilder sb = new StringBuilder();
        treeMap.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);

       /* StringJoiner sj = new StringJoiner("","","");
        treeMap.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(")"));
        System.out.println(sj);*/

    }
}
