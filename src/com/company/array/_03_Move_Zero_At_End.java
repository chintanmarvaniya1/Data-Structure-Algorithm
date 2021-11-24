package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Move_Zero_At_End {

    public static ArrayList<Integer> swap(ArrayList<Integer> arr,int i,int j) {
        int temp= arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);

        return arr;
    }

    public static ArrayList<Integer> moveZeroToEnd(ArrayList<Integer> arr){
        int cnt = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) != 0){
                swap(arr, i, cnt);
                cnt++;
            }

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


        System.out.println(moveZeroToEnd(arr));

    }
}
