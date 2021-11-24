package com.company.matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Snake_pattern {


    public static ArrayList<Integer> snakePattern (int[][] arr,int R,int C){
        ArrayList<Integer> res =new ArrayList<>();
        for (int i=0;i<R;i++){
            if (i%2 == 0){
                for (int j=0;j<C;j++)
                    res.add(arr[i][j]);
            }else{
                for (int j=arr[i].length-1;j>=0;j--)
                    res.add(arr[i][j]);
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of Rows: ");
        int rw = sc.nextInt();
        System.out.println("No of Columns: ");
        int cl = sc.nextInt();
        int[][] arr = new int[rw][cl];

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(snakePattern(arr,rw,cl));
    }
}
