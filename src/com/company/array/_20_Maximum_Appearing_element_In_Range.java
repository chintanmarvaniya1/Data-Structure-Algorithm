package com.company.array;

import java.util.Scanner;

public class _20_Maximum_Appearing_element_In_Range {

    public static int maxAppearingElement(int[] lArr, int[] rArr){
        int[] res =new int[10000000];
        for (int i=0;i<lArr.length;i++){
            res[lArr[i]]++;
            res[rArr[i]+1]--;
        }
        int max = res[0];
        int result = 0;
        for(int i = 1;i<res.length ;i++){
            res[i] += res[i-1];
            if (max < res[i]){
                max =  res[i];
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.print("Element of Array1 :");
        for (int i = 0; i < size; i++)
            arr1[i] = sc.nextInt();
        System.out.print("Element of Array2 :");
        for (int i = 0; i < size; i++)
            arr2[i] = sc.nextInt();

        System.out.println("Result => "+maxAppearingElement(arr1,arr2));
    }
}
