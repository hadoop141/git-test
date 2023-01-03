package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();

    //准备牌
    //静态代码块中：随着类的加载而加载，且只加载一次
    static {
        //牌盒：装排
        //牌：花色：♠, ♥, ♣, ♦,
        //   数字：3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A, 2
        //   大王, 小王

        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //把52张数字牌添加到牌盒中，每张数字牌由花色+数字组成，如 ♠3,♥3
        for (String color : colors) {
            for (String number : numbers) {
                list.add(color + number);
            }
        }
        //添加大小王，到牌盒中
        list.add("大王");
        list.add("小王");

        //System.out.println(list);
    }

    public PokerGame() {

        //洗牌,打乱牌盒顺序
        Collections.shuffle(list);
        //System.out.println(list);

        //发牌
        //发几堆：4堆        1，卧龙的牌   2.凤雏的牌     3.大聪明的牌      4.底牌（3张）
        //遍历牌盒:先拿三张作为底牌，再利用索引i对3取模 i%3 循环发牌
        ArrayList<String> load = new ArrayList<>(); //存储底牌
        ArrayList<String> player1 = new ArrayList<>(); //选手1
        ArrayList<String> player2 = new ArrayList<>(); //选手2
        ArrayList<String> player3 = new ArrayList<>(); //选手3

        licensing(load, player1, player2, player3);

        //看牌
        lookPokers("底牌",load);
        lookPokers("卧龙",player1);
        lookPokers("凤雏",player2);
        lookPokers("大聪明",player3);


    }

    //功能：发牌
    //参数一：底牌    参数二：卧龙的    参数三：凤雏的    参数四：大聪明的
    //返回值：void
    private void licensing(ArrayList<String> load, ArrayList<String> player1, ArrayList<String> player2, ArrayList<String> player3) {
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                //底牌
                load.add(poker);
                continue;
            }
            //不是底牌，发给选手的牌
            int number = i % 3;//索引i对3取模后的数
            if (number == 0) {
                //发给卧龙
                player1.add(poker);
            } else if (number == 1) {
                //发给凤雏
                player2.add(poker);
            } else {
                //发给大聪明
                player3.add(poker);
            }
        }
    }

    //功能：看牌 打印每位选手的牌
    //参数1：选手的名字      参数2：牌
    //返回值：void
    private void lookPokers(String name, ArrayList<String> pokers) {
        System.out.print(name + ": ");
        //遍历每一堆牌
        for (String poker : pokers) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
