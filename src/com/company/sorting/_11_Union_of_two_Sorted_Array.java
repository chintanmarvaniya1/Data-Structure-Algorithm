package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_Union_of_two_Sorted_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.print("Size1 :");
        int size1 = sc.nextInt();
        for (int i = 0; i < size1; i++)
            arr1.add(sc.nextInt());
        System.out.print("Size2 :");
        int size2 = sc.nextInt();
        for (int i = 0; i < size2; i++)
            arr2.add(sc.nextInt());

        System.out.println("Initial Array 1 =>" + arr1);
        System.out.println("Initial Array 2 =>" + arr2);
        System.out.println("Result Array =>" + Union(arr1,arr2));
    }

    private static ArrayList Union(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        int m = arr1.size();
        int n = arr2.size();
        while (i< m && j< n){
            if (i>0 && arr1.get(i - 1).equals(arr1.get(i))){
                i++;
                continue;
            }
            if (j>0 && arr2.get(j - 1).equals(arr2.get(j))){
                j++;
                continue;
            }
            if (arr1.get(i) <arr2.get(j)){
                res.add(arr1.get(i));
                i++;
            }else if (arr2.get(j) < arr1.get(i)){
                res.add(arr2.get(j));
                j++;
            }else {
                res.add(arr1.get(i));
                i++;
                j++;
            }
        }
        while (i< m){
            if (i == 0 || !arr1.get(i).equals(arr1.get(i - 1))){
                res.add(arr1.get(i));
                i++;
            }
        }
        System.out.println(res);
        while (j< n){
            if (j == 0 || !arr2.get(j).equals(arr2.get(j - 1))){
                res.add(arr2.get(j));
                j++;
            }
        }
        System.out.println(res);
        return res;
    }
}
