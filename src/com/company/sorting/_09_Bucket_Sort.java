package com.company.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _09_Bucket_Sort {

    //Use ful when element are uniformly distributed
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
        System.out.println("Result Array =>" + bucketSort(arr,k));
    }

    private static ArrayList bucketSort(ArrayList<Integer> arr, int k) {
        int max =arr.get(0);
        for (int i=0;i<arr.size();i++)
            max = Math.max(max,arr.get(i));
        max++;
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for (int i=0;i<k;i++)
            bucket.add(new ArrayList<>());
        for (int i=0;i<arr.size();i++){
            int index = (k*arr.get(i))/max;
            bucket.get(index).add(arr.get(i));
        }
        for (int i=0;i<k;i++)
            Collections.sort(bucket.get(i));
        int index =0;
        for (int i=0;i<k;i++){
            for (int j=0;j<bucket.get(i).size();j++) {
                arr.set(index, bucket.get(i).get(j));
                index++;
            }
        }
        return arr;
    }
}
