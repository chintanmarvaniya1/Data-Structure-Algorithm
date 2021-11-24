package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _13_Max_Sum_of_Circular_SubArray {

    //o(n 2)
    public static int maxSumOfCircularSubArrayEasy(ArrayList<Integer> arr){
        int res = arr.get(0);
        for(int i=0; i<arr.size(); i++){
            int curr_max = arr.get(i);
            int curr_sum = arr.get(i);
            for (int j=1; j<arr.size(); j++){
                int ind = (i+j)%arr.size();
                curr_sum += arr.get(ind);
                curr_max = Math.max(curr_max,curr_sum);
            }
            res = Math.max(res,curr_max);
        }
        return res;
    }


    //subtract minimum sum from total sum of array will give the maximum sum of
    //circular sub array
    // result can be maximum value of normal sub-array or maximum value of circular sub-array
    public static int maxSumOfCircularSubArray(ArrayList<Integer> arr) {
        int normal_sum = kadanesAlgorthm(arr);
        if (normal_sum < 0)
            return normal_sum;              //All the values are negative
        int arr_sum = 0;
        for(int i=0; i<arr.size(); i++){
            arr_sum += arr.get(i);
            arr.set(i,-arr.get(i));         //invert the Array
        }
        int circular_sum = arr_sum  + kadanesAlgorthm(arr);     // As the array is inverted we add normal sum to it

        return Math.max(circular_sum,normal_sum);
    }


    public static int kadanesAlgorthm(ArrayList<Integer> arr){
        int res =arr.get(0);
        int curr_end = arr.get(0);
        for(int i=1 ; i< arr.size(); i++){
            curr_end = Math.max(curr_end+arr.get(i),arr.get(i));
            res = Math.max(res,curr_end);
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

        System.out.println("Result => " + maxSumOfCircularSubArrayEasy(arr));
        System.out.println("Result => " + maxSumOfCircularSubArray(arr));

    }
}
