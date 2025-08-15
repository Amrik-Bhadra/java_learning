package com.dsachallenge.searching;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int n, int target){
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
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

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        int index = linearSearch(arr, n, target);
        System.out.println((index == -1) ? "Element not found" : "Element found at index: " + index);
    }
}
