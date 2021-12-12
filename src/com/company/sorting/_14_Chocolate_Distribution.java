package com.company.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _14_Chocolate_Distribution {
    //minimum diff between max and min ele of k no of array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :");
        int size = sc.nextInt();
        System.out.print("k :");
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" + arr);
        System.out.println("Result =>" + chocolate(arr,k));
    }

    private static int chocolate(ArrayList<Integer> arr, int k) {
        if (k > arr.size()-1)
            return -1;
        Collections.sort(arr);
        int res = arr.get(k-1) - arr.get(0);
        for (int i =1;i+k-1<arr.size()-1;i++){
            res = Math.min(res,arr.get(i+k-1)-arr.get(i));
        }
        return res;
    }
}
