package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _10_Pair_With_Given_Sum {

    public static boolean pairWithGivenSum(ArrayList<Integer> arr,int sum){
        int left = 0;
        int right= arr.size()-1;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int sum = sc.nextInt();

        System.out.println("Result =>" + pairWithGivenSum(arr,sum));
    }
}
