package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_Max_Sum_of_SubArray {

    public static int maxSumOfSubArray(ArrayList<Integer> arr){
        int res =arr.get(0);
        int temp = arr.get(0);
        for(int i=1; i<arr.size(); i++){
            temp = Math.max(arr.get(i),temp+arr.get(i));
            res = Math.max(res,temp);
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

        System.out.println("Result => " + maxSumOfSubArray(arr));
    }
}
