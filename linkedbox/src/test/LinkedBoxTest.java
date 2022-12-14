package test;

import box.LinkedBox;

public class LinkedBoxTest {

    public static void main(String[] args) {
        LinkedBox<Integer> linkedBox = new LinkedBox();
        for (int i = 1; i <= 10; i++) {
            linkedBox.add(i);
            System.out.println("i-->" + i);
        }
        System.out.println("size: "+linkedBox.size());
        int data = linkedBox.get(3);  // 3代表索引  data ：4
        System.out.println("data: "+data);
        System.out.println(linkedBox.remove(6));
        System.out.println("size: "+linkedBox.size());



    }


}
