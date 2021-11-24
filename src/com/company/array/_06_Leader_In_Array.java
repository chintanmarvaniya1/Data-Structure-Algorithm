package com.company.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// All the element on its right are greater than it is Leader
public class _06_Leader_In_Array {


    public static ArrayList<Integer> leaderInArray(ArrayList<Integer> arr){
        ArrayList<Integer> res = new ArrayList<>();
        int curr_lea = arr.get(arr.size()-1);
        res.add(curr_lea);
        for(int i = arr.size()-2 ;i >= 0 ;i--){
            if(arr.get(i) > curr_lea){
                curr_lea = arr.get(i);
                res.add(curr_lea);
            }
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

        System.out.println(arr);
        ArrayList<Integer> rev = leaderInArray(arr);
        Collections.reverse(rev);
        System.out.println(rev);


    }
}
