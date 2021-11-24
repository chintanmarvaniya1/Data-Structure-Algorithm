package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _08_Get_Peak_Element {

    //Peak Is element which is greater than both of its adjacent
    //if element of left of mid is grater than pick is defiantly on left side of mid,
    //otherwise peak is on right side of mid
    public static int getPeakElement(ArrayList<Integer> arr){
        int low = 0;
        int high = arr.size()-1;
        while (low <= high){
            int mid = (low + high) /2;
            if ((mid == 0 || arr.get(mid) >= arr.get(mid-1) ) &&
                    (mid == arr.size() -1 ||arr.get(mid) > arr.get(mid+1)))
                return mid;
            else {
                if (mid < arr.size()-1 && arr.get(mid) > arr.get(mid-1))
                    low = mid + 1;
                else
                    high = mid -1;
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


        System.out.println("Result => "+arr.get(getPeakElement(arr)));

    }
}
