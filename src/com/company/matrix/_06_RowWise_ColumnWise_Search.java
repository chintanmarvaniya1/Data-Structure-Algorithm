package com.company.matrix;

import java.util.Scanner;

public class _06_RowWise_ColumnWise_Search {

    public static void rowWiseColumnWise(int[][] arr,int R,int C,int ele){
        int i=0;
        int j=C-1;
        while (i<R && j>=0){
            if (arr[i][j] == ele){
                System.out.println("Element Found At ("+i+","+j+")");
                return ;
            }else if (arr[i][j] < ele){
                i++;
            }else
                j--;
        }
        System.out.println("Element Not Found");
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

        int ele =sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        rowWiseColumnWise(arr,rw,cl,ele);


    }
}
