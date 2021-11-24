package com.company.matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_Spiral_Traversal {

    public static ArrayList<Integer> spiralTraversal(int[][] arr, int R,int C){
        ArrayList<Integer> res = new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=R-1;
        int right=C-1;

        while (left <= right && top <= bottom){
            for (int i=left;i<=right;i++)
                res.add(arr[top][i]);
            top++;
            for (int i=top;i<=bottom;i++)
                res.add(arr[i][right]);
            right--;

            if (top <= bottom){
                for (int i=right;i>=left;i--)
                    res.add(arr[bottom][i]);
                bottom--;
            }
            if (left <= right){
                for (int i=bottom;i>=top;i--)
                    res.add(arr[i][left]);
                left++;
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

        System.out.println("Result =>" + spiralTraversal(arr,rw,cl));
    }
}
