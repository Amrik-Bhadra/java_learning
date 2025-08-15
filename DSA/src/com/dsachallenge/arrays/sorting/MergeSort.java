package com.dsachallenge.sorting;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0; i<n1; i++){
            leftArr[i] = arr[left + i];
        }

        for(int j=0; j<n2; j++){
            rightArr[j] = arr[mid + j + 1];
        }

//        System.arraycopy(arr, left + 0, leftArr, 0, n1);
//        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i=0, j=0, k = left;
        while(i < n1 && j < n2){
            if(leftArr[i] < rightArr[j]){
                arr[k++] = leftArr[i++];
            }else{
                arr[k++] = rightArr[j++];
            }
        }

        while(i < n1){
            arr[k++] = leftArr[i++];
        }

        while(j < n2){
            arr[k++] = rightArr[j++];
        }
    }

    public void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left)/2;

            // recusively divide the array into halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            // merge the halves
            merge(arr, left, mid, right);
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

        MergeSort merge = new MergeSort();
        merge.mergeSort(arr, 0, n-1);

        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}
