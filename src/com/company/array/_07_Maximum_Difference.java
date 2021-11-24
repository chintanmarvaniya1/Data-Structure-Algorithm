package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;


//Maximum Difference is value of a[j]-a[i] such that j>i
public class _07_Maximum_Difference {

    public static int maximumDifference(ArrayList<Integer> arr){
        int res = arr.get(1) - arr.get(0);
        int minVal= arr.get(0);
        for(int i=1 ; i<arr.size();i++) {
            res = Math.max(res, arr.get(i) - minVal);
            minVal=Math.min(minVal,arr.get(i));
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

        System.out.println("Maximum Difference => "+ maximumDifference(arr));
    }
}
