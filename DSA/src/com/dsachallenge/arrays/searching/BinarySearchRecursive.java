package com.dsachallenge.searching;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static int binarySearchRecur(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        else{
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) return binarySearchRecur(arr, target, start, mid-1);
            else return binarySearchRecur(arr, target, mid+1, end);
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

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        int index = binarySearchRecur(arr, target, 0, n-1);
        System.out.println((index == -1) ? "Element not found" : "Element found at index: " + index);
    }
}
