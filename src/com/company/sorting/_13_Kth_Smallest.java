package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _13_Kth_Smallest {
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
        System.out.println("Result =>" + arr.get(kthSmallest(arr,k)));
    }

    private static int kthSmallest(ArrayList<Integer> arr, int k) {
        int low =0;
        int high = arr.size()-1;
        while (low<=high){
            int pi = partition(arr,low,high);
            if (pi == k-1)
                return pi;
            else if (pi > k-1)
                high = pi -1;
            else
                low = pi + 1;
        }
        return -1;
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {

        int pi = arr.get(high);
        int i = low-1;
        //traverse from left to right and set all the element less tha pivot to its left and greater on its right
        for (int j=low;j<=high-1;j++){
            if (arr.get(j) < pi) {
                i++;
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        //place pivot at its correct position in array
        int temp = arr.get(i+1);
        arr.set(i+1,arr.get(high));
        arr.set(high,temp);

        //return position of pivot
        return i+1;
    }
}
