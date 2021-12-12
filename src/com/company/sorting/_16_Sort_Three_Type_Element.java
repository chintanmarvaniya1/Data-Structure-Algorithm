package com.company.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _16_Sort_Three_Type_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" + arr);
        sortThreeTypeArrayElement(arr);
        System.out.println("Final Array =>" + arr);
    }

    private static void sortThreeTypeArrayElement(ArrayList<Integer> arr) {

        int lo = 0;
        int hi = arr.size() - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            if (arr.get(mid) == 0) {
                temp = arr.get(lo);
                arr.set(lo, arr.get(mid));
                arr.set(mid, temp);
                lo++;
                mid++;
            }
            if (arr.get(mid) == 1) {
                mid++;
            }
            if (arr.get(mid) == 2) {
                temp = arr.get(mid);
                arr.set(mid, arr.get(hi));
                arr.set(hi, temp);
                hi--;
            }
        }

    }
}
