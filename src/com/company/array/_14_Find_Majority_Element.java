package com.company.array;


import java.util.ArrayList;
import java.util.Scanner;

public class _14_Find_Majority_Element {

    public static int findMajorityElement(ArrayList<Integer> arr){
        int res=0;
        int cnt=1;
        for(int i=0;i<arr.size(); i++){
            if (arr.get(i).equals(arr.get(res)))
                cnt++;
            else
                cnt--;
            if (cnt == 0){
                res = i;
                cnt = 1;
            }
        }
        cnt = 0;
        for (int i=0;i<arr.size(); i++){
            if (arr.get(i).equals(arr.get(res)))
                cnt++;
        }

        if (cnt <= arr.size()/2)
            return -1;
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        if (findMajorityElement(arr) > 0)
            System.out.println("Result => " + arr.get(findMajorityElement(arr)));
        else
            System.out.println("Element not found");


    }
}
