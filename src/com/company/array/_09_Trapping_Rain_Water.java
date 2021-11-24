package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_Trapping_Rain_Water {

    public static int trappingWaterBasic(ArrayList<Integer> arr){
        int res = 0;
        for(int i=1;i<arr.size()-1;i++){
            int lMax=0;
            for (int j= 0; j< i;j++)
                lMax = Math.max(lMax,arr.get(j));
            int rMax=0;
            for (int j= i+1; j< arr.size();j++)
                rMax = Math.max(rMax,arr.get(j));

            res = res + (Math.min(lMax,rMax) - arr.get(i));
        }
        return Math.max(res, 0);
    }

    public static int trappingWater(ArrayList<Integer> arr){
        ArrayList<Integer> lMax = new ArrayList<>();
        ArrayList<Integer> rMax = new ArrayList<>();
        for(int i= 0;i<arr.size();i++){
            lMax.add(0);
            rMax.add(0);
        }
        int res=0;
        lMax.set(0,arr.get(0));
        for(int i=1 ;i<arr.size()-1;i++)
            lMax.set(i,Math.max(lMax.get(i-1),arr.get(i)));

        rMax.set(arr.size()-1,arr.get(arr.size()-1));
        for(int i=arr.size()-2 ;i >= 0;i--)
            rMax.set(i,Math.max(rMax.get(i+1),arr.get(i)));

        for (int i=0 ; i<arr.size()-1;i++)
            res += Math.min(lMax.get(i),rMax.get(i))-arr.get(i);

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }


        System.out.println("Result => "+ trappingWaterBasic(arr));
        System.out.println("Result => "+ trappingWater(arr));
    }
}
