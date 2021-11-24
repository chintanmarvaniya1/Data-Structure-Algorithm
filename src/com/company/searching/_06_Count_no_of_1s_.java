package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_Count_no_of_1s_ {

    public static int countNoOfOnes(ArrayList<Integer> arr){
        int low = 0;
        int high = arr.size()-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr.get(mid) == 0)
                low = mid+1;
            else {
                if (mid == 0 || arr.get(mid) != arr.get(mid-1))
                    return arr.size()-mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++) {
            arr.add(sc.nextInt());
        }
        if (countNoOfOnes(arr) > 0)
            System.out.println("Result => "+ countNoOfOnes(arr));
        else
            System.out.println("1 Not Found");
    }
}
