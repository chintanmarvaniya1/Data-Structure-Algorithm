package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Linear_search {

    public static int linearSearch(ArrayList<Integer> arr,int ele){
        for (int i=0;i<arr.size();i++){
            if (ele == arr.get(i))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }

        int ele = sc.nextInt();

        if (linearSearch(arr,ele) > 0)
            System.out.println("Result => "+ linearSearch(arr,ele));
        else
            System.out.println("Element Not Found");
    }
}
