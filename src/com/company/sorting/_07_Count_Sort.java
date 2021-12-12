package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _07_Count_Sort {

    //Use full only when k is small
    //log(n+k)
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
        System.out.println("Result Array =>" + countSort(arr,k));
    }

    private static ArrayList countSort(ArrayList<Integer> arr,int k) {
        int[] count = new int[k];
        for (int i=0;i<k;i++)
            count[i] = 0;
        for (int i=0;i<arr.size();i++){
            count[arr.get(i)]++;
        }
        for (int i=1;i<k;i++)
            count[i] = count[i] + count[i-1];
        int[] out =new int[arr.size()];
        for (int i=arr.size()-1;i>=0;i--){
            out[count[arr.get(i)]-1] = arr.get(i);
            count[arr.get(i)]--;
        }
        for (int i=0;i<arr.size();i++)
            arr.set(i,out[i]);
        return arr;
    }
}
