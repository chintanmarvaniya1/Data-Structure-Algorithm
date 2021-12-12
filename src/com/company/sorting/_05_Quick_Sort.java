package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_Quick_Sort {

    public static int lomutoPartition(ArrayList<Integer> arr,int low,int high){
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

    public static void quickSortLomutoPartition(ArrayList<Integer> arr,int low,int high){
        if (low < high) {
            int p = lomutoPartition(arr, low, high);
            quickSortLomutoPartition(arr,low,p-1);
            quickSortLomutoPartition(arr,p+1,high);
        }
    }


    public static int hoarsPartition(ArrayList<Integer> arr,int low,int high){
        int pi = arr.get(low);
        int i=0;
        int j= high-1;
        while (true){
            do {
                i++;
            }while (arr.get(i) < pi);
            do {
                j--;
            }while (arr.get(j) > pi);
            if (i >= j)
                return j;
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
        }
    }

    public static void quickSortHoarsPartition(ArrayList<Integer> arr,int low,int high){
        if (low < high) {
            int p = hoarsPartition(arr, low, high);
            quickSortHoarsPartition(arr,low,p);
            quickSortHoarsPartition(arr,p+1,high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }
       /* System.out.println("Initial Array (Lamuto) =>" +arr);
        quickSortLomutoPartition(arr,0,arr.size()-1);
        System.out.println("Initial Array (Lamuto)=>" +arr);*/
 

        System.out.println("Initial Array (Hoar's) =>" +arr);
        quickSortLomutoPartition(arr,0,arr.size()-1);
        System.out.println("Initial Array (Hoar's)=>" +arr);
    }
}


