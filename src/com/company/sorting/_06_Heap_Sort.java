package com.company.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _06_Heap_Sort {


    //n log n
    // Improvement of selection Sort
    public static void buildHeap(ArrayList<Integer> arr) {
        for (int i = (arr.size() - 2) / 2; i >= 0; i--) {
            maxHeapify(arr, arr.size(), i);
        }
    }

    private static void maxHeapify(ArrayList<Integer> arr, int size, int i) {
        int large = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && arr.get(left) > arr.get(large))
            large = left;
        if (right < size && arr.get(right) > arr.get(large))
            large = right;
        if (large != i) {
            Collections.swap(arr, large, i);
            maxHeapify(arr, size, large);
        }
    }

    private static ArrayList<Integer> heapSort(ArrayList<Integer> arr) {
        buildHeap(arr);
        for (int i = arr.size() - 1; i >= 1; i--) {
            Collections.swap(arr, 0, i);
            maxHeapify(arr, i, 0);
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Initial Array =>" + arr);
        System.out.println("Result Array =>" + heapSort(arr));
    }
}
