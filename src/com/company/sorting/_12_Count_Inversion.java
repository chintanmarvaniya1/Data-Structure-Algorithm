package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _12_Count_Inversion {

    // element on left side should be greater than element on right
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" + arr);
        System.out.println("Result =>" + countInversion(arr,0,size-1));
    }

    private static int countInversion(ArrayList<Integer> arr,int l,int r) {
        int res = 0;
        if (l < r){
            int m= l+(r-l)/2;
            res = res + countInversion(arr,l,m);
            res = res + countInversion(arr,m+1,r);
            res = res + countAndMerge(arr,l,m,r);
        }
        return res;
    }

    private static int countAndMerge(ArrayList<Integer> arr, int left, int mid, int right) {
        ArrayList<Integer> lArr = new ArrayList<>(mid-left+1);
        ArrayList<Integer> rArr = new ArrayList<>(right-mid);
        for (int i=0;i<mid-left+1;i++)
            lArr.add(i,arr.get(left+i));
        for (int i=0;i<right-mid;i++)
            rArr.add(i,arr.get(mid+1+i));
        int i=0;
        int j=0;
        int k=left;
        int res = 0;
        while (i<lArr.size() && j<rArr.size()){
            if (lArr.get(i) < rArr.get(j)){
                arr.set(k,lArr.get(i));
                k++;
                i++;
            }else {
                arr.set(k,rArr.get(j));
                res = res + (lArr.size()-i);
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
        return res;
    }
}
