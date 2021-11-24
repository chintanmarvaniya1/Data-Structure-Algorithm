package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class  _02_Second_Largest_Element {

    //o(n 2)
    public static int secondLargestElementNive(ArrayList<Integer> arr){
        int largest = _01_Largest_element.getLargestElement(arr);
        int res= -1;
        for(int i = 0 ;i< arr.size(); i++){
            if (!arr.get(i).equals(arr.get(largest))){
                if (res == -1) {
                    res = i;
                }else if ( arr.get(i) > arr.get(res)){
                    res = i;
                }
            }
        }
        return res;
    }



    //o(n)
    public static int secondLargestElement(ArrayList<Integer> arr){
        int res=-1; int largest = 0 ;
        for(int i=1 ;i < arr.size(); i++){
            if (arr.get(i) > arr.get(largest)){
                res = largest;
                largest = i;
            }else if(res == -1 || arr.get(i) > arr.get(res)){
                    res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i< size;i++){
            arr.add(sc.nextInt());
        }

        System.out.println("Result => "+ arr.get(secondLargestElement(arr)));
        System.out.println("Result => "+ arr.get(secondLargestElementNive(arr)));
    }
}
