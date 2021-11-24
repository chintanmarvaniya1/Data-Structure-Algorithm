package com.company.array;



import java.util.ArrayList;
import java.util.Scanner;

public class _10_Maximum_Consecutive_Ones {

    public static int countConsecutiveOnes(ArrayList<Integer> arr){
        int res = 0;
        int curr = 0;
        for(int i=0 ; i<arr.size();i++){
            if (arr.get(i) == 1){
                curr++;
                res = Math.max(res,curr);
            }else
                curr = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Result => " + countConsecutiveOnes(arr));
    }
}
