package com.company.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _15_Separate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" + arr);
        separateArrayElement(arr);
        System.out.println("Final Array =>" + arr);
    }

    private static void separateArrayElement(ArrayList<Integer> arr) {
        int i=-1;
        int j = arr.size();
        while (true){
            do {
                i++;
            }while (arr.get(i) < 0);
            do {
                j--;
            }while (arr.get(j)>=0);
            if (i>=j)
                return ;
            Collections.swap(arr,i,j);
        }
    }
}
