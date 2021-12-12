package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _08_Radix_Sort {

    //Sort Element Digit by digit i.e first sort according to unit place
    //then ten's place and so on

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" + arr);
        System.out.println("Result Array =>" + radixSort(arr));
    }

    private static ArrayList radixSort(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i=1;i<arr.size();i++){
            if (arr.get(i) > max)
                max =arr.get(i);
        }
        for (int exp =1;max/exp>0;exp = exp*10){
            countingSort(arr,arr.size(),exp);
        }
        return arr;
    }

    private static void countingSort(ArrayList<Integer> arr, int size, int exp) {
        int[] count = new int[10];
        for (int i=0;i<10;i++)
            count[i] = 0;
        for (int i=0;i<size;i++){
            count[(arr.get(i)/exp)%10]++;
        }
        for (int i=1;i<10;i++)
            count[i] = count[i] + count[i-1];
        int[] out =new int[size];
        for (int i=size-1;i>=0;i--){
            out[count[(arr.get(i)/exp)%10]-1] = arr.get(i);
            count[(arr.get(i)/exp)%10]--;
        }
        for (int i=0;i<arr.size();i++)
            arr.set(i,out[i]);
    }
}
