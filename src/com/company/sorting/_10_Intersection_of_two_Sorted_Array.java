package com.company.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _10_Intersection_of_two_Sorted_Array {

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
        System.out.println("Result Array =>" + Intersection(arr1,arr2));
    }

    private static ArrayList Intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> result =new ArrayList<>();
        int i=0;
        int j=0;
        while (i<arr1.size() && j<arr2.size()){
            if (i>0 && arr1.get(i - 1).equals(arr1.get(i))){
                i++;
                continue;
            }
            if (arr1.get(i) < arr2.get(j))
                i++;
            else if (arr1.get(i) > arr2.get(j))
                j++;
            else{
                result.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return result;
    }
}
