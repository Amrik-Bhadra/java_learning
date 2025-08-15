package com.dsachallenge.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public void selectionSort(int[] arr, int n){
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
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

        SelectionSort selection = new SelectionSort();
        selection.selectionSort(arr, n);

        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}

/*
    Time Complexity:-
    1. Best: O(n^2)
    2. Avg: O(n^2)
    3. Worst: O(n^2)

    Space Complexity: O(1)

    Unstable sorting algorithm

 */