package com.company.searching;

import java.util.Scanner;

public class _07_Find_Square_Root {

    public static int findSquareRoot(int ele){
        int low = 0;
        int high = ele;
        int ans =  -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int square = mid * mid;
            if (square == ele)
                return mid;
            else if ( square > ele)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ele =sc.nextInt();

        if (findSquareRoot(ele) > 0)
            System.out.println("Result => "+ findSquareRoot(ele));

    }
}
