package doudizhu2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    //准备牌，牌盒Map,
    // key:   代表序号，表示此牌在牌堆中的大小
    // value: 表示牌本身
    static HashMap<Integer, String> hm = new HashMap<>();

    //设计一个ArrayList集合来装牌代表的序号，也就是HashMap的key
    static ArrayList<Integer> list = new ArrayList<>();

    //准备牌，牌盒Map
    //静态代码块中：随着类的加载而加载，且只加载一次
    static {
        //牌盒：装排
        //牌：花色： ♦, ♣, ♥, ♠
        //   数字：3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A, 2
        //   大王, 小王

        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //表示序号
        int serialNumber = 1;

        //得到每一张数字牌
        //注意：要先得到每一个数字，再得到花色，这样序号增加就不会出错
        //比如：序号：1 2 3 4
        // 牌：♦3, ♣3, ♥3, ♠3
        for (String number : numbers) {
            for (String color : colors) {
                //把序号，牌添加到牌盒中
                hm.put(serialNumber, color + number);
                //把序号添加到list集合中
                list.add(serialNumber);
                //排序增加
                serialNumber++;
            }
        }
        //添加大小王
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

        //System.out.println(list);
        //System.out.println(hm);

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌；注意，发的是Arraylist集合中的序号，而不是真正的牌，只有到看牌的时候，才是真正的牌
        //小细节：因为 序号是Integer类型的，如果我们用TreeSet集合接，TreeSet就会默认帮我们排好序
        TreeSet<Integer> load = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        licensing(load, player1, player2, player3);

        //看牌：在发牌的时候，牌的序号已经排好了，现在就要从牌盒hm中取出序号对应的牌
        lookPokers("底牌",load);
        lookPokers("卧龙",player1);
        lookPokers("凤雏",player2);
        lookPokers("大聪明",player3);

    }

    //功能：发牌 发的是Arraylist集合中的序号，而不是真正的牌，只有到看牌的时候，才是真正的牌
    //参数一：底牌    参数二：卧龙的    参数三：凤雏的    参数四：大聪明的
    //返回值：void
    private void licensing(TreeSet<Integer> load, TreeSet<Integer> player1, TreeSet<Integer> player2, TreeSet<Integer> player3) {
        for (int i = 0; i < list.size(); i++) {
            //序号
            int serialNumber = list.get(i);
            if (i <= 2) {
                //底牌，前3张
                load.add(serialNumber);
                continue;
            }
            //给三位选手循环发牌
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }
    }

    //功能：看牌 取出牌的序号，得到对应的牌，打印输出
    //参数1：选手的名字      参数2：牌的序号
    //返回值：void
    private void lookPokers(String name, TreeSet<Integer> pokers) {
        System.out.print(name + ": ");
        //获得序号
        for (int serialNumber : pokers) {
            //通过序号，获取对应的牌
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }


}
