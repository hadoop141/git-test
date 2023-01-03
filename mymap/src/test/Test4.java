package test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //目标Map集合的嵌套
        /*需求
            定义一个Map集合，键用表示省份名称province,值表示市city,但是市会有多个。
            添加完毕后，遍历结果格式如下：
                江苏省=南京市，扬州市，苏州市，无锡市，常州市
                湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
                河北省=石家庄市，唐山市，邢台市，保定市，张家口市
         */

        //1.创建一个Map集合.Map集合的vlaue是一个单列集合、或者是数组，单列集合可以是Set，也可以是List，
        //  但最好是一个集合，因为数组要确定大小，而集合不需要
        HashMap<String, Set<String>> map = new HashMap<>();

        //2.添加数据
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "南京市", "扬州市", "苏州市", "常州市", "无锡市");

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");

        Set<String> set3 = new HashSet<>();
        Collections.addAll(set3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        map.put("江苏省", set1);
        map.put("湖北省", set2);
        map.put("河北省", set3);

        //3.遍历map集合
        Set<Map.Entry<String, Set<String>>> entries = map.entrySet();
        for (Map.Entry<String, Set<String>> entry : entries) {
            String province = entry.getKey();
            //创建一个StringBuilder对象 做字符串的拼接。
            //StringJoiner sj = new StringJoiner( ", ","","");
            StringJoiner sj = new StringJoiner(", ", province + " = ", "");
            //获取cities集合
            Set<String> cities = entry.getValue();
            //遍历Set集合
            for (String city : cities) {
                //把city拼接到sj后面
                sj.add(city);
            }
            //打印输出字符串sj
            //System.out.println(province + " = " + sj);
            System.out.println(sj);
        }
    }
}
