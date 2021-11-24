package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class _08_Stock_Buy_Sell {

    //o(n 2)
    //if price is greater than preveious day than find profit of those two days + all its previous day + of its upcoming days
    // if it is maximum than swap
    public static int stockBuySellBasic(ArrayList<Integer> arr, int start, int end){
        if (end <= start)
            return 0;
        int max_profit = 0;
        for (int i =start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if (arr.get(j) > arr.get(i)){
                    int curr_pro = arr.get(j) - arr.get(i) +
                            stockBuySellBasic(arr,start,i-1)+
                            stockBuySellBasic(arr,j+1,end);
                    max_profit = Math.max(max_profit,curr_pro);
                }
            }
        }
        return max_profit;
    }


    //o(n)  price are decresing than do nothing
    // if price are increasing than add this price to the profit
    public static int stockBuySell(ArrayList<Integer> arr){
        int profit=0;
        for(int i = 1; i< arr.size() ;i++){
            if (arr.get(i) > arr.get(i-1))
                profit += arr.get(i) - arr.get(i-1);
        }
        return profit;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Result => "+ stockBuySellBasic(arr,0,arr.size()-1));
        System.out.println("Result => "+stockBuySell(arr));

    }
}
