package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_Reverse_Array {

    public static ArrayList<Integer> swap(ArrayList<Integer> arr,int i,int j) {
        int temp= arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);

        return arr;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size()-1;
        while (start <= end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(arr);
        System.out.println(reverse(arr));


    }
}
