package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_Triplet_With_Given_Sum {

    public static boolean pairWithGivenSum(ArrayList<Integer> arr,int i,int j,int sum){
        int left = i;
        int right= j;
        while (left <= right){
            if (arr.get(left) + arr.get(right) == sum)
                return true;
            else if (arr.get(left) + arr.get(right) > sum)
                right--;
            else
                left++;
        }
        return false;
    }

    public static boolean tripletWithGivenSum(ArrayList<Integer> arr,int sum){
        for (int i=0;i<arr.size();i++){
            if (pairWithGivenSum(arr,i,arr.size()-1,sum-arr.get(i)))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int sum = sc.nextInt();
        System.out.println("Result => "+tripletWithGivenSum(arr,sum));
    }
}
