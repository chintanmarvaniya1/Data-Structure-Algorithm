package com.company.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_Count_Occurrence {

    public static int countOccurrence(ArrayList<Integer> arr,int ele){
        int firstOcc = _03_First_Occurrence.firstOccurrence(arr,ele);
        int lastOcc = _04_Last_Occurrence.lastOccurrence(arr,ele);
        if (firstOcc == -1)
            return 0;
        else
            return lastOcc - firstOcc + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }
        int ele = sc.nextInt();

        if (countOccurrence(arr,ele) != 0)
            System.out.println("Result => "+ countOccurrence(arr,ele));
        else
            System.out.println("Element Not Found");
    }
}
