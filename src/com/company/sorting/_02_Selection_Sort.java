package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Selection_Sort {

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
        for (int i=0;i<arr.size();i++){
            int min = i;
            for (int j=i+1;j<arr.size();j++){
                if (arr.get(min) > arr.get(j))
                    min = j;
            }
            int temp = arr.get(min);
            arr.set(min,arr.get(i));
            arr.set(i,temp);
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
        System.out.println("Result Array =>" +selectionSort(arr));
    }

}
