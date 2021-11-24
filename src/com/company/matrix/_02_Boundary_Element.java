package com.company.matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Boundary_Element {

    public static ArrayList<Integer> boundaryElement(int[][] arr, int R,int C){
        ArrayList<Integer> res = new ArrayList<>();
        if (R == 1){
            for (int i =0;i<C;i++)
                res.add(arr[0][i]);
        }else if(C == 1){
            for (int i=0; i<R;i++)
                res.add(arr[i][0]);
        }else {
            for (int i=0;i<C;i++)
                res.add(arr[0][i]);
            for (int i=1;i<R;i++)
                res.add(arr[i][C-1]);
            for (int i=C-2;i>=0;i-- )
                res.add(arr[R-1][i]);
            for (int i=R-2;i>0;i--)
                res.add(arr[i][0]);
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

        System.out.println(boundaryElement(arr,rw,cl));
    }
}
