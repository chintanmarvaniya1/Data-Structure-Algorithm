package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _15_Min_Flip_to_Make_Equal {


    //Group count are same or have difference of only one
    //if starting value is same as ending than diff is one than flip the second group
    //if starting value is different from ending then diff is zero than flip

    public static void minFlipToMakeEqual(ArrayList<Integer> arr){
        for (int i=1;i<arr.size();i++){
            if (arr.get(i) != arr.get(i-1)){
                if (arr.get(i) != arr.get(0)){
                    System.out.print("From "+i+" to ");
                }else
                    System.out.println(i-1);
            }
        }
        if (arr.get(arr.size()-1) != arr.get(0))
            System.out.println(arr.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        minFlipToMakeEqual(arr);
    }
}
