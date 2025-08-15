package com.dsachallenge.sorting;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void swap(int[] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
    public void bubbleSort(int[] arr, int n){
        boolean flag = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    swap(arr, j);
                }
            }

            if(!flag) break;
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

        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(arr, n);

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

 */
