package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _17_SubArray_With_Given_Sum {


    public static boolean subArrayWithGivenSum(ArrayList<Integer> arr,int sum){
        int curr_sum = arr.get(0);
        int start = 0;
        for (int end=1; end<arr.size();end++){
            while (curr_sum > sum && start<= end-1){
                curr_sum -= arr.get(start);
                start++;
            }
            if (curr_sum == sum)
                return true;
            if(curr_sum < sum && start<= end-1 )
                curr_sum += arr.get(end);
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

        System.out.println("Result => " + subArrayWithGivenSum(arr,sum));

    }
}
