package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Bubble_Sort {

    //move largest element to last position by comparing with adjacent ele in one pass and continue till end of array
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        boolean swap = false;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" + arr);
        System.out.println("Result Array =>" + bubbleSort(arr));
    }
}
