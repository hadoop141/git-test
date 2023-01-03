package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*  班级里有N个学生
            要求：
            70%的概率随机到男生
            30%的概率随机到女生
            “范闲"，"范建"，“范统”，"杜子腾"，"宋合泛"，"侯笼藤"，"朱益群"，"朱穆朗玛峰"，
            “杜琦燕"，"袁明媛"，"李猜”，"田蜜蜜”，
         */

        //70%的概率随机到男生,30%的概率随机到女生
        //创建一个集合，代表概率，里面存七个1，三个0，1代表男生，0代表女生  1111111
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        //打乱集合
        Collections.shuffle(list);
        //System.out.println(list);

        //创建两个集合，分别装男生，女生。再从前面的概率集合中，抽取随机数，
        //抽到1，就从男生集合中取，反之，抽到0，从女生集合中取
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        //添加数据
        Collections.addAll(boys,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.shuffle(boys);
        Collections.addAll(girls,"杜琦燕","袁明媛","李猜","田蜜蜜");
        Collections.shuffle(girls);

        //获取抽到的数字
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        //通过抽到的数字number，判断抽到了男生，还是女生
        if(number == 1){
            //抽到了男生
            Random r1 = new Random();
            int boyIndex = r1.nextInt(boys.size());
            String name = boys.get(boyIndex);
            System.out.println(name);
        }else{
            //抽到了女生
            Random r1 = new Random();
            int girlIndex = r1.nextInt(girls.size());
            String name = girls.get(girlIndex);
            System.out.println(name);
        }


    }
}
