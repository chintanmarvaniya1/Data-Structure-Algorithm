package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_left_Rotate_By_One {

    public static ArrayList<Integer> leftRotateByOne(ArrayList<Integer> arr){
        int temp = arr.get(0);
        for(int i=1;i<arr.size();i++){
            arr.set(i-1,arr.get(i));
        }
        arr.set(arr.size()-1,temp);

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
        System.out.println(leftRotateByOne(arr));


    }
}
