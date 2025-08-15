package basics.arrays;
import java.util.Arrays;
public class Array_1D {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[5]; // 5 memoery location stored in heap initialed with 0
        // starting address (reference) store in arr2 in stack memory

        // array length
        int len = arr.length;  // length property
        for(int idx = 0; idx < len; idx++){
            System.out.print(arr[idx] + " ");
        }
        System.out.println();

        for(int ele: arr){
            System.out.print(ele + ", ");
        }
    }
}
