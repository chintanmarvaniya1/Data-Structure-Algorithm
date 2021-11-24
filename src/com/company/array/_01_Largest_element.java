package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Largest_element {

    public static int getLargestElement(ArrayList<Integer> arr){
        int res = 0;
        for(int i=0; i<arr.size();i++){
            if(arr.get(i) > arr.get(res)){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }

        System.out.println("Result => "+ arr.get(getLargestElement(arr)));
    }
}
