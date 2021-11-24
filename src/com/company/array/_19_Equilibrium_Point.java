package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _19_Equilibrium_Point {

    public static int equilibriumPoint(ArrayList<Integer> arr ){
        int sum = arr.get(0);
        for(int i=1;i<arr.size();i++)
            sum+= arr.get(i);
        int curr_sum = 0;
        for(int i=0;i<arr.size();i++){
            if (curr_sum == sum - arr.get(i))
                return i;
            curr_sum += arr.get(i);
            sum -= arr.get(i);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }


        if (equilibriumPoint(arr) >= 0)
            System.out.println("Result => " + arr.get(equilibriumPoint(arr)));
        else
            System.out.println("No Equilibrium Point");

    }
}
