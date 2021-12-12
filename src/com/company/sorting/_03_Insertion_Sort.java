package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Insertion_Sort {
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr){
        for (int i=1;i<arr.size();i++){
            int key = arr.get(i);
            int j=i-1;
            while (j>=0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j+1,key);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" +arr);
        System.out.println("Result Array =>" +insertionSort(arr));
    }
}
