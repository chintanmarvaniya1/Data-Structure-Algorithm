package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _18_Sum_Of_Element_Between_Given_Point {

    public static int sumOfElementBetweenGivenPoint(ArrayList<Integer> arr, int l,int r){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0,arr.get(0));
        for (int i=1 ;i<arr.size(); i++){
            res.add(i,res.get(i-1)+arr.get(i));
        }
        if (l != 0)
            return res.get(r) - res.get(l-1);
        else
            return res.get(r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int l = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Result => " + sumOfElementBetweenGivenPoint(arr,l,r));

    }
}
