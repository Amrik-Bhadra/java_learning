package com.dsachallenge.searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int n, int target){
        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            else{
                if(arr[mid] > target) end = mid - 1;
                else start = mid + 1;
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

        int index = binarySearch(arr, n, target);
        System.out.println((index == -1) ? "Element not found" : "Element found at index: " + index);
    }
}
