package test;

import box.LinkedBox;

public class LinkedBoxTest {

    public static void main(String[] args) {
        LinkedBox linkedBox = new LinkedBox();
        for (int i = 1; i <= 5; i++) {
            linkedBox.add(i);
            System.out.println("i-->" + i);
        }
        System.out.println("size: "+linkedBox.size());


    }


}
