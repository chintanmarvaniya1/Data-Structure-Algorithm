package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _12_Max_Length_EvenOdd_SubArray {

    public static int maxLengthEvenOddSubArray(ArrayList<Integer> arr){
        int res =1;
        int curr =1;
        for(int i=1; i<arr.size(); i++){
            if (arr.get(i)%2 == 0 && arr.get(i-1)%2 != 0 ||
                    arr.get(i)%2 != 0 && arr.get(i-1)%2 == 0){
                curr++;
                res = Math.max(res,curr);
            }else
                curr = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Result => " + maxLengthEvenOddSubArray(arr));

    }
}
