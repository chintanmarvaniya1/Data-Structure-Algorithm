package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _16_Maximum_Sum_Of_K_Consecutive_Ele {

    public static int maximumSumOfKConsecutive(ArrayList<Integer> arr,int k){
        int sum =0;
        for (int i=0;i<k;i++){
            sum += arr.get(i);
        }
        int max_sum = sum;
        for(int i=k;i<arr.size();i++){
            sum += arr.get(i) - arr.get(i-k);
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();

        System.out.println("Result => " + maximumSumOfKConsecutive(arr,k));

    }
}
