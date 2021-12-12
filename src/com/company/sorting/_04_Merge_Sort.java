package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_Merge_Sort {

    public static void mergeSort(ArrayList<Integer> arr, int left, int right){
        if (left<right){
            int mid = left + (right-left) /2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(ArrayList<Integer> arr,int left,int mid,int right){
        ArrayList<Integer> lArr = new ArrayList<>(mid-left+1);
        ArrayList<Integer> rArr = new ArrayList<>(right-mid);
        for (int i=0;i<mid-left+1;i++)
            lArr.add(i,arr.get(left+i));
        for (int i=0;i<right-mid;i++)
            rArr.add(i,arr.get(mid+1+i));
        int i=0;
        int j=0;
        int k=left;
        while (i<lArr.size() && j<rArr.size()){
            if (lArr.get(i) < rArr.get(j)){
                arr.set(k,lArr.get(i));
                k++;
                i++;
            }else {
                arr.set(k,rArr.get(j));
                k++;
                j++;
            }
        }
        while (i<lArr.size()){
            arr.set(k,lArr.get(i));
            i++;
            k++;
        }
        while (j<rArr.size()){
            arr.set(k,rArr.get(j));
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" +arr);
        mergeSort(arr,0,size-1);
        System.out.println("Initial Array =>" +arr);
    }
}
