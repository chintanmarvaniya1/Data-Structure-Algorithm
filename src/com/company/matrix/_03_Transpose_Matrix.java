package com.company.matrix;

import java.util.Scanner;

public class _03_Transpose_Matrix {

    public static int[][] transposeMatrix(int[][] arr,int R,int C){
        for (int i=0;i<R;i++){
            for (int j=i+1;j<R;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
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

        int[][] res = transposeMatrix(arr,rw,cl);
        System.out.println("Result =>");
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
