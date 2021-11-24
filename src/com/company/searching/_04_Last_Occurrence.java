package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_Last_Occurrence {

    public static int lastOccurrence(ArrayList<Integer> arr, int ele){
        int low =0;
        int high = arr.size()-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (ele > arr.get(mid))
                low = mid + 1;
            else if (ele < arr.get(mid))
                high = mid - 1;
            else {
                if (mid == arr.size()-1 || arr.get(mid) != arr.get(mid+1))
                    return mid;
                else low = mid +1;
            }
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

        if (lastOccurrence(arr,ele) > 0)
            System.out.println("Result => "+ lastOccurrence(arr,ele));
        else
            System.out.println("Element Not Found");
    }
}
