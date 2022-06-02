package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(rd.nextInt(1, 100));
        }
        for (int i : arrayList) {
            System.out.print(i + ", ");
            if (i %2 == 0) {
                System.out.println("Jup san");
            }else {
                System.out.println("Tak san");
            }
        }

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(3);
        arrayList1.add(5);
        arrayList1.add(7);
        arrayList1.add(9);
        arrayList1.add(11);
        System.out.println();
        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(4);
        arrayList2.add(6);
        arrayList2.add(8);
        arrayList2.add(10);
        System.out.println(arrayList2);
    }
}