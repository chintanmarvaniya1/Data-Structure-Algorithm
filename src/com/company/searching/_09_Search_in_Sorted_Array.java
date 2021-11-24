package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_Search_in_Sorted_Array {

    public static int searchInSortedArray(ArrayList<Integer> arr,int ele){
        int low = 0;
        int high = arr.size()-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr.get(mid) == ele)
                return mid;
            if (arr.get(mid) > arr.get(low)){
                if (ele > arr.get(low) && ele < arr.get(mid))
                    high =mid -1 ;
                else
                    low = mid+1;
            }else {
                if (ele > arr.get(mid) && ele < arr.get(high))
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int ele = sc.nextInt();

        System.out.println("Result => "+searchInSortedArray(arr,ele));
    }
}
