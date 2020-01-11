package chp8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort{
    static void quickSort(int[] arr, int start, int end){
        if (start <end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot, end);
        }
        return;
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start;
        int temp;
        for (int j= start; j<end; j++){
            if (arr[j] <= pivot){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 1;
            }
        }
        temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,12,5,111,200,1000,10};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));    
    }
}