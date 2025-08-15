package com.dsachallenge.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(int[] arr, int n){
        for(int i=1; i<n; i++){
            int ele = arr[i];
            int j=i-1;

            while(j >= 0 && arr[j] > ele){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = ele;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " numbers: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sort: " + Arrays.toString(arr));

        InsertionSort insertion = new InsertionSort();
        insertion.insertionSort(arr, n);

        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}

/*
    Time Complexity:-
    1. Best: O(n)
    2. Avg: O(n^2)
    3. Worst: O(n^2)

    Space Complexity: O(1)

    Stable sorting algorithm

    suitable for small or nearly sorted arrays

 */