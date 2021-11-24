package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Binary_Search {

    public static int recursive(ArrayList<Integer> arr,int low,int high,int ele){
        if (low > high)
            return -1;
        int mid = (low+high)/2;
        if (arr.get(mid) == ele)
            return mid;
        else if (ele > arr.get(mid))
            return recursive(arr,mid+1,high,ele);
        else
            return recursive(arr,low,mid-1,ele);
    }

    public static int iterative(ArrayList<Integer> arr, int ele){
        int low =0;
        int high =arr.size()-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr.get(mid) == ele)
                return mid;
            else if (ele > arr.get(mid))
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }

        int ele = sc.nextInt();

        if (recursive(arr,0,arr.size()-1,ele) > 0)
            System.out.println("Result => "+ recursive(arr,0,arr.size()-1,ele));
        else
            System.out.println("Element Not Found");

        if (iterative(arr,ele) > 0)
            System.out.println("Result => "+ iterative(arr,ele));
        else
            System.out.println("Element Not Found");
    }
}
